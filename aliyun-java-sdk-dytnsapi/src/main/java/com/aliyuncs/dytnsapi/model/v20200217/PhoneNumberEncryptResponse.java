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

package com.aliyuncs.dytnsapi.model.v20200217;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dytnsapi.transform.v20200217.PhoneNumberEncryptResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PhoneNumberEncryptResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String originalNumber;

		private String encryptedNumber;

		private String expireTime;

		public String getOriginalNumber() {
			return this.originalNumber;
		}

		public void setOriginalNumber(String originalNumber) {
			this.originalNumber = originalNumber;
		}

		public String getEncryptedNumber() {
			return this.encryptedNumber;
		}

		public void setEncryptedNumber(String encryptedNumber) {
			this.encryptedNumber = encryptedNumber;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}
	}

	@Override
	public PhoneNumberEncryptResponse getInstance(UnmarshallerContext context) {
		return	PhoneNumberEncryptResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
