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

import com.aliyuncs.dts.model.v20200101.ResetDtsJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResetDtsJobResponseUnmarshaller {

	public static ResetDtsJobResponse unmarshall(ResetDtsJobResponse resetDtsJobResponse, UnmarshallerContext _ctx) {
		
		resetDtsJobResponse.setRequestId(_ctx.stringValue("ResetDtsJobResponse.RequestId"));
		resetDtsJobResponse.setHttpStatusCode(_ctx.integerValue("ResetDtsJobResponse.HttpStatusCode"));
		resetDtsJobResponse.setErrCode(_ctx.stringValue("ResetDtsJobResponse.ErrCode"));
		resetDtsJobResponse.setSuccess(_ctx.booleanValue("ResetDtsJobResponse.Success"));
		resetDtsJobResponse.setErrMessage(_ctx.stringValue("ResetDtsJobResponse.ErrMessage"));
		resetDtsJobResponse.setDynamicMessage(_ctx.stringValue("ResetDtsJobResponse.DynamicMessage"));
		resetDtsJobResponse.setDynamicCode(_ctx.stringValue("ResetDtsJobResponse.DynamicCode"));
	 
	 	return resetDtsJobResponse;
	}
}