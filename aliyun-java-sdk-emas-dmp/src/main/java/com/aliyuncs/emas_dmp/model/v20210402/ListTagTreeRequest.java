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

package com.aliyuncs.emas_dmp.model.v20210402;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emas_dmp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTagTreeRequest extends RpcAcsRequest<ListTagTreeResponse> {
	   

	private String businessScenario;

	private String tagType;
	public ListTagTreeRequest() {
		super("emas-dmp", "2021-04-02", "ListTagTree");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBusinessScenario() {
		return this.businessScenario;
	}

	public void setBusinessScenario(String businessScenario) {
		this.businessScenario = businessScenario;
		if(businessScenario != null){
			putBodyParameter("BusinessScenario", businessScenario);
		}
	}

	public String getTagType() {
		return this.tagType;
	}

	public void setTagType(String tagType) {
		this.tagType = tagType;
		if(tagType != null){
			putBodyParameter("TagType", tagType);
		}
	}

	@Override
	public Class<ListTagTreeResponse> getResponseClass() {
		return ListTagTreeResponse.class;
	}

}
