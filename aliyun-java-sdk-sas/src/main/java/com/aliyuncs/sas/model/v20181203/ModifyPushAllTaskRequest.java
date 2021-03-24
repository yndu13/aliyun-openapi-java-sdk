/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyPushAllTaskRequest extends RpcAcsRequest<ModifyPushAllTaskResponse> {
	   

	private String sourceIp;

	private String tasks;

	private String uuids;
	public ModifyPushAllTaskRequest() {
		super("Sas", "2018-12-03", "ModifyPushAllTask", "sas");
		setMethod(MethodType.POST);
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getTasks() {
		return this.tasks;
	}

	public void setTasks(String tasks) {
		this.tasks = tasks;
		if(tasks != null){
			putQueryParameter("Tasks", tasks);
		}
	}

	public String getUuids() {
		return this.uuids;
	}

	public void setUuids(String uuids) {
		this.uuids = uuids;
		if(uuids != null){
			putQueryParameter("Uuids", uuids);
		}
	}

	@Override
	public Class<ModifyPushAllTaskResponse> getResponseClass() {
		return ModifyPushAllTaskResponse.class;
	}

}
