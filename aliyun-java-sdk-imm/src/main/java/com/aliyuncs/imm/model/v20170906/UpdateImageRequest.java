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

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imm.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateImageRequest extends RpcAcsRequest<UpdateImageResponse> {
	   

	private String project;

	private String externalId;

	private String sourceType;

	private String remarksB;

	private String remarksA;

	private String imageUri;

	private String remarksArrayA;

	private String remarksArrayB;

	private String sourceUri;

	private String sourcePosition;

	private String remarksD;

	private String remarksC;

	private String setId;

	@SerializedName("faces")
	private List<Faces> faces;
	public UpdateImageRequest() {
		super("imm", "2017-09-06", "UpdateImage", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
		if(externalId != null){
			putQueryParameter("ExternalId", externalId);
		}
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putQueryParameter("SourceType", sourceType);
		}
	}

	public String getRemarksB() {
		return this.remarksB;
	}

	public void setRemarksB(String remarksB) {
		this.remarksB = remarksB;
		if(remarksB != null){
			putQueryParameter("RemarksB", remarksB);
		}
	}

	public String getRemarksA() {
		return this.remarksA;
	}

	public void setRemarksA(String remarksA) {
		this.remarksA = remarksA;
		if(remarksA != null){
			putQueryParameter("RemarksA", remarksA);
		}
	}

	public String getImageUri() {
		return this.imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
		if(imageUri != null){
			putQueryParameter("ImageUri", imageUri);
		}
	}

	public String getRemarksArrayA() {
		return this.remarksArrayA;
	}

	public void setRemarksArrayA(String remarksArrayA) {
		this.remarksArrayA = remarksArrayA;
		if(remarksArrayA != null){
			putQueryParameter("RemarksArrayA", remarksArrayA);
		}
	}

	public String getRemarksArrayB() {
		return this.remarksArrayB;
	}

	public void setRemarksArrayB(String remarksArrayB) {
		this.remarksArrayB = remarksArrayB;
		if(remarksArrayB != null){
			putQueryParameter("RemarksArrayB", remarksArrayB);
		}
	}

	public String getSourceUri() {
		return this.sourceUri;
	}

	public void setSourceUri(String sourceUri) {
		this.sourceUri = sourceUri;
		if(sourceUri != null){
			putQueryParameter("SourceUri", sourceUri);
		}
	}

	public String getSourcePosition() {
		return this.sourcePosition;
	}

	public void setSourcePosition(String sourcePosition) {
		this.sourcePosition = sourcePosition;
		if(sourcePosition != null){
			putQueryParameter("SourcePosition", sourcePosition);
		}
	}

	public String getRemarksD() {
		return this.remarksD;
	}

	public void setRemarksD(String remarksD) {
		this.remarksD = remarksD;
		if(remarksD != null){
			putQueryParameter("RemarksD", remarksD);
		}
	}

	public String getRemarksC() {
		return this.remarksC;
	}

	public void setRemarksC(String remarksC) {
		this.remarksC = remarksC;
		if(remarksC != null){
			putQueryParameter("RemarksC", remarksC);
		}
	}

	public String getSetId() {
		return this.setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
		if(setId != null){
			putQueryParameter("SetId", setId);
		}
	}

	public List<Faces> getFaces() {
		return this.faces;
	}

	public void setFaces(List<Faces> faces) {
		this.faces = faces;	
		if (faces != null) {
			putQueryParameter("Faces" , new Gson().toJson(faces));
		}	
	}

	public static class Faces {

		@SerializedName("GroupId")
		private String groupId;

		@SerializedName("FaceId")
		private String faceId;

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getFaceId() {
			return this.faceId;
		}

		public void setFaceId(String faceId) {
			this.faceId = faceId;
		}
	}

	@Override
	public Class<UpdateImageResponse> getResponseClass() {
		return UpdateImageResponse.class;
	}

}
