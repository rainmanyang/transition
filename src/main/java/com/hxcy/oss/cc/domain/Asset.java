package com.hxcy.oss.cc.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.domain.Persistable;

/**
 * 资产
 * 
 * @author 潘海春
 * @version 2012-10-25
 */
@Entity
@Table(name = "XM_ASSET")
public class Asset implements Persistable<String>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4214368848968627258L;
	
	public static final char STATUS_NORMAL = '1';	// 正常状态
	
	public static final char STATUS_DISCARD = '2';	// 废弃
	
	public static final char STATUS_REBUILD = '3';	// 返修
	
	public static final char STATUS_LOST = '4';		// 已丢失
	
	public static final char STATUS_MOVING = '5';	// 移动中

	@Id
	@Column(name = "RFID")
	private String rfid;		// 资产标签ID
	
	@Column(name = "NAME")
	private String name;		// 名称
	
	@ManyToOne
	@JoinColumn(name = "ROOM_SN")
	private Room room;			// 机房

	@Column(name = "LAST_CHECK_TIME")
	private Date lastCheckTime;	// 最后检查时间
	
	@Column(name = "STATUS")
	private char status;		// 状态

	public String getRfid() {
		return rfid;
	}

	public void setRfid(String rfid) {
		this.rfid = rfid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Date getLastCheckTime() {
		return lastCheckTime;
	}

	public void setLastCheckTime(Date lastCheckTime) {
		this.lastCheckTime = lastCheckTime;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	@Override
	public String getId() {
		return rfid;
	}

	@Override
	public boolean isNew() {
		return getId() == null;
	}
	
}
