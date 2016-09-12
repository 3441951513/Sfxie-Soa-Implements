package com.sfxie.soa.modules.dubbo.service.cm.dubbo.pojo;

import com.sfxie.soa.common.request.SecurityContext;
import com.sfxie.soa.common.request.SecurityUser;
import com.sfxie.soa.modules.dubbo.service.cm.pojo.LoginRequest;

public class LoginEntity extends LoginRequest implements SecurityUser{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getUserPassword() {
		return SecurityContext.getSecurityUser().getUserPassword();
	}

	@Override
	public String getOrgId() {
		return SecurityContext.getSecurityUser().getOrgId();
	}

	@Override
	public String getUserId() {
		return null;
	}

}
