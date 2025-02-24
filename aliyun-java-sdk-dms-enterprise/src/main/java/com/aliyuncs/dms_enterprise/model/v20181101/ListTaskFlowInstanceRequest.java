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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTaskFlowInstanceRequest extends RpcAcsRequest<ListTaskFlowInstanceResponse> {
	   

	private Integer triggerType;

	private Long dagId;

	private Long tid;

	private Integer pageSize;

	private Integer pageIndex;

	private String startTimeBegin;

	private String startTimeEnd;
	public ListTaskFlowInstanceRequest() {
		super("dms-enterprise", "2018-11-01", "ListTaskFlowInstance", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getTriggerType() {
		return this.triggerType;
	}

	public void setTriggerType(Integer triggerType) {
		this.triggerType = triggerType;
		if(triggerType != null){
			putQueryParameter("TriggerType", triggerType.toString());
		}
	}

	public Long getDagId() {
		return this.dagId;
	}

	public void setDagId(Long dagId) {
		this.dagId = dagId;
		if(dagId != null){
			putQueryParameter("DagId", dagId.toString());
		}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
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

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putQueryParameter("PageIndex", pageIndex.toString());
		}
	}

	public String getStartTimeBegin() {
		return this.startTimeBegin;
	}

	public void setStartTimeBegin(String startTimeBegin) {
		this.startTimeBegin = startTimeBegin;
		if(startTimeBegin != null){
			putQueryParameter("StartTimeBegin", startTimeBegin);
		}
	}

	public String getStartTimeEnd() {
		return this.startTimeEnd;
	}

	public void setStartTimeEnd(String startTimeEnd) {
		this.startTimeEnd = startTimeEnd;
		if(startTimeEnd != null){
			putQueryParameter("StartTimeEnd", startTimeEnd);
		}
	}

	@Override
	public Class<ListTaskFlowInstanceResponse> getResponseClass() {
		return ListTaskFlowInstanceResponse.class;
	}

}
