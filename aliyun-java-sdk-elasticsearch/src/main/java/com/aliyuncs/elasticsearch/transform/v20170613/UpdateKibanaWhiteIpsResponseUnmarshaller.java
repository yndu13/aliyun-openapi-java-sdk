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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.UpdateKibanaWhiteIpsResponse;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateKibanaWhiteIpsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateKibanaWhiteIpsResponseUnmarshaller {

	public static UpdateKibanaWhiteIpsResponse unmarshall(UpdateKibanaWhiteIpsResponse updateKibanaWhiteIpsResponse, UnmarshallerContext _ctx) {
		
		updateKibanaWhiteIpsResponse.setRequestId(_ctx.stringValue("UpdateKibanaWhiteIpsResponse.RequestId"));

		Result result = new Result();

		List<String> kibanaPrivateIPWhitelist = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateKibanaWhiteIpsResponse.Result.kibanaPrivateIPWhitelist.Length"); i++) {
			kibanaPrivateIPWhitelist.add(_ctx.stringValue("UpdateKibanaWhiteIpsResponse.Result.kibanaPrivateIPWhitelist["+ i +"]"));
		}
		result.setKibanaPrivateIPWhitelist(kibanaPrivateIPWhitelist);

		List<String> kibanaIPWhitelist = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateKibanaWhiteIpsResponse.Result.kibanaIPWhitelist.Length"); i++) {
			kibanaIPWhitelist.add(_ctx.stringValue("UpdateKibanaWhiteIpsResponse.Result.kibanaIPWhitelist["+ i +"]"));
		}
		result.setKibanaIPWhitelist(kibanaIPWhitelist);
		updateKibanaWhiteIpsResponse.setResult(result);
	 
	 	return updateKibanaWhiteIpsResponse;
	}
}