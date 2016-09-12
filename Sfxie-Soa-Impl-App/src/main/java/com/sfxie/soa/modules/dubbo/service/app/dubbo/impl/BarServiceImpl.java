package com.sfxie.soa.modules.dubbo.service.app.dubbo.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sfxie.soa.dubbo.service.BaseRestfulService;
import com.sfxie.soa.modules.dubbo.service.app.dubbo.BarService;
import com.sfxie.soa.modules.dubbo.service.app.pojo.SfxieAppBar;

/**
 * 栏位服务实现
 * @author xiesf
 *
 */
@Service("barService")
public class BarServiceImpl extends BaseRestfulService  implements BarService {

	@Override
	public List<SfxieAppBar> getBarList(String userId) {
		return barList(userId);
	}
	
	private List<SfxieAppBar> barList(String userId){
		List<SfxieAppBar> list = new ArrayList<SfxieAppBar>();
		
		SfxieAppBar bar1 = new SfxieAppBar();
		bar1.setId_(1l);
		bar1.setName("测试栏目1");
		bar1.setBar_url("/dd/ss/test1.html");
		list.add(bar1);
		
		SfxieAppBar bar2 = new SfxieAppBar();
		bar2.setName("testBar2");
		bar1.setId_(2l);
		bar2.setBar_url("/dd/ss/test2.html");
		list.add(bar2);
		
		SfxieAppBar bar3 = new SfxieAppBar();
		bar3.setName("testBar3");
		bar1.setId_(3l);
		bar3.setBar_url("/dd/ss/test3.html");
		list.add(bar3);
		
		return list;
	}

}
