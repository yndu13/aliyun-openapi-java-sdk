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

package com.aliyuncs.antiddos_public.model.v20170518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeDdosCountRequest extends RpcAcsRequest<DescribeDdosCountResponse> {
	   

	private String ddosRegionId;

	private String instanceType;
	public DescribeDdosCountRequest() {
		super("antiddos-public", "2017-05-18", "DescribeDdosCount");
		setMethod(MethodType.POST);
	}

	public String getDdosRegionId() {
		return this.ddosRegionId;
	}

	public void setDdosRegionId(String ddosRegionId) {
		this.ddosRegionId = ddosRegionId;
		if(ddosRegionId != null){
			putQueryParameter("DdosRegionId", ddosRegionId);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	@Override
	public Class<DescribeDdosCountResponse> getResponseClass() {
		return DescribeDdosCountResponse.class;
	}

}
