package com.hxcy.oss.cc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 机框Controller
 * @author QPING
 *
 */
@Controller
@RequestMapping(value="/subrack")
public class SubrackController {
	
	@RequestMapping(value = "getAllInfo")
	public String getAllInfo(){
		return "subrack/all_info";
	}

}
