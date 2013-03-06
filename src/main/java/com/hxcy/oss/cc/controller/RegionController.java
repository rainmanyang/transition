package com.hxcy.oss.cc.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hxcy.oss.cc.domain.Region;
import com.hxcy.oss.cc.domain.Room;
import com.hxcy.oss.cc.service.RegionService;
import com.hxcy.oss.cc.service.RoomService;

/**
 * 片区Controller
 * @author QPING
 */
@Controller
@RequestMapping("/region")
public class RegionController {
	
	@Resource
	private RegionService regionService;
	@Resource
	private RoomService roomService;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<Region> list(){
		return regionService.getAllInfo();
	}
	
	@RequestMapping("getAllInfo")
	public String getAllInfo(Model model){
		List<Region> regionList = regionService.getAllInfo();
		model.addAttribute("regionList",regionList);
		return "region/all_info";
	}
	
	@RequestMapping("delete/{id}")
	public String delete(@PathVariable("id") Integer id, RedirectAttributes redirectAttributes) {
		Region region = regionService.getRegion(id);
		List<Room> roomList = roomService.findRoomByRegionId(id);
		//判断机房是否存在，存在则表示无法删除
		if(roomList!=null && roomList.size()>0){
			redirectAttributes.addFlashAttribute("message", "删除片区" + region.getName() + "失败");
		}else{
			regionService.delete(id);
			redirectAttributes.addFlashAttribute("message", "删除片区" + region.getName() + "成功");
		}
		return "redirect:/region/getAllInfo";
	}
	
	@RequestMapping(value = "toUpdate/{id}")
	public String toUpdateRegion(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("region", regionService.getRegion(id));
		return "region/region_update";
	}
	
	@RequestMapping(value = "update")
	public String updateRegion(@Valid @ModelAttribute("preloadUser") Region region, RedirectAttributes redirectAttributes) {
		regionService.updateRegion(region);
		redirectAttributes.addFlashAttribute("message", "更新片区" + region.getName() + "成功");
		return "redirect:/region/getAllInfo";
	}

}
