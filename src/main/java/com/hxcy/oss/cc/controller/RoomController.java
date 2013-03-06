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
 * 机房Controller
 * @author QPING
 */
@Controller
@RequestMapping(value="/room")
public class RoomController {
	
	@Resource
	private RoomService roomService;
	@Resource
	private RegionService regionService;
	
	@RequestMapping(value = "/list")
	@ResponseBody
	public List<Room> list(Integer regionId){
		return roomService.findRoomByRegionId(regionId);
	}
	
	@RequestMapping(value = "getAllInfo")
	public String getAllInfo(Model model){
		List<Room> roomList = roomService.findAll();
		List<Region> regionList = regionService.getAllInfo();
		model.addAttribute("roomList", roomList);
		model.addAttribute("regionList", regionList);
		return "room/all_info";
	}
	
	@RequestMapping(value="toUpdate/{sn}")
	public String toUpdateRegion(@PathVariable("sn") String sn, Model model) {
		model.addAttribute("room", roomService.findRoomBySN(sn));
		List<Region> regionList = regionService.getAllInfo();
		model.addAttribute("regionList", regionList);
		return "room/room_update";
	}
	
	@RequestMapping(value = "update")
	public String updateRegion(@Valid @ModelAttribute("room") Room room, RedirectAttributes redirectAttributes) {
		roomService.updateRoom(room);
		redirectAttributes.addFlashAttribute("message", "更新机房" + room.getName() + "成功");
		return "redirect:/room/getAllInfo";
	}
	
	@RequestMapping("delete/{sn}")
	public String delete(@PathVariable("sn") String sn, RedirectAttributes redirectAttributes) {
		Room room = roomService.findRoomBySN(sn);
		/*List<Room> roomList = roomService.findRoomByRegionId(Integer.parseInt(id.toString()));
		//判断机房是否存在，存在则表示无法删除
		if(roomList!=null && roomList.size()>0){
			redirectAttributes.addFlashAttribute("message", "删除片区" + region.getName() + "失败");
		}else{
			regionService.delete(id);
			redirectAttributes.addFlashAttribute("message", "删除片区" + region.getName() + "成功");
		}*/
		return "redirect:/region/getAllInfo";
	}

}
