package com.sfxie.soa.modules.dubbo.dao.app.mapper;


import java.util.List;

import com.sfxie.extension.mybatis.annotation.MyBatisRepository;
import com.sfxie.extension.mybatis.dao.AutoUpdateMapper;
import com.sfxie.soa.modules.dubbo.service.app.pojo.SfxieAppBar;

@MyBatisRepository(Object.class)
public interface BarMapper extends AutoUpdateMapper{
	/**
	 * 查询栏位列表
	 * @TODO	
	 * @author 	xieshengfeng
	 * @email  	xsfcy@126.com
	 * @since 	下午1:42:54 2016年4月19日
	 * @example
	 * @return	
	 *
	 */
	public List<SfxieAppBar> querySfxieAppBarList(String userId);
	
}
