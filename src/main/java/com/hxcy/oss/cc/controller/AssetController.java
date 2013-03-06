package com.hxcy.oss.cc.controller;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hxcy.oss.cc.domain.Asset;
import com.hxcy.oss.cc.domain.Room;
import com.hxcy.oss.cc.service.AssetService;

@Controller
@RequestMapping("/asset")
public class AssetController {
	
	@Resource
	private AssetService assetService;
	
	@RequestMapping("/save")
	@ResponseBody
	public void save(Asset asset, String roomSn) {
		if (roomSn != null && !"".equals(roomSn = roomSn.trim())) {
			Room room = new Room();
			room.setSn(roomSn);
			asset.setRoom(room);
		}
		assetService.saveOrUpdate(asset);
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public void delete(String rfid) {
		assetService.delete(rfid);
	}

	@RequestMapping("/list")
	@ResponseBody
	public Page<Asset> list(String name, Integer regionId, String roomSn, Integer page, Integer size) {
		if (page == null || page < 0) {
			page = 0;
		}
		if (size == null || size <= 0) {
			size = 20;
		}
		return assetService.find(name, regionId, roomSn, page, size);
	}
	
}
