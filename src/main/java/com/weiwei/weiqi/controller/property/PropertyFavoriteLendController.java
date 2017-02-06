package com.weiwei.weiqi.controller.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weiwei.weiqi.request.base.BaseEnter;
import com.weiwei.weiqi.request.property.FavoriteLendEnter;
import com.weiwei.weiqi.request.property.LendSaveEnter;
import com.weiwei.weiqi.response.base.GeneralResult;
import com.weiwei.weiqi.service.property.api.PropertyFavoriteLendService;

@RestController
@RequestMapping("/announcement")
public class PropertyFavoriteLendController {
	
	@Autowired
	private PropertyFavoriteLendService favoriteLendService;
	
	@GetMapping("/save")
	public GeneralResult save(FavoriteLendEnter favoriteLendEnter){
		return favoriteLendService.save(favoriteLendEnter);
	}
	 
	
}
