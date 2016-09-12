package com.sfxie.soa.modules.dubbo.service.provider.dubbo.impl;

import org.springframework.stereotype.Service;

import com.sfxie.soa.dubbo.service.BaseRestfulService;
import com.sfxie.soa.modules.dubbo.service.provider.dubbo.TestRegistryService;




@Service("testRegistryService")
public class TestRegistryServiceImpl extends BaseRestfulService implements  TestRegistryService {
	/* (non-Javadoc)
	 * @see com.sfxie.website.modules.dubbo.test.service.impl.TestRegistryService#hello(java.lang.String)
	 */
	@Override
	public String hello(String name) {	
		return "hello"+name;
	}
}
