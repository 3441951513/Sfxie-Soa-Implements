package com.sfxie.soa.modules.dubbo.oa.service;

import java.util.List;

import org.junit.Test;

import com.sfxie.base.BaseTest;
import com.sfxie.soa.modules.dubbo.dao.template.UserDao;
import com.sfxie.soa.modules.dubbo.service.oa.dubbo.UserService;
import com.sfxie.soa.modules.dubbo.service.oa.pojo.SfxieSysUserinfo;


public class UserServiceTest extends BaseTest<UserService,SfxieSysUserinfo> {

	@Test
	public void queryCompanyList(){
		List<SfxieSysUserinfo> list =  getService().querySfxieSysUserinfoList(new SfxieSysUserinfo());
		System.out.println(list);
	}
	

	@Override
	protected SfxieSysUserinfo getInsertEntity() {
		
		SfxieSysUserinfo entity = new SfxieSysUserinfo();
		entity.setUser_id("UserTest");
		entity.setUser_password("dddd");
		entity.setCreate_company_id(getUUID());
		entity.setPartition_company("00000000");
		return entity;
	}
	@Override
	protected SfxieSysUserinfo getUpdateEntity() {
		return null;
	}
	@Test
	public void testFindEntityById(){
		SfxieSysUserinfo entity = new SfxieSysUserinfo();
		entity.setUser_id("eeeeee");
		UserService service = getService();
		SfxieSysUserinfo e = service.findByKey(entity);
		System.out.println(e);
	}
	
	@Test
	public void testTemplate(){
		UserDao userDao = getBeanByName("userDaoImpl");
		System.out.println("######################################: "+userDao.getSfxieSysUserinfoList(null).size());
	}
}
