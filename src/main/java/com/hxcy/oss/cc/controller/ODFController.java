package com.hxcy.oss.cc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * ODF机架Controller
 * @author QPING
 * 
 */
@Controller
@RequestMapping(value="/odf")
public class ODFController {
	
	@RequestMapping(value = "getAllInfo")
	public String getAllInfo(){
		return "odf/all_info";
	}

}
