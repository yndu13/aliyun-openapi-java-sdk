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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeNASFileSystemsRequest extends RpcAcsRequest<DescribeNASFileSystemsResponse> {
	   

	private String officeSiteId;

	private String nextToken;

	private Integer maxResults;

	private List<String> fileSystemIds;
	public DescribeNASFileSystemsRequest() {
		super("ecd", "2020-09-30", "DescribeNASFileSystems");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOfficeSiteId() {
		return this.officeSiteId;
	}

	public void setOfficeSiteId(String officeSiteId) {
		this.officeSiteId = officeSiteId;
		if(officeSiteId != null){
			putQueryParameter("OfficeSiteId", officeSiteId);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public List<String> getFileSystemIds() {
		return this.fileSystemIds;
	}

	public void setFileSystemIds(List<String> fileSystemIds) {
		this.fileSystemIds = fileSystemIds;	
		if (fileSystemIds != null) {
			for (int i = 0; i < fileSystemIds.size(); i++) {
				putQueryParameter("FileSystemId." + (i + 1) , fileSystemIds.get(i));
			}
		}	
	}

	@Override
	public Class<DescribeNASFileSystemsResponse> getResponseClass() {
		return DescribeNASFileSystemsResponse.class;
	}

}
