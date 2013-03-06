package com.hxcy.oss.cc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 基站Controller
 * @author QPING
 * 
 */
@Controller
@RequestMapping(value="/station")
public class StationController {
	
//	@Resource
//	private StationService stationService;
	
	@RequestMapping(value = "getAllInfo")
	public String getAllInfo(){
		return "station/all_info";
	}

}
