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

package com.aliyuncs.privatelink.model.v20200415;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.privatelink.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListVpcEndpointConnectionsRequest extends RpcAcsRequest<ListVpcEndpointConnectionsResponse> {
	   

	private String endpointId;

	private Long endpointOwnerId;

	private String replacedResourceId;

	private String nextToken;

	private String resourceId;

	private String connectionStatus;

	private Integer maxResults;

	private String eniId;

	private String serviceId;
	public ListVpcEndpointConnectionsRequest() {
		super("Privatelink", "2020-04-15", "ListVpcEndpointConnections", "privatelink");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEndpointId() {
		return this.endpointId;
	}

	public void setEndpointId(String endpointId) {
		this.endpointId = endpointId;
		if(endpointId != null){
			putQueryParameter("EndpointId", endpointId);
		}
	}

	public Long getEndpointOwnerId() {
		return this.endpointOwnerId;
	}

	public void setEndpointOwnerId(Long endpointOwnerId) {
		this.endpointOwnerId = endpointOwnerId;
		if(endpointOwnerId != null){
			putQueryParameter("EndpointOwnerId", endpointOwnerId.toString());
		}
	}

	public String getReplacedResourceId() {
		return this.replacedResourceId;
	}

	public void setReplacedResourceId(String replacedResourceId) {
		this.replacedResourceId = replacedResourceId;
		if(replacedResourceId != null){
			putQueryParameter("ReplacedResourceId", replacedResourceId);
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

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
		}
	}

	public String getConnectionStatus() {
		return this.connectionStatus;
	}

	public void setConnectionStatus(String connectionStatus) {
		this.connectionStatus = connectionStatus;
		if(connectionStatus != null){
			putQueryParameter("ConnectionStatus", connectionStatus);
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

	public String getEniId() {
		return this.eniId;
	}

	public void setEniId(String eniId) {
		this.eniId = eniId;
		if(eniId != null){
			putQueryParameter("EniId", eniId);
		}
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
		if(serviceId != null){
			putQueryParameter("ServiceId", serviceId);
		}
	}

	@Override
	public Class<ListVpcEndpointConnectionsResponse> getResponseClass() {
		return ListVpcEndpointConnectionsResponse.class;
	}

}
