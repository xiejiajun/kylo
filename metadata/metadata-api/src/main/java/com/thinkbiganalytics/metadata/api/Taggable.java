/**
 * 
 */
package com.thinkbiganalytics.metadata.api;

/*-
 * #%L
 * kylo-metadata-api
 * %%
 * Copyright (C) 2017 - 2018 ThinkBig Analytics, a Teradata Company
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

import java.util.Set;

/**
 * Marks an entity a able to support tags.
 */
public interface Taggable {

    /**
     * @param tag the tag to check
     * @return true if the tag exists
     */
    boolean hasTag(String tag);
    
    /**
     * @return the current tags
     */
    Set<String> getTags();
    
    /**
     * @param tag the new tag
     * @return the current state of the tags after the add
     */
    Set<String> addTag(String tag);
    
    /**
     * @param tag the tag to remove
     * @return
     */
    Set<String> removeTag(String tag);
}
