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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.ListAgentStatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAgentStatesResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<RealTimeAgentState> list;

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<RealTimeAgentState> getList() {
			return this.list;
		}

		public void setList(List<RealTimeAgentState> list) {
			this.list = list;
		}

		public static class RealTimeAgentState {

			private String loginName;

			private String dn;

			private String stateDuration;

			private String state;

			private String agentId;

			private String agentName;

			private String instanceId;

			private String breakCode;

			public String getLoginName() {
				return this.loginName;
			}

			public void setLoginName(String loginName) {
				this.loginName = loginName;
			}

			public String getDn() {
				return this.dn;
			}

			public void setDn(String dn) {
				this.dn = dn;
			}

			public String getStateDuration() {
				return this.stateDuration;
			}

			public void setStateDuration(String stateDuration) {
				this.stateDuration = stateDuration;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getAgentId() {
				return this.agentId;
			}

			public void setAgentId(String agentId) {
				this.agentId = agentId;
			}

			public String getAgentName() {
				return this.agentName;
			}

			public void setAgentName(String agentName) {
				this.agentName = agentName;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getBreakCode() {
				return this.breakCode;
			}

			public void setBreakCode(String breakCode) {
				this.breakCode = breakCode;
			}
		}
	}

	@Override
	public ListAgentStatesResponse getInstance(UnmarshallerContext context) {
		return	ListAgentStatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
