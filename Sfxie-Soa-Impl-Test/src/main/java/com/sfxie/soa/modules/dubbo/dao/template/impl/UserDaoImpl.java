package com.sfxie.soa.modules.dubbo.dao.template.impl;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.sfxie.extension.mybatis.template.MybatisTemplate;
import com.sfxie.soa.modules.dubbo.dao.template.UserDao;
import com.sfxie.soa.modules.dubbo.service.oa.pojo.SfxieSysUserinfo;
@Repository("userDaoImpl")
public class UserDaoImpl extends MybatisTemplate implements UserDao{
	/**
	 * 查询公司列表
	 * @TODO	
	 * @author 	xieshengfeng
	 * @email  	xsfcy@126.com
	 * @since 	下午1:42:54 2016年4月19日
	 * @example
	 * @return	
	 *
	 */
	public List<SfxieSysUserinfo> getSfxieSysUserinfoList(SfxieSysUserinfo entity){
		return (List<SfxieSysUserinfo>)this.selectList("UserMapperTemplate.getSfxieSysUserinfoList", entity);
	}
}
