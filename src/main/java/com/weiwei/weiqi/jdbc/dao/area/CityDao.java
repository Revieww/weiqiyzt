package com.weiwei.weiqi.jdbc.dao.area;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.weiwei.weiqi.jdbc.dao.base.BaseJpaRepository;
import com.weiwei.weiqi.jdbc.dbmodel.area.Cities;

public interface CityDao extends BaseJpaRepository<Cities, Integer> {

	@Query("from Cities bean where bean.province.id = ?1")
	List<Cities> findCityListByProvinceId(int province_id);

}
