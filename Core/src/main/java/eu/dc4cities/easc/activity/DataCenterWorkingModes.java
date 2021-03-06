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

package eu.dc4cities.easc.activity;

import eu.dc4cities.easc.workingmode.WorkingMode;

import java.util.List;


/**
 * Working modes able to run in a DC
 */
public class DataCenterWorkingModes {
	private String dataCenterName;
	private String defaultWorkingMode;
	private List<WorkingMode> workingModes;
	private WorkingMode currentWorkingMode;
	
	public DataCenterWorkingModes() {
	}

	/**
	 * Returns the name of the data center in which the activity can be executed.
	 * 
	 * @return the data center name
	 */
	public String getDataCenterName() {
		return dataCenterName;
	}

	public void setDataCenterName(String dataCenterName) {
		this.dataCenterName = dataCenterName;
	}

	/**
	 * Returns the name of the default working mode for the data center. This is the minimum working mode in which the
	 * activity can run on the data center, e.g. for keeping the essential control daemons on and be able to activate
	 * higher working modes when necessary.
	 * 
	 * @return the data center default working mode
	 */
	public String getDefaultWorkingMode() {
		return defaultWorkingMode;
	}

	public void setDefaultWorkingMode(String defaultWorkingMode) {
		this.defaultWorkingMode = defaultWorkingMode;
	}

	/**
	 * Returns the list of working modes that can be used to run the activity in this data center.
	 * 
	 * @return the list of working modes
	 */
	public List<WorkingMode> getWorkingModes() {
		return workingModes;
	}

	public void setWorkingModes(List<WorkingMode> workingModes) {
		this.workingModes = workingModes;
	}

	public void setCurrentWorkingMode(WorkingMode w) {
		this.currentWorkingMode = w;		
	}
	
	public WorkingMode getCurrentWorkingMode() {
		return this.currentWorkingMode;		
	}

	public void initCurrentWorkingMode() {
		for(WorkingMode wm: this.workingModes) {
			if(wm.getName().equals(this.defaultWorkingMode)) {
				this.currentWorkingMode = wm;
				return;
			}
		}
	}
}