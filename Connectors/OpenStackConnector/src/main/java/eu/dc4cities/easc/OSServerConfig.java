/*
 * Copyright 2016 The DC4Cities author.
 *
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
 */

package eu.dc4cities.easc;

import eu.dc4cities.easc.configuration.ServerConfig;
import eu.dc4cities.easc.resource.Server;

import java.util.List;

public class OSServerConfig implements ServerConfig {
	public String configDirectory;
	
    @Override
    public List<Server> getServers() {
		//read CF parameters for application
		//CloudFoundryConfig cfConfig = CFConfigReader.readCloudFoundryConfig(configDirectory).get();

		//Provision CF instance
		//PaaSController cfCli = new CFController(cfConfig.getApiEndpoint(), cfConfig.getUsername(), cfConfig.getPassword();
		//cfCli.login();
        //return cfCli.getDEAsServers();
    	return null;
    }

}
