package com.hxcy.oss.cc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

import com.hxcy.oss.cc.domain.Room;

/**
 * 机房Dao
 * @author QPING
 */
@Component
public interface RoomDao extends PagingAndSortingRepository<Room, Long>, JpaSpecificationExecutor<Room> {
	
	/**
	 * 自定义sql查询语句
	 * 根据片区编号查询机房
	 * @param id  片区编号
	 * @return
	 */
	@Modifying
	@Query("select a from Room a where a.region.id = ?1")
	List<Room> findRoomByRegionId(Integer id);
	
	@Query("select a from Room a where a.sn = ?1")
	Room findRoomBySN(String sn);

}
