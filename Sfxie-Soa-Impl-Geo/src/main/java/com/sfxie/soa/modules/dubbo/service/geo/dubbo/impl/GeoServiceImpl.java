package com.sfxie.soa.modules.dubbo.service.geo.dubbo.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sfxie.soa.dubbo.service.BaseRestfulService;
import com.sfxie.soa.modules.dubbo.dao.geo.mapper.GeoMapper;
import com.sfxie.soa.modules.dubbo.service.geo.dubbo.GeoService;
import com.sfxie.soa.modules.dubbo.service.geo.pojo.SfxieGeoCity;
import com.sfxie.soa.modules.dubbo.service.geo.pojo.SfxieGeoCountry;
import com.sfxie.soa.modules.dubbo.service.geo.pojo.SfxieGeoDetail;
import com.sfxie.soa.modules.dubbo.service.geo.pojo.SfxieGeoDistrict;
import com.sfxie.soa.modules.dubbo.service.geo.pojo.SfxieGeoProvince;
import com.sfxie.soa.modules.dubbo.service.geo.pojo.SfxieGeoStreet;

@Service("geoService")
public class GeoServiceImpl extends BaseRestfulService  implements GeoService {

	@Resource
	private GeoMapper mapper;
	
	@Override
	public List<SfxieGeoCountry> querySfxieGeoCountryList(SfxieGeoCountry entity) {
//		return mapper.querySfxieGeoCountryList(entity);
		return findList(entity);
	}

	@Override
	public List<SfxieGeoProvince> querySfxieGeoProvinceList(
			SfxieGeoProvince entity) {
//		return mapper.querySfxieGeoProvinceList(entity);
		return findList(entity);
	}

	@Override
	public List<SfxieGeoCity> querySfxieGeoCityList(SfxieGeoCity entity) {
//		return mapper.querySfxieGeoCityList(entity);
		return findList(entity);
	}

	@Override
	public List<SfxieGeoDistrict> querySfxieGeoDistrictList(
			SfxieGeoDistrict entity) {
//		return mapper.querySfxieGeoDistrictList(entity);
		return findList(entity);
	}

	@Override
	public List<SfxieGeoStreet> querySfxieGeoStreetList(SfxieGeoStreet entity) {
//		return mapper.querySfxieGeoStreetList(entity);
		return findList(entity);
	}

	@Override
	public List<SfxieGeoDetail> querySfxieGeoDetailList(SfxieGeoDetail entity) {
//		return mapper.querySfxieGeoDetailList(entity);
		return findList(entity);
	}


}
