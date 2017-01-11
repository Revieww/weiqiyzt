package com.weiwei.weiqi.controller.patented;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weiwei.weiqi.annotation.AccessControl;
import com.weiwei.weiqi.request.base.MyPageRequest;
import com.weiwei.weiqi.request.login.LoginEnter;
import com.weiwei.weiqi.request.patented.ListEnter;
import com.weiwei.weiqi.response.base.GeneralResult;
import com.weiwei.weiqi.service.patented.api.AchievementTransformService;

@AccessControl(noSessionLogin = true)
@RestController
@RequestMapping("/achievementTransform")
public class AchievementTransformController {
	
	@Autowired
	private AchievementTransformService transformService;
	
	/**
	  * 
	  * @Title: list   
	  * @Description: TODO 
	  * @param @param request
	  * @param @param listEnter
	  * @param @return   
	  * @return GeneralResult    
	  * @throws
	  */
	@RequestMapping(value = "/list")
	public GeneralResult list(MyPageRequest request,ListEnter listEnter){
		return transformService.list(request,listEnter);
	}
}	
