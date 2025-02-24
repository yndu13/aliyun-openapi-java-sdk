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

package com.aliyuncs.dcdn.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnDomainWebsocketHttpCodeDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnDomainWebsocketHttpCodeDataResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String startTime;

	private String endTime;

	private String dataInterval;

	private List<DataModule> httpCodeDataPerInterval;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(String dataInterval) {
		this.dataInterval = dataInterval;
	}

	public List<DataModule> getHttpCodeDataPerInterval() {
		return this.httpCodeDataPerInterval;
	}

	public void setHttpCodeDataPerInterval(List<DataModule> httpCodeDataPerInterval) {
		this.httpCodeDataPerInterval = httpCodeDataPerInterval;
	}

	public static class DataModule {

		private String timeStamp;

		private List<HttpCodeDataModule> websocketHttpCode;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public List<HttpCodeDataModule> getWebsocketHttpCode() {
			return this.websocketHttpCode;
		}

		public void setWebsocketHttpCode(List<HttpCodeDataModule> websocketHttpCode) {
			this.websocketHttpCode = websocketHttpCode;
		}

		public static class HttpCodeDataModule {

			private Integer code;

			private Float proportion;

			private Float count;

			public Integer getCode() {
				return this.code;
			}

			public void setCode(Integer code) {
				this.code = code;
			}

			public Float getProportion() {
				return this.proportion;
			}

			public void setProportion(Float proportion) {
				this.proportion = proportion;
			}

			public Float getCount() {
				return this.count;
			}

			public void setCount(Float count) {
				this.count = count;
			}
		}
	}

	@Override
	public DescribeDcdnDomainWebsocketHttpCodeDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnDomainWebsocketHttpCodeDataResponseUnmarshaller.unmarshall(this, context);
	}
}
