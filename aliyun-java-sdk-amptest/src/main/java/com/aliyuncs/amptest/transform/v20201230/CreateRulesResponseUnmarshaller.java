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

package com.aliyuncs.amptest.transform.v20201230;

import com.aliyuncs.amptest.model.v20201230.CreateRulesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRulesResponseUnmarshaller {

	public static CreateRulesResponse unmarshall(CreateRulesResponse createRulesResponse, UnmarshallerContext _ctx) {
		
		createRulesResponse.setRequestId(_ctx.stringValue("CreateRulesResponse.RequestId"));
		createRulesResponse.setSize(_ctx.integerValue("CreateRulesResponse.Size"));
		createRulesResponse.setValue(_ctx.stringValue("CreateRulesResponse.Value"));
	 
	 	return createRulesResponse;
	}
}