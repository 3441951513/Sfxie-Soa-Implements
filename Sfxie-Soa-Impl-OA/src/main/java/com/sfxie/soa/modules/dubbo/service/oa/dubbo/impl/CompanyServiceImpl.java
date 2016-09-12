package com.sfxie.soa.modules.dubbo.service.oa.dubbo.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sfxie.extension.mybatis.interceptor.Page;
import com.sfxie.soa.dubbo.service.BaseRestfulService;
import com.sfxie.soa.modules.dubbo.dao.oa.mapper.CompanyMapper;
import com.sfxie.soa.modules.dubbo.service.oa.dubbo.CompanyService;
import com.sfxie.soa.modules.dubbo.service.oa.pojo.SfxieSysCompany;

@Service("companyService")
public class CompanyServiceImpl  extends BaseRestfulService implements CompanyService {
	@Resource
	private CompanyMapper companyMapper;
	
	/* (non-Javadoc)
	 * @see com.sfxie.soa.modules.dubbo.oa.service.impl.CompanyService#querySfxieCompanyList()
	 */
	@Override
	public List<SfxieSysCompany> querySfxieCompanyList(SfxieSysCompany sfxieSysCompany){
//		throw new BusinessException("测试dubbo环境下的service异常");
		return companyMapper.querySfxieCompanyList(sfxieSysCompany);
	}

	@Override
	public List<SfxieSysCompany> querySfxieCompanyPage(Page page) {
		return companyMapper.querySfxieCompanyPage(page);
	}
}
