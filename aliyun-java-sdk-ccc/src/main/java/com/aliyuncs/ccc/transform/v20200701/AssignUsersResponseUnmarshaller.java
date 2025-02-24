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

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.AssignUsersResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssignUsersResponseUnmarshaller {

	public static AssignUsersResponse unmarshall(AssignUsersResponse assignUsersResponse, UnmarshallerContext _ctx) {
		
		assignUsersResponse.setRequestId(_ctx.stringValue("AssignUsersResponse.RequestId"));
		assignUsersResponse.setHttpStatusCode(_ctx.integerValue("AssignUsersResponse.HttpStatusCode"));
		assignUsersResponse.setData(_ctx.stringValue("AssignUsersResponse.Data"));
		assignUsersResponse.setSync(_ctx.stringValue("AssignUsersResponse.Sync"));
		assignUsersResponse.setCode(_ctx.stringValue("AssignUsersResponse.Code"));
		assignUsersResponse.setWorkflowId(_ctx.stringValue("AssignUsersResponse.WorkflowId"));
		assignUsersResponse.setMessage(_ctx.stringValue("AssignUsersResponse.Message"));
	 
	 	return assignUsersResponse;
	}
}