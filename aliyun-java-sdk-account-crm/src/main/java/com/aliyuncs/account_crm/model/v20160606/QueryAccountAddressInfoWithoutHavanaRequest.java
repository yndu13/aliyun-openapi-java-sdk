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

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryAccountAddressInfoWithoutHavanaRequest extends RpcAcsRequest<QueryAccountAddressInfoWithoutHavanaResponse> {
	   

	private String addressVersion;

	private String pK;

	private String havanaId;
	public QueryAccountAddressInfoWithoutHavanaRequest() {
		super("account-crm", "2016-06-06", "QueryAccountAddressInfoWithoutHavana");
		setMethod(MethodType.POST);
	}

	public String getAddressVersion() {
		return this.addressVersion;
	}

	public void setAddressVersion(String addressVersion) {
		this.addressVersion = addressVersion;
		if(addressVersion != null){
			putQueryParameter("AddressVersion", addressVersion);
		}
	}

	public String getPK() {
		return this.pK;
	}

	public void setPK(String pK) {
		this.pK = pK;
		if(pK != null){
			putQueryParameter("PK", pK);
		}
	}

	public String getHavanaId() {
		return this.havanaId;
	}

	public void setHavanaId(String havanaId) {
		this.havanaId = havanaId;
		if(havanaId != null){
			putQueryParameter("HavanaId", havanaId);
		}
	}

	@Override
	public Class<QueryAccountAddressInfoWithoutHavanaResponse> getResponseClass() {
		return QueryAccountAddressInfoWithoutHavanaResponse.class;
	}

}
