package com.hxcy.oss.cc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 机槽Controller
 * @author QPING
 * 
 */
@Controller
@RequestMapping(value="/slot")
public class SlotController {
	
	@RequestMapping(value = "getAllInfo")
	public String getAllInfo(){
		return "slot/all_info";
	}

}
