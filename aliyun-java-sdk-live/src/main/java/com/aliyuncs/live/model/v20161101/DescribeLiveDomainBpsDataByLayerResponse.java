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
import com.aliyuncs.live.transform.v20161101.DescribeLiveDomainBpsDataByLayerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveDomainBpsDataByLayerResponse extends AcsResponse {

	private String requestId;

	private String dataInterval;

	private List<DataModule> bpsDataInterval;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(String dataInterval) {
		this.dataInterval = dataInterval;
	}

	public List<DataModule> getBpsDataInterval() {
		return this.bpsDataInterval;
	}

	public void setBpsDataInterval(List<DataModule> bpsDataInterval) {
		this.bpsDataInterval = bpsDataInterval;
	}

	public static class DataModule {

		private String timeStamp;

		private String value;

		private String trafficValue;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getTrafficValue() {
			return this.trafficValue;
		}

		public void setTrafficValue(String trafficValue) {
			this.trafficValue = trafficValue;
		}
	}

	@Override
	public DescribeLiveDomainBpsDataByLayerResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveDomainBpsDataByLayerResponseUnmarshaller.unmarshall(this, context);
	}
}
