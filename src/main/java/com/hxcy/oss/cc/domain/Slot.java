package com.hxcy.oss.cc.domain;

/**
 * 机槽
 * @author QPING
 */
public class Slot {
	
	private String rfid;						// RFID标签
	private String name;					// 名称
	private Integer slotCount;			// 机槽数量
	private String status;				// 占用状态
	private String subrack;				// 所属机框名称
	
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
	public Integer getSlotCount() {
		return slotCount;
	}
	public void setSlotCount(Integer slotCount) {
		this.slotCount = slotCount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSubrack() {
		return subrack;
	}
	public void setSubrack(String subrack) {
		this.subrack = subrack;
	}
	public String getCabinet() {
		return cabinet;
	}
	public void setCabinet(String cabinet) {
		this.cabinet = cabinet;
	}
	private String cabinet;				// 所属机柜名称

}
