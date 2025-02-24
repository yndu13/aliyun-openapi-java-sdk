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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeCasterConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCasterConfigResponse extends AcsResponse {

	private String requestId;

	private String casterId;

	private String casterName;

	private String domainName;

	private String sideOutputUrlList;

	private Float delay;

	private String urgentMaterialId;

	private String sideOutputUrl;

	private String callbackUrl;

	private String programName;

	private Integer programEffect;

	private Integer channelEnable;

	private List<SyncGroup> syncGroupsConfig;

	private TranscodeConfig transcodeConfig;

	private RecordConfig recordConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCasterId() {
		return this.casterId;
	}

	public void setCasterId(String casterId) {
		this.casterId = casterId;
	}

	public String getCasterName() {
		return this.casterName;
	}

	public void setCasterName(String casterName) {
		this.casterName = casterName;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getSideOutputUrlList() {
		return this.sideOutputUrlList;
	}

	public void setSideOutputUrlList(String sideOutputUrlList) {
		this.sideOutputUrlList = sideOutputUrlList;
	}

	public Float getDelay() {
		return this.delay;
	}

	public void setDelay(Float delay) {
		this.delay = delay;
	}

	public String getUrgentMaterialId() {
		return this.urgentMaterialId;
	}

	public void setUrgentMaterialId(String urgentMaterialId) {
		this.urgentMaterialId = urgentMaterialId;
	}

	public String getSideOutputUrl() {
		return this.sideOutputUrl;
	}

	public void setSideOutputUrl(String sideOutputUrl) {
		this.sideOutputUrl = sideOutputUrl;
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getProgramName() {
		return this.programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public Integer getProgramEffect() {
		return this.programEffect;
	}

	public void setProgramEffect(Integer programEffect) {
		this.programEffect = programEffect;
	}

	public Integer getChannelEnable() {
		return this.channelEnable;
	}

	public void setChannelEnable(Integer channelEnable) {
		this.channelEnable = channelEnable;
	}

	public List<SyncGroup> getSyncGroupsConfig() {
		return this.syncGroupsConfig;
	}

	public void setSyncGroupsConfig(List<SyncGroup> syncGroupsConfig) {
		this.syncGroupsConfig = syncGroupsConfig;
	}

	public TranscodeConfig getTranscodeConfig() {
		return this.transcodeConfig;
	}

	public void setTranscodeConfig(TranscodeConfig transcodeConfig) {
		this.transcodeConfig = transcodeConfig;
	}

	public RecordConfig getRecordConfig() {
		return this.recordConfig;
	}

	public void setRecordConfig(RecordConfig recordConfig) {
		this.recordConfig = recordConfig;
	}

	public static class SyncGroup {

		private Integer mode;

		private String hostResourceId;

		private List<String> resourceIds;

		public Integer getMode() {
			return this.mode;
		}

		public void setMode(Integer mode) {
			this.mode = mode;
		}

		public String getHostResourceId() {
			return this.hostResourceId;
		}

		public void setHostResourceId(String hostResourceId) {
			this.hostResourceId = hostResourceId;
		}

		public List<String> getResourceIds() {
			return this.resourceIds;
		}

		public void setResourceIds(List<String> resourceIds) {
			this.resourceIds = resourceIds;
		}
	}

	public static class TranscodeConfig {

		private String casterTemplate;

		private List<String> liveTemplateIds;

		public String getCasterTemplate() {
			return this.casterTemplate;
		}

		public void setCasterTemplate(String casterTemplate) {
			this.casterTemplate = casterTemplate;
		}

		public List<String> getLiveTemplateIds() {
			return this.liveTemplateIds;
		}

		public void setLiveTemplateIds(List<String> liveTemplateIds) {
			this.liveTemplateIds = liveTemplateIds;
		}
	}

	public static class RecordConfig {

		private String ossEndpoint;

		private String ossBucket;

		private List<RecordFormatItem> recordFormat;

		public String getOssEndpoint() {
			return this.ossEndpoint;
		}

		public void setOssEndpoint(String ossEndpoint) {
			this.ossEndpoint = ossEndpoint;
		}

		public String getOssBucket() {
			return this.ossBucket;
		}

		public void setOssBucket(String ossBucket) {
			this.ossBucket = ossBucket;
		}

		public List<RecordFormatItem> getRecordFormat() {
			return this.recordFormat;
		}

		public void setRecordFormat(List<RecordFormatItem> recordFormat) {
			this.recordFormat = recordFormat;
		}

		public static class RecordFormatItem {

			private String format;

			private String ossObjectPrefix;

			private String sliceOssObjectPrefix;

			private Integer cycleDuration;

			public String getFormat() {
				return this.format;
			}

			public void setFormat(String format) {
				this.format = format;
			}

			public String getOssObjectPrefix() {
				return this.ossObjectPrefix;
			}

			public void setOssObjectPrefix(String ossObjectPrefix) {
				this.ossObjectPrefix = ossObjectPrefix;
			}

			public String getSliceOssObjectPrefix() {
				return this.sliceOssObjectPrefix;
			}

			public void setSliceOssObjectPrefix(String sliceOssObjectPrefix) {
				this.sliceOssObjectPrefix = sliceOssObjectPrefix;
			}

			public Integer getCycleDuration() {
				return this.cycleDuration;
			}

			public void setCycleDuration(Integer cycleDuration) {
				this.cycleDuration = cycleDuration;
			}
		}
	}

	@Override
	public DescribeCasterConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeCasterConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
