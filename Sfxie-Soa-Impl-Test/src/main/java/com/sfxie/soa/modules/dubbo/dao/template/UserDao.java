package com.sfxie.soa.modules.dubbo.dao.template;


import java.util.List;

import com.sfxie.soa.modules.dubbo.service.oa.pojo.SfxieSysUserinfo;


public interface UserDao {
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
	public List<SfxieSysUserinfo> getSfxieSysUserinfoList(SfxieSysUserinfo entity);
}
