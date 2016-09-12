package com.sfxie.soa.modules.dubbo.dao.weixin.mapper;


import java.util.List;

import com.sfxie.extension.mybatis.annotation.MyBatisRepository;
import com.sfxie.extension.mybatis.dao.AutoUpdateMapper;
import com.sfxie.soa.modules.dubbo.service.weixin.pojo.SfxieWeixinUser;

@MyBatisRepository(Object.class)
public interface WeiXinMapper extends AutoUpdateMapper{
	public List<SfxieWeixinUser> querySfxieWeixinUserList(SfxieWeixinUser entity);
}
