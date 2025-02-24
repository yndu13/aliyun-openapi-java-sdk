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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.GetFileDetectResultResponse;
import com.aliyuncs.sas.model.v20181203.GetFileDetectResultResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFileDetectResultResponseUnmarshaller {

	public static GetFileDetectResultResponse unmarshall(GetFileDetectResultResponse getFileDetectResultResponse, UnmarshallerContext _ctx) {
		
		getFileDetectResultResponse.setRequestId(_ctx.stringValue("GetFileDetectResultResponse.RequestId"));

		List<Result> resultList = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("GetFileDetectResultResponse.ResultList.Length"); i++) {
			Result result = new Result();
			result.setHashKey(_ctx.stringValue("GetFileDetectResultResponse.ResultList["+ i +"].HashKey"));
			result.setResult(_ctx.integerValue("GetFileDetectResultResponse.ResultList["+ i +"].Result"));
			result.setScore(_ctx.integerValue("GetFileDetectResultResponse.ResultList["+ i +"].Score"));
			result.setVirusType(_ctx.stringValue("GetFileDetectResultResponse.ResultList["+ i +"].VirusType"));
			result.setExt(_ctx.stringValue("GetFileDetectResultResponse.ResultList["+ i +"].Ext"));

			resultList.add(result);
		}
		getFileDetectResultResponse.setResultList(resultList);
	 
	 	return getFileDetectResultResponse;
	}
}