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

package com.aliyuncs.slb.model.v20140515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.DescribeVServerGroupAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVServerGroupAttributeResponse extends AcsResponse {

	private String serviceManagedMode;

	private String vServerGroupId;

	private String vServerGroupName;

	private String requestId;

	private String loadBalancerId;

	private List<BackendServer> backendServers;

	public String getServiceManagedMode() {
		return this.serviceManagedMode;
	}

	public void setServiceManagedMode(String serviceManagedMode) {
		this.serviceManagedMode = serviceManagedMode;
	}

	public String getVServerGroupId() {
		return this.vServerGroupId;
	}

	public void setVServerGroupId(String vServerGroupId) {
		this.vServerGroupId = vServerGroupId;
	}

	public String getVServerGroupName() {
		return this.vServerGroupName;
	}

	public void setVServerGroupName(String vServerGroupName) {
		this.vServerGroupName = vServerGroupName;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
	}

	public List<BackendServer> getBackendServers() {
		return this.backendServers;
	}

	public void setBackendServers(List<BackendServer> backendServers) {
		this.backendServers = backendServers;
	}

	public static class BackendServer {

		private String vpcId;

		private String type;

		private Integer weight;

		private Boolean proxyProtocolV2Enabled;

		private String description;

		private String serverRegionId;

		private String serverIp;

		private Integer port;

		private String vbrId;

		private String serverId;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public Boolean getProxyProtocolV2Enabled() {
			return this.proxyProtocolV2Enabled;
		}

		public void setProxyProtocolV2Enabled(Boolean proxyProtocolV2Enabled) {
			this.proxyProtocolV2Enabled = proxyProtocolV2Enabled;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getServerRegionId() {
			return this.serverRegionId;
		}

		public void setServerRegionId(String serverRegionId) {
			this.serverRegionId = serverRegionId;
		}

		public String getServerIp() {
			return this.serverIp;
		}

		public void setServerIp(String serverIp) {
			this.serverIp = serverIp;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getVbrId() {
			return this.vbrId;
		}

		public void setVbrId(String vbrId) {
			this.vbrId = vbrId;
		}

		public String getServerId() {
			return this.serverId;
		}

		public void setServerId(String serverId) {
			this.serverId = serverId;
		}
	}

	@Override
	public DescribeVServerGroupAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeVServerGroupAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
