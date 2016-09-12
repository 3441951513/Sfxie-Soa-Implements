package com.sfxie.soa.modules.dubbo.oa.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.junit.Test;

import com.sfxie.base.BaseTest;
import com.sfxie.soa.modules.dubbo.oa.pojo.CompanyPage;
import com.sfxie.soa.modules.dubbo.service.oa.dubbo.CompanyService;
import com.sfxie.soa.modules.dubbo.service.oa.pojo.SfxieSysCompany;


public class CompanyServiceTest extends BaseTest<CompanyService,SfxieSysCompany> {

//	@Test
	public void queryCompanyList(){
		List<SfxieSysCompany> list =  getService().querySfxieCompanyList(new SfxieSysCompany());
	}
	/**	测试分页获取数据	*/
	@Test
	public void queryCompanyPage(){
		CompanyPage page = new CompanyPage(1, 20);
		page.getParams().put("companyCode", "ddd");
		List<SfxieSysCompany> list =  getService().querySfxieCompanyPage(page);
		page.setResults(list);
	}

	@Override
	protected SfxieSysCompany getInsertEntity() {
		
		String create_company_id = UUID.randomUUID().toString();
		SfxieSysCompany sfxieSysCompany = new SfxieSysCompany();
		sfxieSysCompany.setCompany_code("Company"+getUUID());
		sfxieSysCompany.setCompany_name_cn("测试");
		sfxieSysCompany.setCompany_name_en("test");
		sfxieSysCompany.setCreate_company_id(create_company_id);
		sfxieSysCompany.setCreate_user("sfxie");
		sfxieSysCompany.setCreate_time(new Date());
		sfxieSysCompany.setId_(create_company_id);
		return null;
	}

	@Override
	protected SfxieSysCompany getUpdateEntity() {
		return null;
	}
}
