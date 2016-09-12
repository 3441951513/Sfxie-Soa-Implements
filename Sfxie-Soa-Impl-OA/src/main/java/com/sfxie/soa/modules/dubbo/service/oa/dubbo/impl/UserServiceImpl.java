package com.sfxie.soa.modules.dubbo.service.oa.dubbo.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sfxie.soa.dubbo.service.BaseRestfulService;
import com.sfxie.soa.modules.common.context.Properties;
import com.sfxie.soa.modules.dubbo.dao.oa.mapper.UserMapper;
import com.sfxie.soa.modules.dubbo.service.oa.dubbo.UserService;
import com.sfxie.soa.modules.dubbo.service.oa.exception.RegisterException;
import com.sfxie.soa.modules.dubbo.service.oa.pojo.SfxieSysUserinfo;
import com.sfxie.utils.MD5Util;

@Service("userService")
public class UserServiceImpl  extends BaseRestfulService implements UserService {
	@Resource
	private UserMapper mapper;

	@Override
	public List<SfxieSysUserinfo> querySfxieSysUserinfoList(SfxieSysUserinfo sfxieSysUserinfo) {
		return mapper.getSfxieSysUserinfoList(sfxieSysUserinfo);
	}

	@Override
	public Object register(SfxieSysUserinfo sfxieSysUserinfo) throws RegisterException{
		if(null==sfxieSysUserinfo.getUser_password()){
			throw new RegisterException(Properties.getProperty("register.empty.password"),"register.empty.password");
		}
		if(null==sfxieSysUserinfo.getUser_id()){
			throw new RegisterException(Properties.getProperty("register.empty.username"),"register.empty.username");
		}
		if(null==sfxieSysUserinfo.getCreate_company_id()){
			throw new RegisterException(Properties.getProperty("register.empty.company"),"register.empty.company");
		}
		//使用MD5加密
		sfxieSysUserinfo.setUser_password(MD5Util.string2MD5(sfxieSysUserinfo.getUser_password()));
		sfxieSysUserinfo.setCreate_time(new Date());
		mapper.insertEntity(sfxieSysUserinfo);
		return null;
	}
	
}
