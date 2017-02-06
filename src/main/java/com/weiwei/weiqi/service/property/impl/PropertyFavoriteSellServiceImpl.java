package com.weiwei.weiqi.service.property.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weiwei.common.constants.enums.ResultCodeEnum;
import com.weiwei.weiqi.jdbc.dao.property.PropertyFavoriteLendDao;
import com.weiwei.weiqi.jdbc.dao.property.PropertyFavoriteSellDao;
import com.weiwei.weiqi.jdbc.dao.property.PropertyLendDao;
import com.weiwei.weiqi.jdbc.dao.property.PropertySellDao;
import com.weiwei.weiqi.jdbc.dbmodel.property.PropertyFavoriteLend;
import com.weiwei.weiqi.jdbc.dbmodel.property.PropertyFavoriteSell;
import com.weiwei.weiqi.request.property.FavoriteLendEnter;
import com.weiwei.weiqi.response.base.GeneralResult;
import com.weiwei.weiqi.service.base.BaseServiceImpl;
import com.weiwei.weiqi.service.property.api.PropertyFavoriteLendService;
import com.weiwei.weiqi.service.property.api.PropertyFavoriteSellService;

@Component
public class PropertyFavoriteSellServiceImpl  extends BaseServiceImpl implements PropertyFavoriteSellService{
	
	@Autowired
	private PropertyFavoriteSellDao favoriteSellDao; 
	
	private PropertySellDao sellDao;
	
	@Override
	public GeneralResult save(FavoriteLendEnter favoriteLendEnter) {
		
		PropertyFavoriteSell sell = new PropertyFavoriteSell();
		sell.setCustomerId(favoriteLendEnter.getUserId());
		sell.setPropertySell(sellDao.getOne(favoriteLendEnter.getId()));
		favoriteSellDao.save(sell);
		
		return new GeneralResult(ResultCodeEnum.RESULT_SUCCESS);
	}

}
