package com.sfxie.soa.modules.dubbo.service.provider.rest.impl;

import java.util.Date;


import org.springframework.stereotype.Service;

import com.sfxie.soa.dubbo.service.BaseRestfulService;
import com.sfxie.soa.modules.dubbo.service.provider.pojo.Entity;
import com.sfxie.soa.modules.dubbo.service.provider.rest.RestfulService;



/**
 * http://localhost:8880/services/testRestful/111.json
 * 
 * @TODO	
 * @author 	xieshengfeng
 * @email  	xsfcy@126.com
 * @since 	下午4:37:35 2016年4月25日
 * @example		
 *
 */
@Service("restfulService")
public class RestfulServiceImpl extends BaseRestfulService implements RestfulService {
	
	/* (non-Javadoc)
	 * @see com.sfxie.soa.modules.dubbo.service.provider.impl.RestfulService#getEntity(com.sfxie.soa.modules.dubbo.service.provider.impl.pojo.Entity)
	 */
	@Override
	public Entity getEntity() {	
		Entity entity = new Entity();
		entity.setDate(new Date());
		entity.setId(1l);
		entity.setName("name");
		return entity;
	}
	@Override
    public Entity getUser( Long id/*, @Context HttpServletRequest request*/) {
        // test context injection
//        System.out.println("Client address from @Context injection: " + (request != null ? request.getRemoteAddr() : ""));
//        System.out.println("Client address from RpcContext: " + RpcContext.getContext().getRemoteAddressString());
		Entity entity = new Entity();
		entity.setDate(new Date());
		entity.setId(id);
		entity.setName("name");
		return entity;
    }
}
