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

package com.aliyuncs.mpaas.transform.v20200710;

import com.aliyuncs.mpaas.model.v20200710.RevokePushTaskResponse;
import com.aliyuncs.mpaas.model.v20200710.RevokePushTaskResponse.PushResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class RevokePushTaskResponseUnmarshaller {

	public static RevokePushTaskResponse unmarshall(RevokePushTaskResponse revokePushTaskResponse, UnmarshallerContext _ctx) {
		
		revokePushTaskResponse.setRequestId(_ctx.stringValue("RevokePushTaskResponse.RequestId"));
		revokePushTaskResponse.setResultMessage(_ctx.stringValue("RevokePushTaskResponse.ResultMessage"));
		revokePushTaskResponse.setResultCode(_ctx.stringValue("RevokePushTaskResponse.ResultCode"));

		PushResult pushResult = new PushResult();
		pushResult.setData(_ctx.stringValue("RevokePushTaskResponse.PushResult.Data"));
		pushResult.setSuccess(_ctx.booleanValue("RevokePushTaskResponse.PushResult.Success"));
		pushResult.setResultMsg(_ctx.stringValue("RevokePushTaskResponse.PushResult.ResultMsg"));
		revokePushTaskResponse.setPushResult(pushResult);
	 
	 	return revokePushTaskResponse;
	}
}