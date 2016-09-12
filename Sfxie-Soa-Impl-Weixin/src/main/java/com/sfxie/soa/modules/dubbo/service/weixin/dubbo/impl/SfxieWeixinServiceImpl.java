package com.sfxie.soa.modules.dubbo.service.weixin.dubbo.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sfxie.soa.dubbo.service.BaseRestfulService;
import com.sfxie.soa.modules.dubbo.dao.weixin.mapper.WeiXinMapper;
import com.sfxie.soa.modules.dubbo.service.weixin.dubbo.SfxieWeixinService;
import com.sfxie.soa.modules.dubbo.service.weixin.pojo.SfxieWeixinUser;

@Service("sfxieWeixinService")
public class SfxieWeixinServiceImpl extends BaseRestfulService  implements SfxieWeixinService{
	@Resource
	private WeiXinMapper mapper;

	@Override
	public List<SfxieWeixinUser> querySfxieWeixinUserList(SfxieWeixinUser entity) {
		return mapper.querySfxieWeixinUserList(entity);
	}

}
