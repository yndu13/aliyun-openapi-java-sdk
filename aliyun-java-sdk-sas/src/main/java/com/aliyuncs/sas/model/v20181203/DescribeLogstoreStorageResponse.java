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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeLogstoreStorageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLogstoreStorageResponse extends AcsResponse {

	private Long used;

	private Integer ttl;

	private String logstore;

	private String requestId;

	private Long preserve;

	public Long getUsed() {
		return this.used;
	}

	public void setUsed(Long used) {
		this.used = used;
	}

	public Integer getTtl() {
		return this.ttl;
	}

	public void setTtl(Integer ttl) {
		this.ttl = ttl;
	}

	public String getLogstore() {
		return this.logstore;
	}

	public void setLogstore(String logstore) {
		this.logstore = logstore;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPreserve() {
		return this.preserve;
	}

	public void setPreserve(Long preserve) {
		this.preserve = preserve;
	}

	@Override
	public DescribeLogstoreStorageResponse getInstance(UnmarshallerContext context) {
		return	DescribeLogstoreStorageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
