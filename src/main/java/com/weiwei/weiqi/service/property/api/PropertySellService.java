package com.weiwei.weiqi.service.property.api;

import com.weiwei.weiqi.request.base.BaseEnter;
import com.weiwei.weiqi.request.base.MyPageRequest;
import com.weiwei.weiqi.request.property.LendDetailEnter;
import com.weiwei.weiqi.request.property.LendListEnter;
import com.weiwei.weiqi.request.property.LendSaveEnter;
import com.weiwei.weiqi.response.base.GeneralResult;

public interface PropertySellService {

	GeneralResult save(LendSaveEnter saveEnter, BaseEnter baseEnter);

	GeneralResult list(MyPageRequest request, LendListEnter listEnter);

	GeneralResult detail(LendDetailEnter detailEnter);
}
