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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryPromotionRequest extends RpcAcsRequest<QueryPromotionResponse> {
	   

	private String proxyChannelId;

	private String extra;

	private String alipayOpenId;

	private String userId;

	private String channelId;
	public QueryPromotionRequest() {
		super("UniMkt", "2018-12-12", "QueryPromotion", "1.0.0");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProxyChannelId() {
		return this.proxyChannelId;
	}

	public void setProxyChannelId(String proxyChannelId) {
		this.proxyChannelId = proxyChannelId;
		if(proxyChannelId != null){
			putBodyParameter("ProxyChannelId", proxyChannelId);
		}
	}

	public String getExtra() {
		return this.extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
		if(extra != null){
			putBodyParameter("Extra", extra);
		}
	}

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}

	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
		if(alipayOpenId != null){
			putBodyParameter("AlipayOpenId", alipayOpenId);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId);
		}
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putBodyParameter("ChannelId", channelId);
		}
	}

	@Override
	public Class<QueryPromotionResponse> getResponseClass() {
		return QueryPromotionResponse.class;
	}

}
