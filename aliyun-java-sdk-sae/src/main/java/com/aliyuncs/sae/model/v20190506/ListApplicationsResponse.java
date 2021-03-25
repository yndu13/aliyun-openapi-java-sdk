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

package com.aliyuncs.sae.model.v20190506;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.ListApplicationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApplicationsResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String errorCode;

	private String code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

		private Integer pageSize;

		private Integer currentPage;

		private Integer totalSize;

		private List<Application> applications;

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Integer totalSize) {
			this.totalSize = totalSize;
		}

		public List<Application> getApplications() {
			return this.applications;
		}

		public void setApplications(List<Application> applications) {
			this.applications = applications;
		}

		public static class Application {

			private Integer instances;

			private Boolean scaleRuleEnabled;

			private String appDescription;

			private String appId;

			private Integer runningInstances;

			private String regionId;

			private String namespaceId;

			private String scaleRuleType;

			private Boolean appDeletingStatus;

			private String appName;

			private List<TagsItem> tags;

			public Integer getInstances() {
				return this.instances;
			}

			public void setInstances(Integer instances) {
				this.instances = instances;
			}

			public Boolean getScaleRuleEnabled() {
				return this.scaleRuleEnabled;
			}

			public void setScaleRuleEnabled(Boolean scaleRuleEnabled) {
				this.scaleRuleEnabled = scaleRuleEnabled;
			}

			public String getAppDescription() {
				return this.appDescription;
			}

			public void setAppDescription(String appDescription) {
				this.appDescription = appDescription;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public Integer getRunningInstances() {
				return this.runningInstances;
			}

			public void setRunningInstances(Integer runningInstances) {
				this.runningInstances = runningInstances;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getNamespaceId() {
				return this.namespaceId;
			}

			public void setNamespaceId(String namespaceId) {
				this.namespaceId = namespaceId;
			}

			public String getScaleRuleType() {
				return this.scaleRuleType;
			}

			public void setScaleRuleType(String scaleRuleType) {
				this.scaleRuleType = scaleRuleType;
			}

			public Boolean getAppDeletingStatus() {
				return this.appDeletingStatus;
			}

			public void setAppDeletingStatus(Boolean appDeletingStatus) {
				this.appDeletingStatus = appDeletingStatus;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public List<TagsItem> getTags() {
				return this.tags;
			}

			public void setTags(List<TagsItem> tags) {
				this.tags = tags;
			}

			public static class TagsItem {

				private String value;

				private String key;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}
			}
		}
	}

	@Override
	public ListApplicationsResponse getInstance(UnmarshallerContext context) {
		return	ListApplicationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
