package com.hxcy.oss.cc.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hxcy.oss.cc.domain.Station;
import com.hxcy.oss.cc.repository.StationDao;

@Component
public class StationService {
	
	private StationDao stationDao;
	
	public List<Station> getAllInfo(){
		return (List<Station>)stationDao.findAll();
	}

}
