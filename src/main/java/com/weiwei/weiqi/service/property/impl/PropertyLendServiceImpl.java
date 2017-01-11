package com.weiwei.weiqi.service.property.impl;

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
import com.weiwei.weiqi.jdbc.dao.property.PropertyLendDao;
import com.weiwei.weiqi.jdbc.dbmodel.patented.AchievementTransform;
import com.weiwei.weiqi.jdbc.dbmodel.property.PropertyLend;
import com.weiwei.weiqi.request.base.BaseEnter;
import com.weiwei.weiqi.request.base.MyPageRequest;
import com.weiwei.weiqi.request.property.LendListEnter;
import com.weiwei.weiqi.request.property.LendSaveEnter;
import com.weiwei.weiqi.response.base.DataResult;
import com.weiwei.weiqi.response.base.GeneralResult;
import com.weiwei.weiqi.response.base.PageData;
import com.weiwei.weiqi.response.patented.AchievementTransformResult;
import com.weiwei.weiqi.response.property.LendResult;
import com.weiwei.weiqi.service.base.BaseServiceImpl;
import com.weiwei.weiqi.service.property.api.PropertyLendService;

@Component
public class PropertyLendServiceImpl extends BaseServiceImpl implements PropertyLendService {
	
	@Autowired
	private PropertyLendDao propertyLendDao;

	@Override
	public GeneralResult save(LendSaveEnter saveEnter, BaseEnter baseEnter) {
		PropertyLend propertyLend = new PropertyLend();
		BeanUtils.copyProperties(saveEnter, propertyLend);
		propertyLendDao.save(propertyLend);
		return new GeneralResult(ResultCodeEnum.RESULT_SUCCESS);
	}

	@Override
	public GeneralResult list(MyPageRequest myPageRequest, LendListEnter listEnter) {
		Map<String, String[]> params = new HashMap<String, String[]>();
		Specification<PropertyLend> spec = spec(params, PropertyLend.class);
		Pageable pageable = getPageable(myPageRequest);
		Page<PropertyLend> page = propertyLendDao.findAll(spec, pageable);
		List<LendResult> results = new ArrayList<LendResult>();
		for (PropertyLend lend : page.getContent()) {
			LendResult result = new LendResult();
			BeanUtils.copyProperties(lend, result);
			results.add(result);
		}
		PageData<LendResult> pdata = new PageData<LendResult>(page.getTotalPages(), page.getTotalElements(), results);
		return new DataResult<PageData<LendResult>>(ResultCodeEnum.RESULT_SUCCESS, pdata);
	}
}
