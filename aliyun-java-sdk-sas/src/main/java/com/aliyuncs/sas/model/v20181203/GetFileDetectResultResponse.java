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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.GetFileDetectResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFileDetectResultResponse extends AcsResponse {

	private String requestId;

	private List<Result> resultList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Result> getResultList() {
		return this.resultList;
	}

	public void setResultList(List<Result> resultList) {
		this.resultList = resultList;
	}

	public static class Result {

		private String hashKey;

		private Integer result;

		private Integer score;

		private String virusType;

		private String ext;

		public String getHashKey() {
			return this.hashKey;
		}

		public void setHashKey(String hashKey) {
			this.hashKey = hashKey;
		}

		public Integer getResult() {
			return this.result;
		}

		public void setResult(Integer result) {
			this.result = result;
		}

		public Integer getScore() {
			return this.score;
		}

		public void setScore(Integer score) {
			this.score = score;
		}

		public String getVirusType() {
			return this.virusType;
		}

		public void setVirusType(String virusType) {
			this.virusType = virusType;
		}

		public String getExt() {
			return this.ext;
		}

		public void setExt(String ext) {
			this.ext = ext;
		}
	}

	@Override
	public GetFileDetectResultResponse getInstance(UnmarshallerContext context) {
		return	GetFileDetectResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
