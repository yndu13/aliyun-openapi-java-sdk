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

package com.aliyuncs.iotcc.model.v20210513;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListGroupAuthorizationRulesRequest extends RpcAcsRequest<ListGroupAuthorizationRulesResponse> {
	   

	private List<String> destinationTypes;

	private List<String> destinations;

	private String type;

	private List<String> authorizationRuleIdss;

	private String nextToken;

	private List<String> policys;

	private List<String> authorizationRuleStatuss;

	private String ioTCloudConnectorGroupId;

	private List<String> authorizationRuleNames;

	private Integer maxResults;
	public ListGroupAuthorizationRulesRequest() {
		super("IoTCC", "2021-05-13", "ListGroupAuthorizationRules", "IoTCC");
		setMethod(MethodType.POST);
	}

	public List<String> getDestinationTypes() {
		return this.destinationTypes;
	}

	public void setDestinationTypes(List<String> destinationTypes) {
		this.destinationTypes = destinationTypes;	
		if (destinationTypes != null) {
			for (int i = 0; i < destinationTypes.size(); i++) {
				putQueryParameter("DestinationType." + (i + 1) , destinationTypes.get(i));
			}
		}	
	}

	public List<String> getDestinations() {
		return this.destinations;
	}

	public void setDestinations(List<String> destinations) {
		this.destinations = destinations;	
		if (destinations != null) {
			for (int i = 0; i < destinations.size(); i++) {
				putQueryParameter("Destination." + (i + 1) , destinations.get(i));
			}
		}	
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public List<String> getAuthorizationRuleIdss() {
		return this.authorizationRuleIdss;
	}

	public void setAuthorizationRuleIdss(List<String> authorizationRuleIdss) {
		this.authorizationRuleIdss = authorizationRuleIdss;	
		if (authorizationRuleIdss != null) {
			for (int i = 0; i < authorizationRuleIdss.size(); i++) {
				putQueryParameter("AuthorizationRuleIds." + (i + 1) , authorizationRuleIdss.get(i));
			}
		}	
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public List<String> getPolicys() {
		return this.policys;
	}

	public void setPolicys(List<String> policys) {
		this.policys = policys;	
		if (policys != null) {
			for (int i = 0; i < policys.size(); i++) {
				putQueryParameter("Policy." + (i + 1) , policys.get(i));
			}
		}	
	}

	public List<String> getAuthorizationRuleStatuss() {
		return this.authorizationRuleStatuss;
	}

	public void setAuthorizationRuleStatuss(List<String> authorizationRuleStatuss) {
		this.authorizationRuleStatuss = authorizationRuleStatuss;	
		if (authorizationRuleStatuss != null) {
			for (int i = 0; i < authorizationRuleStatuss.size(); i++) {
				putQueryParameter("AuthorizationRuleStatus." + (i + 1) , authorizationRuleStatuss.get(i));
			}
		}	
	}

	public String getIoTCloudConnectorGroupId() {
		return this.ioTCloudConnectorGroupId;
	}

	public void setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
		this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
		if(ioTCloudConnectorGroupId != null){
			putQueryParameter("IoTCloudConnectorGroupId", ioTCloudConnectorGroupId);
		}
	}

	public List<String> getAuthorizationRuleNames() {
		return this.authorizationRuleNames;
	}

	public void setAuthorizationRuleNames(List<String> authorizationRuleNames) {
		this.authorizationRuleNames = authorizationRuleNames;	
		if (authorizationRuleNames != null) {
			for (int i = 0; i < authorizationRuleNames.size(); i++) {
				putQueryParameter("AuthorizationRuleName." + (i + 1) , authorizationRuleNames.get(i));
			}
		}	
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<ListGroupAuthorizationRulesResponse> getResponseClass() {
		return ListGroupAuthorizationRulesResponse.class;
	}

}
