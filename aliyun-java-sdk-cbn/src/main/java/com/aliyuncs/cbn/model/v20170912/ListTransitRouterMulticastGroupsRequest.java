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

package com.aliyuncs.cbn.model.v20170912;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cbn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTransitRouterMulticastGroupsRequest extends RpcAcsRequest<ListTransitRouterMulticastGroupsResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private List<String> vSwitchIdss;

	private String transitRouterMulticastDomainId;

	private String nextToken;

	private String groupIpAddress;

	private String resourceId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private List<String> peerTransitRouterMulticastDomainss;

	private Long ownerId;

	private String resourceType;

	private String transitRouterAttachmentId;

	private Long maxResults;
	public ListTransitRouterMulticastGroupsRequest() {
		super("Cbn", "2017-09-12", "ListTransitRouterMulticastGroups");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public List<String> getVSwitchIdss() {
		return this.vSwitchIdss;
	}

	public void setVSwitchIdss(List<String> vSwitchIdss) {
		this.vSwitchIdss = vSwitchIdss;	
		if (vSwitchIdss != null) {
			for (int i = 0; i < vSwitchIdss.size(); i++) {
				putQueryParameter("VSwitchIds." + (i + 1) , vSwitchIdss.get(i));
			}
		}	
	}

	public String getTransitRouterMulticastDomainId() {
		return this.transitRouterMulticastDomainId;
	}

	public void setTransitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
		this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
		if(transitRouterMulticastDomainId != null){
			putQueryParameter("TransitRouterMulticastDomainId", transitRouterMulticastDomainId);
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

	public String getGroupIpAddress() {
		return this.groupIpAddress;
	}

	public void setGroupIpAddress(String groupIpAddress) {
		this.groupIpAddress = groupIpAddress;
		if(groupIpAddress != null){
			putQueryParameter("GroupIpAddress", groupIpAddress);
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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public List<String> getPeerTransitRouterMulticastDomainss() {
		return this.peerTransitRouterMulticastDomainss;
	}

	public void setPeerTransitRouterMulticastDomainss(List<String> peerTransitRouterMulticastDomainss) {
		this.peerTransitRouterMulticastDomainss = peerTransitRouterMulticastDomainss;	
		if (peerTransitRouterMulticastDomainss != null) {
			for (int i = 0; i < peerTransitRouterMulticastDomainss.size(); i++) {
				putQueryParameter("PeerTransitRouterMulticastDomains." + (i + 1) , peerTransitRouterMulticastDomainss.get(i));
			}
		}	
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getTransitRouterAttachmentId() {
		return this.transitRouterAttachmentId;
	}

	public void setTransitRouterAttachmentId(String transitRouterAttachmentId) {
		this.transitRouterAttachmentId = transitRouterAttachmentId;
		if(transitRouterAttachmentId != null){
			putQueryParameter("TransitRouterAttachmentId", transitRouterAttachmentId);
		}
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<ListTransitRouterMulticastGroupsResponse> getResponseClass() {
		return ListTransitRouterMulticastGroupsResponse.class;
	}

}
