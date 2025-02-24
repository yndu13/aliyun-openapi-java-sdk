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

package com.aliyuncs.dts.transform.v20200101;

import com.aliyuncs.dts.model.v20200101.ModifyDtsJobPasswordResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyDtsJobPasswordResponseUnmarshaller {

	public static ModifyDtsJobPasswordResponse unmarshall(ModifyDtsJobPasswordResponse modifyDtsJobPasswordResponse, UnmarshallerContext _ctx) {
		
		modifyDtsJobPasswordResponse.setRequestId(_ctx.stringValue("ModifyDtsJobPasswordResponse.RequestId"));
		modifyDtsJobPasswordResponse.setHttpStatusCode(_ctx.integerValue("ModifyDtsJobPasswordResponse.HttpStatusCode"));
		modifyDtsJobPasswordResponse.setErrCode(_ctx.stringValue("ModifyDtsJobPasswordResponse.ErrCode"));
		modifyDtsJobPasswordResponse.setSuccess(_ctx.booleanValue("ModifyDtsJobPasswordResponse.Success"));
		modifyDtsJobPasswordResponse.setErrMessage(_ctx.stringValue("ModifyDtsJobPasswordResponse.ErrMessage"));
		modifyDtsJobPasswordResponse.setCode(_ctx.stringValue("ModifyDtsJobPasswordResponse.Code"));
		modifyDtsJobPasswordResponse.setDynamicMessage(_ctx.stringValue("ModifyDtsJobPasswordResponse.DynamicMessage"));
	 
	 	return modifyDtsJobPasswordResponse;
	}
}