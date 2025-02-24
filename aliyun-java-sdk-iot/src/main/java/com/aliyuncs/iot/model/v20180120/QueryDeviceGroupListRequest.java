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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryDeviceGroupListRequest extends RpcAcsRequest<QueryDeviceGroupListResponse> {
	   

	private List<String> groupTypess;

	private String superGroupId;

	private String iotInstanceId;

	private Integer pageSize;

	private Integer currentPage;

	private String groupName;
	public QueryDeviceGroupListRequest() {
		super("Iot", "2018-01-20", "QueryDeviceGroupList");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getGroupTypess() {
		return this.groupTypess;
	}

	public void setGroupTypess(List<String> groupTypess) {
		this.groupTypess = groupTypess;	
		if (groupTypess != null) {
			for (int i = 0; i < groupTypess.size(); i++) {
				putQueryParameter("GroupTypes." + (i + 1) , groupTypess.get(i));
			}
		}	
	}

	public String getSuperGroupId() {
		return this.superGroupId;
	}

	public void setSuperGroupId(String superGroupId) {
		this.superGroupId = superGroupId;
		if(superGroupId != null){
			putQueryParameter("SuperGroupId", superGroupId);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	@Override
	public Class<QueryDeviceGroupListResponse> getResponseClass() {
		return QueryDeviceGroupListResponse.class;
	}

}
