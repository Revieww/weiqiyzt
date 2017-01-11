package com.weiwei.weiqi.service.patented.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import com.weiwei.common.constants.enums.ResultCodeEnum;
import com.weiwei.weiqi.jdbc.dao.customer.CustomerDao;
import com.weiwei.weiqi.jdbc.dao.patented.AchievementTransformDao;
import com.weiwei.weiqi.jdbc.dbmodel.patented.AchievementTransform;
import com.weiwei.weiqi.request.base.MyPageRequest;
import com.weiwei.weiqi.request.patented.ListEnter;
import com.weiwei.weiqi.response.base.DataResult;
import com.weiwei.weiqi.response.base.GeneralResult;
import com.weiwei.weiqi.response.base.PageData;
import com.weiwei.weiqi.response.patented.AchievementTransformResult;
import com.weiwei.weiqi.service.base.BaseServiceImpl;
import com.weiwei.weiqi.service.patented.api.AchievementTransformService;

@Component
public class AchievementTransformServiceImpl extends BaseServiceImpl implements AchievementTransformService {

	@Autowired
	private AchievementTransformDao transformDao;

	@Override
	public GeneralResult list(MyPageRequest myPageRequest, ListEnter listEnter) {

		Map<String, String[]> params = new HashMap<String, String[]>();
		Specification<AchievementTransform> spec = spec(params, AchievementTransform.class);
		Pageable pageable = getPageable(myPageRequest);

		Page<AchievementTransform> page = transformDao.findAll(spec, pageable);

		List<AchievementTransformResult> results = new ArrayList<AchievementTransformResult>();
		for (AchievementTransform achievementTransform : page.getContent()) {
			AchievementTransformResult result = new AchievementTransformResult();
			BeanUtils.copyProperties(achievementTransform, result);
			results.add(result);
		}
		PageData<AchievementTransformResult> pdata = new PageData<AchievementTransformResult>(page.getTotalPages(), page.getTotalElements(), results);
		return new DataResult<PageData<AchievementTransformResult>>(ResultCodeEnum.RESULT_SUCCESS, pdata);
	}
}
