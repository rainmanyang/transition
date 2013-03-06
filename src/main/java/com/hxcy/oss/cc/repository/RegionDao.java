package com.hxcy.oss.cc.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

import com.hxcy.oss.cc.domain.Region;

/**
 * 片区Dao
 * @author QPING
 */
@Component
public interface RegionDao extends PagingAndSortingRepository<Region, Long>{
	
	@Query("select a from Region a where a.id = ?1")
	Region findRegionById(Integer id);

}
