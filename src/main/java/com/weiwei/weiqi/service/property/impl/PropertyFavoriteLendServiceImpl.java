package com.weiwei.weiqi.service.property.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weiwei.common.constants.enums.ResultCodeEnum;
import com.weiwei.weiqi.jdbc.dao.property.PropertyFavoriteLendDao;
import com.weiwei.weiqi.jdbc.dao.property.PropertyLendDao;
import com.weiwei.weiqi.jdbc.dbmodel.property.PropertyFavoriteLend;
import com.weiwei.weiqi.request.property.FavoriteLendEnter;
import com.weiwei.weiqi.response.base.GeneralResult;
import com.weiwei.weiqi.service.base.BaseServiceImpl;
import com.weiwei.weiqi.service.property.api.PropertyFavoriteLendService;

@Component
public class PropertyFavoriteLendServiceImpl  extends BaseServiceImpl implements PropertyFavoriteLendService{
	
	@Autowired
	private PropertyFavoriteLendDao favoriteLendDao; 
	
	private PropertyLendDao lendDao;
	
	@Override
	public GeneralResult save(FavoriteLendEnter favoriteLendEnter) {
		
		PropertyFavoriteLend propertyFavoriteLend = new PropertyFavoriteLend();
		propertyFavoriteLend.setCustomerId(favoriteLendEnter.getUserId());
		propertyFavoriteLend.setPropertyLend(lendDao.getOne(favoriteLendEnter.getId()));
		favoriteLendDao.save(propertyFavoriteLend);
		
		return new GeneralResult(ResultCodeEnum.RESULT_SUCCESS);
	}

}
