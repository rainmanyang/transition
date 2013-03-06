package com.hxcy.oss.cc.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hxcy.oss.cc.domain.Region;
import com.hxcy.oss.cc.repository.RegionDao;

/**
 * 片区Service
 * @author QPING
 */

@Component
public class RegionService {
	
	@Resource
	private RegionDao regionDao;
	
	/**
	 * 查所有
	 * @return
	 */
	public List<Region> getAllInfo(){
		return (List<Region>)regionDao.findAll();
	}
	
	/**
	 * 根据id查单个
	 * @param id 
	 * @return
	 */
	public Region getRegion(Integer id){
		return regionDao.findRegionById(id);
	}
	
	/**
	 * 根据id删单个
	 * @param id
	 */
	@Transactional
	public void delete(Integer id){
		regionDao.delete(Long.parseLong(id.toString()));
	}
	
	/**
	 * 更新单个信息
	 */
	public void updateRegion(Region region){
		regionDao.save(region);
	}

}
