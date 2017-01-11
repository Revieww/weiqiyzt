package com.weiwei.weiqi.service.patented.api;

import com.weiwei.weiqi.request.base.MyPageRequest;
import com.weiwei.weiqi.request.patented.ListEnter;
import com.weiwei.weiqi.response.base.GeneralResult;

public interface AchievementTransformService {

	GeneralResult list(MyPageRequest request, ListEnter listEnter);

}
