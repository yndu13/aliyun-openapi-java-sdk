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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddUserGroupMemberRequest extends RpcAcsRequest<AddUserGroupMemberResponse> {
	   

	private String userIdList;

	private String userGroupId;
	public AddUserGroupMemberRequest() {
		super("quickbi-public", "2022-01-01", "AddUserGroupMember", "quickbi");
		setMethod(MethodType.POST);
	}

	public String getUserIdList() {
		return this.userIdList;
	}

	public void setUserIdList(String userIdList) {
		this.userIdList = userIdList;
		if(userIdList != null){
			putQueryParameter("UserIdList", userIdList);
		}
	}

	public String getUserGroupId() {
		return this.userGroupId;
	}

	public void setUserGroupId(String userGroupId) {
		this.userGroupId = userGroupId;
		if(userGroupId != null){
			putQueryParameter("UserGroupId", userGroupId);
		}
	}

	@Override
	public Class<AddUserGroupMemberResponse> getResponseClass() {
		return AddUserGroupMemberResponse.class;
	}

}
