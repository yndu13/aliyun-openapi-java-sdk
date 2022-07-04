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
public class CreateUserGroupRequest extends RpcAcsRequest<CreateUserGroupResponse> {
	   

	private String userGroupId;

	private String userGroupName;

	private String userGroupDescription;

	private String parentUserGroupId;
	public CreateUserGroupRequest() {
		super("quickbi-public", "2022-01-01", "CreateUserGroup", "quick");
		setMethod(MethodType.POST);
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

	public String getUserGroupName() {
		return this.userGroupName;
	}

	public void setUserGroupName(String userGroupName) {
		this.userGroupName = userGroupName;
		if(userGroupName != null){
			putQueryParameter("UserGroupName", userGroupName);
		}
	}

	public String getUserGroupDescription() {
		return this.userGroupDescription;
	}

	public void setUserGroupDescription(String userGroupDescription) {
		this.userGroupDescription = userGroupDescription;
		if(userGroupDescription != null){
			putQueryParameter("UserGroupDescription", userGroupDescription);
		}
	}

	public String getParentUserGroupId() {
		return this.parentUserGroupId;
	}

	public void setParentUserGroupId(String parentUserGroupId) {
		this.parentUserGroupId = parentUserGroupId;
		if(parentUserGroupId != null){
			putQueryParameter("ParentUserGroupId", parentUserGroupId);
		}
	}

	@Override
	public Class<CreateUserGroupResponse> getResponseClass() {
		return CreateUserGroupResponse.class;
	}

}
