package com.sfxie.soa.modules.dubbo.service.weixin.dubbo.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import me.chanjar.weixin.mp.bean.result.WxMpUserList;
import me.chanjar.weixin.mp.util.storage.WxMpConfigStorageUtil;

import org.springframework.stereotype.Service;

import com.sfxie.soa.dubbo.service.BaseRestfulService;
import com.sfxie.soa.modules.dubbo.dao.weixin.mapper.WeiXinMapper;
import com.sfxie.soa.modules.dubbo.service.weixin.dubbo.SfxieWeixinService;
import com.sfxie.soa.modules.dubbo.service.weixin.pojo.SfxieWeixinUser;
import com.sfxie.utils.CollectionUtil;
import com.sfxie.utils.ObjectUtil;

@Service("sfxieWeixinService")
public class SfxieWeixinServiceImpl extends BaseRestfulService  implements SfxieWeixinService{
	@Resource
	private WeiXinMapper mapper;
	@Resource
	private WxMpService wxMpService;
	
	@Override
	public List<SfxieWeixinUser> querySfxieWeixinUserList(SfxieWeixinUser entity) {
		return mapper.querySfxieWeixinUserList(entity);
	}

	@Override
	public List<WxMpUser> queryWxMpUsers(String appId) throws Exception {
		WxMpConfigStorageUtil.setCurrentAppId(appId);
		WxMpUserList list = wxMpService.getUserService().userList(null);
		List<WxMpUser> result = null;
		if(null!=list && CollectionUtil.isNotEmpty(list.getOpenIds())){
			result = new ArrayList<WxMpUser>();
			for(String openId : list.getOpenIds()){
				WxMpUser user = wxMpService.getUserService().userInfo(openId, "zh_CN");
				if(ObjectUtil.isNotNull(user))
					result.add(user);
			}
		}
		return result;
	}

}
