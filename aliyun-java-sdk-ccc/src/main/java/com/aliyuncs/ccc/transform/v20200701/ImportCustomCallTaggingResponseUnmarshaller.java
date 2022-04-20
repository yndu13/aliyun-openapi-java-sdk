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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ImportCustomCallTaggingResponse;
import com.aliyuncs.ccc.model.v20200701.ImportCustomCallTaggingResponse.FailureItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportCustomCallTaggingResponseUnmarshaller {

	public static ImportCustomCallTaggingResponse unmarshall(ImportCustomCallTaggingResponse importCustomCallTaggingResponse, UnmarshallerContext _ctx) {
		
		importCustomCallTaggingResponse.setRequestId(_ctx.stringValue("ImportCustomCallTaggingResponse.RequestId"));
		importCustomCallTaggingResponse.setHttpStatusCode(_ctx.integerValue("ImportCustomCallTaggingResponse.HttpStatusCode"));
		importCustomCallTaggingResponse.setCode(_ctx.stringValue("ImportCustomCallTaggingResponse.Code"));
		importCustomCallTaggingResponse.setMessage(_ctx.stringValue("ImportCustomCallTaggingResponse.Message"));

		List<FailureItem> data = new ArrayList<FailureItem>();
		for (int i = 0; i < _ctx.lengthValue("ImportCustomCallTaggingResponse.Data.Length"); i++) {
			FailureItem failureItem = new FailureItem();
			failureItem.setItem(_ctx.stringValue("ImportCustomCallTaggingResponse.Data["+ i +"].Item"));
			failureItem.setReason(_ctx.stringValue("ImportCustomCallTaggingResponse.Data["+ i +"].Reason"));

			data.add(failureItem);
		}
		importCustomCallTaggingResponse.setData(data);
	 
	 	return importCustomCallTaggingResponse;
	}
}