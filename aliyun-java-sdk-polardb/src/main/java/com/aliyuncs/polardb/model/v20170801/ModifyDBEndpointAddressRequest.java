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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBEndpointAddressRequest extends RpcAcsRequest<ModifyDBEndpointAddressResponse> {
	   

	private Long resourceOwnerId;

	private String connectionStringPrefix;

	private String dBEndpointId;

	private String privateZoneName;

	private String privateZoneAddressPrefix;

	private String resourceOwnerAccount;

	private String dBClusterId;

	private String ownerAccount;

	private Long ownerId;

	private String port;

	private String netType;
	public ModifyDBEndpointAddressRequest() {
		super("polardb", "2017-08-01", "ModifyDBEndpointAddress");
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

	public String getConnectionStringPrefix() {
		return this.connectionStringPrefix;
	}

	public void setConnectionStringPrefix(String connectionStringPrefix) {
		this.connectionStringPrefix = connectionStringPrefix;
		if(connectionStringPrefix != null){
			putQueryParameter("ConnectionStringPrefix", connectionStringPrefix);
		}
	}

	public String getDBEndpointId() {
		return this.dBEndpointId;
	}

	public void setDBEndpointId(String dBEndpointId) {
		this.dBEndpointId = dBEndpointId;
		if(dBEndpointId != null){
			putQueryParameter("DBEndpointId", dBEndpointId);
		}
	}

	public String getPrivateZoneName() {
		return this.privateZoneName;
	}

	public void setPrivateZoneName(String privateZoneName) {
		this.privateZoneName = privateZoneName;
		if(privateZoneName != null){
			putQueryParameter("PrivateZoneName", privateZoneName);
		}
	}

	public String getPrivateZoneAddressPrefix() {
		return this.privateZoneAddressPrefix;
	}

	public void setPrivateZoneAddressPrefix(String privateZoneAddressPrefix) {
		this.privateZoneAddressPrefix = privateZoneAddressPrefix;
		if(privateZoneAddressPrefix != null){
			putQueryParameter("PrivateZoneAddressPrefix", privateZoneAddressPrefix);
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

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
		if(port != null){
			putQueryParameter("Port", port);
		}
	}

	public String getNetType() {
		return this.netType;
	}

	public void setNetType(String netType) {
		this.netType = netType;
		if(netType != null){
			putQueryParameter("NetType", netType);
		}
	}

	@Override
	public Class<ModifyDBEndpointAddressResponse> getResponseClass() {
		return ModifyDBEndpointAddressResponse.class;
	}

}
