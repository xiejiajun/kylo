package com.thinkbiganalytics.datalake.authorization.hdfs.sentry;

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import com.thinkbiganalytics.datalake.authorization.SentryClientConfig;

/**
 * Created by Shashi Vishwakarma on 19/9/2016.
 */

public class ApplyHDFSAcl {

	public ApplyHDFSAcl()
	{

	}

	/**
	 * 
	 * @param HadoopConfigurationResource
	 * @param category_name : Category Name
	 * @param feed_name : Feed Name 
	 * @param permission_level : Feed Permission Level
	 * @param groupList : Group List for Authorization
	 * @throws IOException 
	 */

	@SuppressWarnings("static-access")
	public boolean createAcl(String HadoopConfigurationResource, String category_name , String feed_name, String permission_level , String groupList) throws IOException {

		try {

			SentryClientConfig sentryConfig = new SentryClientConfig();
			HDFSUtil hdfsUtil = new HDFSUtil();

			Configuration conf = sentryConfig.getConfig(); 
			conf = hdfsUtil.getConfigurationFromResources(HadoopConfigurationResource);
			
			String allPathForAclCreation = hdfsUtil.constructResourceforPermissionHDFS(category_name, feed_name, permission_level);
			hdfsUtil.splitPathListAndApplyPolicy(allPathForAclCreation, conf, sentryConfig.getFileSystem() , groupList);
			
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IOException("Unable to create ACL " + e);

		}
	}

}
