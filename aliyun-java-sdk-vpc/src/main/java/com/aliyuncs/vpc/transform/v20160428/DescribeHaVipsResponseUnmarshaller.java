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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeHaVipsResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeHaVipsResponse.HaVip;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHaVipsResponseUnmarshaller {

	public static DescribeHaVipsResponse unmarshall(DescribeHaVipsResponse describeHaVipsResponse, UnmarshallerContext _ctx) {
		
		describeHaVipsResponse.setRequestId(_ctx.stringValue("DescribeHaVipsResponse.RequestId"));
		describeHaVipsResponse.setPageSize(_ctx.integerValue("DescribeHaVipsResponse.PageSize"));
		describeHaVipsResponse.setPageNumber(_ctx.integerValue("DescribeHaVipsResponse.PageNumber"));
		describeHaVipsResponse.setTotalCount(_ctx.integerValue("DescribeHaVipsResponse.TotalCount"));

		List<HaVip> haVips = new ArrayList<HaVip>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHaVipsResponse.HaVips.Length"); i++) {
			HaVip haVip = new HaVip();
			haVip.setVpcId(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].VpcId"));
			haVip.setStatus(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].Status"));
			haVip.setHaVipId(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].HaVipId"));
			haVip.setAssociatedInstanceType(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].AssociatedInstanceType"));
			haVip.setCreateTime(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].CreateTime"));
			haVip.setChargeType(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].ChargeType"));
			haVip.setRegionId(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].RegionId"));
			haVip.setVSwitchId(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].VSwitchId"));
			haVip.setIpAddress(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].IpAddress"));
			haVip.setDescription(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].Description"));
			haVip.setMasterInstanceId(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].MasterInstanceId"));
			haVip.setName(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].Name"));

			List<String> associatedEipAddresses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHaVipsResponse.HaVips["+ i +"].AssociatedEipAddresses.Length"); j++) {
				associatedEipAddresses.add(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].AssociatedEipAddresses["+ j +"]"));
			}
			haVip.setAssociatedEipAddresses(associatedEipAddresses);

			List<String> associatedInstances = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHaVipsResponse.HaVips["+ i +"].AssociatedInstances.Length"); j++) {
				associatedInstances.add(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].AssociatedInstances["+ j +"]"));
			}
			haVip.setAssociatedInstances(associatedInstances);

			haVips.add(haVip);
		}
		describeHaVipsResponse.setHaVips(haVips);
	 
	 	return describeHaVipsResponse;
	}
}