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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeInvocationResultsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInvocationResultsResponse extends AcsResponse {

	private String requestId;

	private Invocation invocation;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Invocation getInvocation() {
		return this.invocation;
	}

	public void setInvocation(Invocation invocation) {
		this.invocation = invocation;
	}

	public static class Invocation {

		private Long pageSize;

		private Long pageNumber;

		private Long totalCount;

		private List<InvocationResult> invocationResults;

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Long pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<InvocationResult> getInvocationResults() {
			return this.invocationResults;
		}

		public void setInvocationResults(List<InvocationResult> invocationResults) {
			this.invocationResults = invocationResults;
		}

		public static class InvocationResult {

			private String invocationStatus;

			private Integer repeats;

			private String commandId;

			private String instanceId;

			private String output;

			private Integer dropped;

			private String stopTime;

			private Long exitCode;

			private String startTime;

			private String errorInfo;

			private String errorCode;

			private String finishedTime;

			private String invokeId;

			private String invokeRecordStatus;

			private String username;

			private List<Tag> tags;

			public String getInvocationStatus() {
				return this.invocationStatus;
			}

			public void setInvocationStatus(String invocationStatus) {
				this.invocationStatus = invocationStatus;
			}

			public Integer getRepeats() {
				return this.repeats;
			}

			public void setRepeats(Integer repeats) {
				this.repeats = repeats;
			}

			public String getCommandId() {
				return this.commandId;
			}

			public void setCommandId(String commandId) {
				this.commandId = commandId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getOutput() {
				return this.output;
			}

			public void setOutput(String output) {
				this.output = output;
			}

			public Integer getDropped() {
				return this.dropped;
			}

			public void setDropped(Integer dropped) {
				this.dropped = dropped;
			}

			public String getStopTime() {
				return this.stopTime;
			}

			public void setStopTime(String stopTime) {
				this.stopTime = stopTime;
			}

			public Long getExitCode() {
				return this.exitCode;
			}

			public void setExitCode(Long exitCode) {
				this.exitCode = exitCode;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getErrorInfo() {
				return this.errorInfo;
			}

			public void setErrorInfo(String errorInfo) {
				this.errorInfo = errorInfo;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public String getFinishedTime() {
				return this.finishedTime;
			}

			public void setFinishedTime(String finishedTime) {
				this.finishedTime = finishedTime;
			}

			public String getInvokeId() {
				return this.invokeId;
			}

			public void setInvokeId(String invokeId) {
				this.invokeId = invokeId;
			}

			public String getInvokeRecordStatus() {
				return this.invokeRecordStatus;
			}

			public void setInvokeRecordStatus(String invokeRecordStatus) {
				this.invokeRecordStatus = invokeRecordStatus;
			}

			public String getUsername() {
				return this.username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public List<Tag> getTags() {
				return this.tags;
			}

			public void setTags(List<Tag> tags) {
				this.tags = tags;
			}

			public static class Tag {

				private String tagKey;

				private String tagValue;

				public String getTagKey() {
					return this.tagKey;
				}

				public void setTagKey(String tagKey) {
					this.tagKey = tagKey;
				}

				public String getTagValue() {
					return this.tagValue;
				}

				public void setTagValue(String tagValue) {
					this.tagValue = tagValue;
				}
			}
		}
	}

	@Override
	public DescribeInvocationResultsResponse getInstance(UnmarshallerContext context) {
		return	DescribeInvocationResultsResponseUnmarshaller.unmarshall(this, context);
	}
}
