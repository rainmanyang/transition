package com.hxcy.oss.cc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springside.modules.persistence.SearchFilter;
import org.springside.modules.persistence.SearchFilter.Operator;

import com.hxcy.oss.cc.domain.Warning;
import com.hxcy.oss.cc.service.WarningService;

@Controller
@RequestMapping("/warning")
public class WarningController {
	
	@Resource
	private WarningService warningService;
	
	@RequestMapping("/close")
	@ResponseBody
	public void close(Integer id, String opinion) {
		warningService.close(id, opinion);
	}

	@RequestMapping("/list")
	@ResponseBody
	public Page<Warning> list(Date createTimeStart, Date createTimeEnd, 
			Integer regionId, String roomSn, 
			String type, String status, Integer page, Integer size) {
		if (page == null || page < 0) {
			page = 0;
		}
		if (size == null || size <= 0) {
			size = 20;
		}
		List<SearchFilter> filters = new ArrayList<SearchFilter>();
		if (!StringUtils.isBlank(type)) {
			filters.add(new SearchFilter("type", Operator.EQ, type.trim().charAt(0)));
		}
		if (!StringUtils.isBlank(status)) {
			filters.add(new SearchFilter("status", Operator.EQ, status.trim().charAt(0)));
		}
		if (regionId != null) {
			filters.add(new SearchFilter("room.region_id", Operator.EQ, regionId));
		}
		if (!StringUtils.isBlank(roomSn)) {
			filters.add(new SearchFilter("room.sn", Operator.EQ, roomSn));
		}
		if (createTimeStart != null) {
			filters.add(new SearchFilter("createTime", Operator.GTE, createTimeStart));
		}
		if (createTimeEnd != null) {
			filters.add(new SearchFilter("createTime", Operator.LT, DateUtils.addDays(createTimeEnd, 1)));
		}
		return warningService.find(filters, page, size);
	}
	
}
