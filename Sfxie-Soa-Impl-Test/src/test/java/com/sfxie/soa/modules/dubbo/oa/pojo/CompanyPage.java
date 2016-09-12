package com.sfxie.soa.modules.dubbo.oa.pojo;

import com.sfxie.extension.mybatis.annotation.SqlDecorator;
import com.sfxie.extension.mybatis.interceptor.Page;
import com.sfxie.soa.modules.security.data.DataFilter;

@SqlDecorator(decorator = DataFilter.class)
public class CompanyPage extends Page {

	public CompanyPage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompanyPage(int pageNo, int pageSize) {
		super(pageNo, pageSize);
		// TODO Auto-generated constructor stub
	}

}
