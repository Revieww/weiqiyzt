package com.weiwei.weiqi.service.property.api;

import com.weiwei.weiqi.request.property.FavoriteLendEnter;
import com.weiwei.weiqi.response.base.GeneralResult;

public interface PropertyFavoriteLendService {

	GeneralResult save(FavoriteLendEnter favoriteLendEnter);

}
