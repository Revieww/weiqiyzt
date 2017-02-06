package com.weiwei.weiqi.service.property.api;

import com.weiwei.weiqi.request.property.FavoriteLendEnter;
import com.weiwei.weiqi.response.base.GeneralResult;

public interface PropertyFavoriteSellService {

	GeneralResult save(FavoriteLendEnter favoriteLendEnter);

}
