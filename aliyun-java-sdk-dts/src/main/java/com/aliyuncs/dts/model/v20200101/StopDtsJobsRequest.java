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

package com.aliyuncs.dts.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class StopDtsJobsRequest extends RpcAcsRequest<StopDtsJobsResponse> {
	   

	private String dtsJobIds;
	public StopDtsJobsRequest() {
		super("Dts", "2020-01-01", "StopDtsJobs", "dts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDtsJobIds() {
		return this.dtsJobIds;
	}

	public void setDtsJobIds(String dtsJobIds) {
		this.dtsJobIds = dtsJobIds;
		if(dtsJobIds != null){
			putQueryParameter("DtsJobIds", dtsJobIds);
		}
	}

	@Override
	public Class<StopDtsJobsResponse> getResponseClass() {
		return StopDtsJobsResponse.class;
	}

}
