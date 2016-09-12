package com.sfxie.soa.modules.dubbo.oa.service;

import java.util.List;

import org.junit.Test;

import com.sfxie.base.BaseTest;
import com.sfxie.core.base.IEntity;
import com.sfxie.soa.modules.dubbo.service.geo.dubbo.GeoService;
import com.sfxie.soa.modules.dubbo.service.geo.pojo.SfxieGeoCountry;
import com.sfxie.soa.modules.dubbo.service.oa.pojo.SfxieSysUserinfo;


public class GeoServiceTest extends BaseTest<GeoService,IEntity> {

	

	@Override
	protected SfxieSysUserinfo getInsertEntity() {
		
		return null;
	}
	
	@Test
	public void testFindList(){
		SfxieGeoCountry sfxieGeoCountry = new SfxieGeoCountry();
		sfxieGeoCountry.setCountry_name("中国");
		GeoService seoService = getBeanByName("geoService");
		List<SfxieGeoCountry> list = seoService.findList(sfxieGeoCountry);
//		sfxieGeoCountry.setResults(list);
		System.out.println("######################################: "+list.size());
	}

	@Override
	protected IEntity getUpdateEntity() {
		return null;
	}
}
