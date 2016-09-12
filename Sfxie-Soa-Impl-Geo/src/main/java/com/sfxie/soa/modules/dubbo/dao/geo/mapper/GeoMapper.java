package com.sfxie.soa.modules.dubbo.dao.geo.mapper;


import java.util.List;

import com.sfxie.extension.mybatis.annotation.MyBatisRepository;
import com.sfxie.extension.mybatis.dao.AutoUpdateMapper;
import com.sfxie.soa.modules.dubbo.service.geo.pojo.SfxieGeoCity;
import com.sfxie.soa.modules.dubbo.service.geo.pojo.SfxieGeoCountry;
import com.sfxie.soa.modules.dubbo.service.geo.pojo.SfxieGeoDetail;
import com.sfxie.soa.modules.dubbo.service.geo.pojo.SfxieGeoDistrict;
import com.sfxie.soa.modules.dubbo.service.geo.pojo.SfxieGeoProvince;
import com.sfxie.soa.modules.dubbo.service.geo.pojo.SfxieGeoStreet;

@MyBatisRepository(Object.class)
public interface GeoMapper extends AutoUpdateMapper{
	/**
	 * 查询国家列表
	 * @param entity
	 * @return
	 */
//	public List<SfxieGeoCountry> querySfxieGeoCountryList(SfxieGeoCountry entity);
	/**
	 * 查询省份列表
	 * @param entity
	 * @return
	 */
//	public List<SfxieGeoProvince> querySfxieGeoProvinceList(SfxieGeoProvince entity);
	/**
	 * 查询城市列表
	 * @param entity
	 * @return
	 */
//	public List<SfxieGeoCity> querySfxieGeoCityList(SfxieGeoCity entity);
	/**
	 * 查询区县列表
	 * @param entity
	 * @return
	 */
//	public List<SfxieGeoDistrict> querySfxieGeoDistrictList(SfxieGeoDistrict entity);
	/**
	 * 查询街道列表
	 * @param entity
	 * @return
	 */
//	public List<SfxieGeoStreet> querySfxieGeoStreetList(SfxieGeoStreet entity);
	/**
	 * 查询详细列表
	 * @param entity
	 * @return
	 */
//	public List<SfxieGeoDetail> querySfxieGeoDetailList(SfxieGeoDetail entity);
}
