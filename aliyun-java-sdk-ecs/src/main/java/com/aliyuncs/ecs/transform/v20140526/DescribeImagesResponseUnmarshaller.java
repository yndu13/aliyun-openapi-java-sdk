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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse.Image;
import com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse.Image.DetectionOptions;
import com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse.Image.DetectionOptions.Item;
import com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse.Image.DiskDeviceMapping;
import com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse.Image.Features;
import com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse.Image.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImagesResponseUnmarshaller {

	public static DescribeImagesResponse unmarshall(DescribeImagesResponse describeImagesResponse, UnmarshallerContext _ctx) {
		
		describeImagesResponse.setRequestId(_ctx.stringValue("DescribeImagesResponse.RequestId"));
		describeImagesResponse.setPageSize(_ctx.integerValue("DescribeImagesResponse.PageSize"));
		describeImagesResponse.setPageNumber(_ctx.integerValue("DescribeImagesResponse.PageNumber"));
		describeImagesResponse.setTotalCount(_ctx.integerValue("DescribeImagesResponse.TotalCount"));
		describeImagesResponse.setRegionId(_ctx.stringValue("DescribeImagesResponse.RegionId"));

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImagesResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setCreationTime(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].CreationTime"));
			image.setStatus(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Status"));
			image.setImageFamily(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ImageFamily"));
			image.setProgress(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Progress"));
			image.setIsCopied(_ctx.booleanValue("DescribeImagesResponse.Images["+ i +"].IsCopied"));
			image.setIsSupportIoOptimized(_ctx.booleanValue("DescribeImagesResponse.Images["+ i +"].IsSupportIoOptimized"));
			image.setImageOwnerAlias(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ImageOwnerAlias"));
			image.setIsSupportCloudinit(_ctx.booleanValue("DescribeImagesResponse.Images["+ i +"].IsSupportCloudinit"));
			image.setImageVersion(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ImageVersion"));
			image.setUsage(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Usage"));
			image.setIsSelfShared(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].IsSelfShared"));
			image.setDescription(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Description"));
			image.setSize(_ctx.integerValue("DescribeImagesResponse.Images["+ i +"].Size"));
			image.setResourceGroupId(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ResourceGroupId"));
			image.setPlatform(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Platform"));
			image.setOSNameEn(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].OSNameEn"));
			image.setImageName(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ImageName"));
			image.setOSName(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].OSName"));
			image.setImageId(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ImageId"));
			image.setOSType(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].OSType"));
			image.setIsSubscribed(_ctx.booleanValue("DescribeImagesResponse.Images["+ i +"].IsSubscribed"));
			image.setProductCode(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ProductCode"));
			image.setArchitecture(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Architecture"));
			image.setIsPublic(_ctx.booleanValue("DescribeImagesResponse.Images["+ i +"].IsPublic"));
			image.setImageOwnerId(_ctx.longValue("DescribeImagesResponse.Images["+ i +"].ImageOwnerId"));
			image.setLoginAsNonRootSupported(_ctx.booleanValue("DescribeImagesResponse.Images["+ i +"].LoginAsNonRootSupported"));
			image.setSupplierName(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].SupplierName"));

			DetectionOptions detectionOptions = new DetectionOptions();
			detectionOptions.setStatus(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DetectionOptions.Status"));

			List<Item> items = new ArrayList<Item>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImagesResponse.Images["+ i +"].DetectionOptions.Items.Length"); j++) {
				Item item = new Item();
				item.setName(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DetectionOptions.Items["+ j +"].Name"));
				item.setValue(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DetectionOptions.Items["+ j +"].Value"));
				item.setRiskLevel(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DetectionOptions.Items["+ j +"].RiskLevel"));
				item.setRiskCode(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DetectionOptions.Items["+ j +"].RiskCode"));

				items.add(item);
			}
			detectionOptions.setItems(items);
			image.setDetectionOptions(detectionOptions);

			Features features = new Features();
			features.setNvmeSupport(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Features.NvmeSupport"));
			image.setFeatures(features);

			List<DiskDeviceMapping> diskDeviceMappings = new ArrayList<DiskDeviceMapping>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings.Length"); j++) {
				DiskDeviceMapping diskDeviceMapping = new DiskDeviceMapping();
				diskDeviceMapping.setType(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Type"));
				diskDeviceMapping.setImportOSSBucket(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].ImportOSSBucket"));
				diskDeviceMapping.setProgress(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Progress"));
				diskDeviceMapping.setSnapshotId(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].SnapshotId"));
				diskDeviceMapping.setImportOSSObject(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].ImportOSSObject"));
				diskDeviceMapping.setDevice(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Device"));
				diskDeviceMapping.setSize(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Size"));
				diskDeviceMapping.setRemainTime(_ctx.integerValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].RemainTime"));
				diskDeviceMapping.setFormat(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Format"));

				diskDeviceMappings.add(diskDeviceMapping);
			}
			image.setDiskDeviceMappings(diskDeviceMappings);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImagesResponse.Images["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagValue(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Tags["+ j +"].TagValue"));
				tag.setTagKey(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tag);
			}
			image.setTags(tags);

			images.add(image);
		}
		describeImagesResponse.setImages(images);
	 
	 	return describeImagesResponse;
	}
}