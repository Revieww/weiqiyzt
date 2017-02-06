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
import com.weiwei.weiqi.jdbc.dao.property.PropertySellDao;
import com.weiwei.weiqi.jdbc.dbmodel.property.PropertyLend;
import com.weiwei.weiqi.jdbc.dbmodel.property.PropertySell;
import com.weiwei.weiqi.request.base.BaseEnter;
import com.weiwei.weiqi.request.base.MyPageRequest;
import com.weiwei.weiqi.request.property.LendDetailEnter;
import com.weiwei.weiqi.request.property.LendListEnter;
import com.weiwei.weiqi.request.property.LendSaveEnter;
import com.weiwei.weiqi.response.base.DataResult;
import com.weiwei.weiqi.response.base.GeneralResult;
import com.weiwei.weiqi.response.base.PageData;
import com.weiwei.weiqi.response.property.LendDetailResult;
import com.weiwei.weiqi.response.property.LendlistResult;
import com.weiwei.weiqi.service.base.BaseServiceImpl;
import com.weiwei.weiqi.service.property.api.PropertySellService;

@Component
public class PropertySellServiceImpl extends BaseServiceImpl implements PropertySellService {

	@Autowired
	private PropertySellDao sellDao;

	@Override
	public GeneralResult save(LendSaveEnter saveEnter, BaseEnter baseEnter) {
		PropertySell propertySell = new PropertySell();
		BeanUtils.copyProperties(saveEnter, propertySell);
		sellDao.save(propertySell);
		return new GeneralResult(ResultCodeEnum.RESULT_SUCCESS);
	}

	@Override
	public GeneralResult list(MyPageRequest myPageRequest, LendListEnter listEnter) {
		Map<String, String[]> params = new HashMap<String, String[]>();
		Specification<PropertySell> spec = spec(params, PropertySell.class);
		Pageable pageable = getPageable(myPageRequest);
		Page<PropertySell> page = sellDao.findAll(spec, pageable);
		List<LendlistResult> results = new ArrayList<LendlistResult>();
		for (PropertySell sell : page.getContent()) {
			LendlistResult result = new LendlistResult();
			BeanUtils.copyProperties(sell, result);
			results.add(result);
		}
		PageData<LendlistResult> pdata = new PageData<LendlistResult>(page.getTotalPages(), page.getTotalElements(), results);
		return new DataResult<PageData<LendlistResult>>(ResultCodeEnum.RESULT_SUCCESS, pdata);
	}

	@Override
	public GeneralResult detail(LendDetailEnter detailEnter) {
		PropertySell propertySell = sellDao.getOne(detailEnter.getId());
		LendDetailResult result = new LendDetailResult();
		BeanUtils.copyProperties(propertySell, result);
		
		//TODO 缺少轮播图片
		return new DataResult<LendDetailResult>(ResultCodeEnum.RESULT_SUCCESS,result);
	}
}
