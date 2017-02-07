/**
 * 
 */
package com.thinkbiganalytics.metadata.api.sla;

/*-
 * #%L
 * thinkbig-metadata-api
 * %%
 * Copyright (C) 2017 ThinkBig Analytics
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.thinkbiganalytics.metadata.sla.api.Metric;

/**
 *
 */
public abstract class DependentDatasource implements Metric {
    
    private String datasourceName;
    private String feedName;
    
    public DependentDatasource() {
    }

    public DependentDatasource(String datasetName) {
        this(null, datasetName);
    }
    
    public DependentDatasource(String feedName, String datasetName) {
        super();
        this.feedName = feedName;
        this.datasourceName = datasetName;
    }

    public String getDatasourceName() {
        return datasourceName;
    }
    
    public String getFeedName() {
        return feedName;
    }

    public void setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
    }

    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }
    
}
