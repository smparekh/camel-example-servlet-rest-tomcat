/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.examples.rest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * A {@link com.redhat.examples.rest.Provider} service which we rest enable from the {@link com.redhat.examples.rest.RestRouteBuilder}.
 */
public class ProviderService {

    // use a tree map so they become sorted
    private final Map<String, Provider> providers = new TreeMap<String, Provider>();
    
    private static final Log LOG = LogFactory.getLog(ProviderService.class);

    public ProviderService() {
        providers.put("123", new Provider(123, "John", "Doe", "555-555-5555", "000 Deer St. Edison, NJ", "11111"));
        providers.put("456", new Provider(456, "Donald", "Duck", "123-456-7890", "100 Disleyland Way Orlando, FL", "11111"));
        providers.put("789", new Provider(789, "Barack", "Obama", "201-867-5309", "1500 Pennsylvania Av. Washington D.C.", "11112"));
    }

    /**
     * Gets a user by the given id
     *
     * @param id  the id of the user
     * @return the user, or <code>null</code> if no user exists
     */
    public Provider getProvider(String id) {
        return providers.get(id);
    }

    /**
     * List all users
     *
     * @return the list of all users
     */
    public Collection<Provider> listProviders() {
        return providers.values();
    }

    /**
     * Updates or creates the given user
     *
     * @param user the user
     */
    public String updateProvider(Provider user) {
        providers.put("" + user.getId(), user);
        return "Added: " + user.getLastName() + ", " + user.getFirstName();
    }
    
    public Collection<Provider> searchByZip(String zip) {
    	zip.trim();
    	List<Provider> searchResults = new ArrayList<Provider>();
    	for (Map.Entry<String, Provider> entry : providers.entrySet())
    	{
    		if (entry.getValue().getZipCode().equalsIgnoreCase(zip))
    		{
    			searchResults.add(entry.getValue());
    		}
    	}    	
    	return searchResults;
    }
}