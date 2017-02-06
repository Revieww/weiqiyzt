package com.weiwei.weiqi.controller.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weiwei.weiqi.request.property.FavoriteLendEnter;
import com.weiwei.weiqi.response.base.GeneralResult;
import com.weiwei.weiqi.service.property.api.PropertyFavoriteSellService;

@RestController
@RequestMapping("/announcement")
public class PropertyFavoriteSellController {
	
	@Autowired
	private PropertyFavoriteSellService favoriteSellService;
	
	@GetMapping("/save")
	public GeneralResult save(FavoriteLendEnter favoriteLendEnter){
		return favoriteSellService.save(favoriteLendEnter);
	}
	 
	
}
