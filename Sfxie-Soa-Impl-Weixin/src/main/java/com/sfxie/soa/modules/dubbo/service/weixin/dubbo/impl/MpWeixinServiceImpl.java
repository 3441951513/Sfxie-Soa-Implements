package com.sfxie.soa.modules.dubbo.service.weixin.dubbo.impl;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpMessageRouter;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.WxMpXmlOutMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Service;
import com.sfxie.soa.dubbo.service.BaseRestfulService;
import com.sfxie.soa.modules.dubbo.service.weixin.dubbo.MpWeixinService;

@Service(timeout=4000,registry={"oaRegistry"},version="1.0.0")
public class MpWeixinServiceImpl extends BaseRestfulService implements MpWeixinService  {
	@Autowired
	WxMpConfigStorage wxMpConfigStorage;
	
	@Autowired
	WxMpService wxMpService;

	@Autowired
	WxMpMessageRouter wxMpMessageRouter;
	
	/* (non-Javadoc)
	 * @see com.sfxie.soa.modules.dubbo.service.weixin.dubbo.impl.MpWeixinService#connect(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	@RequestMapping(value = "/connect", method = { RequestMethod.GET })
	@ResponseBody
	public String connect( String signature, String nonce, String timestamp,
	        String echostr) {
		/**
		 * 开发者通过检验signature对请求进行校验（下面有校验方式）。若确认此次GET请求来自微信服务器，请原样返回echostr参数内容，
		 * 则接入生效，成为开发者成功，否则接入失败。
		 * 
		 * 加密/校验流程如下： 1. 将token、timestamp、nonce三个参数进行字典序排序 2.
		 * 将三个参数字符串拼接成一个字符串进行sha1加密 3. 开发者获得加密后的字符串可与signature对比，标识该请求来源于微信
		 */
		System.out.println(wxMpService == null);
		if (!wxMpService.checkSignature(timestamp, nonce, signature)) {
			// 消息签名不正确，说明不是公众平台发过来的消息
			return "非法请求";
		}

		return echostr;
	}

	@Override
	public String processRequest(HttpServletRequest request, String nonce, String timestamp,
	         String encrypt_type) throws IOException {

		WxMpXmlMessage inMessage = null;

		if ("raw".equals(encrypt_type)) {
			// 明文传输的消息
			inMessage = WxMpXmlMessage.fromXml(request.getInputStream());
		} else if ("aes".equals(encrypt_type)) {
			// 是aes加密的消息
			String msgSignature = request.getParameter("msg_signature");
			inMessage = WxMpXmlMessage.fromEncryptedXml(request.getInputStream(), wxMpConfigStorage, timestamp, nonce,
			        msgSignature);
		} else {
			return "不可识别的加密类型";
		}

		WxMpXmlOutMessage outMessage = wxMpMessageRouter.route(inMessage);

		if (outMessage != null) {
			if ("raw".equals(encrypt_type)) {
				return outMessage.toXml();
			} else if ("aes".equals(encrypt_type)) {
				return outMessage.toEncryptedXml(wxMpConfigStorage);
			}
		} else {
			System.out.println("outMessage is null");
		}
		return "服务号不可用";
	}

}
