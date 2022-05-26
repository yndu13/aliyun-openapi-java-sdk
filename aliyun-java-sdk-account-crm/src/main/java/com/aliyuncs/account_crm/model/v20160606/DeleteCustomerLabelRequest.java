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
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteCustomerLabelRequest extends RpcAcsRequest<DeleteCustomerLabelResponse> {
	   

	private String labelSeries;

	private String organization;

	private Long pK;

	private List<String> labelTypess;

	private String userName;

	private String token;
	public DeleteCustomerLabelRequest() {
		super("account-crm", "2016-06-06", "DeleteCustomerLabel");
		setMethod(MethodType.POST);
	}

	public String getLabelSeries() {
		return this.labelSeries;
	}

	public void setLabelSeries(String labelSeries) {
		this.labelSeries = labelSeries;
		if(labelSeries != null){
			putQueryParameter("LabelSeries", labelSeries);
		}
	}

	public String getOrganization() {
		return this.organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
		if(organization != null){
			putQueryParameter("Organization", organization);
		}
	}

	public Long getPK() {
		return this.pK;
	}

	public void setPK(Long pK) {
		this.pK = pK;
		if(pK != null){
			putQueryParameter("PK", pK.toString());
		}
	}

	public List<String> getLabelTypess() {
		return this.labelTypess;
	}

	public void setLabelTypess(List<String> labelTypess) {
		this.labelTypess = labelTypess;	
		if (labelTypess != null) {
			for (int i = 0; i < labelTypess.size(); i++) {
				putQueryParameter("LabelTypes." + (i + 1) , labelTypess.get(i));
			}
		}	
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	@Override
	public Class<DeleteCustomerLabelResponse> getResponseClass() {
		return DeleteCustomerLabelResponse.class;
	}

}
