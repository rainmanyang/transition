package com.hxcy.oss.cc.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hxcy.oss.cc.domain.Room;
import com.hxcy.oss.cc.repository.RoomDao;

/**
 * 机房Service
 * @author QPING
 */
@Component
public class RoomService {
	
	@Resource
	private RoomDao roomDao;
	
	/**
	 * 根据片区id 查询机房
	 * @param id 片区id
	 * @return
	 */
	public List<Room> findRoomByRegionId(Integer id){
		List<Room> roomList = roomDao.findRoomByRegionId(id);
		if(roomList!=null && roomList.size()>0){
			return roomList;
		}
		return null;
	}
	
	/**
	 * 查所有
	 * @return
	 */
	public List<Room> findAll(){
		return (List<Room>)roomDao.findAll();
	}
	
	/**
	 * 根据编号查单个信息
	 * @param sn 编号
	 * @return
	 */
	public Room findRoomBySN(String sn){
		return roomDao.findRoomBySN(sn);
	}
	
	/**
	 * 跟新单个信息
	 * @param room 机房类
	 */
	@Transactional
	public void updateRoom(Room room){
		roomDao.save(room);
	}
	
	/**
	 * 根据实体类删除单个信息
	 * @param room 机房类
	 */
	@Transactional
	public void delete(Room room){
		roomDao.delete(room);
	}
}
