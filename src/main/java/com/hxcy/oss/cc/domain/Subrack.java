package com.hxcy.oss.cc.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 机框
 * @author QPING
 */
public class Subrack {
	/**
	 * RFID标签
	 */
	private String rfid;
	/**
	 * 编号
	 */
	private String sn;
	/**
	 * 名称
	 */
	private String name; 
	/**
	 * 机槽数量
	 */
	private Integer slotCount; 
	/**
	 * 占用状态
	 */
	private String status; 
	/**
	 * 所属机柜名称
	 */
	private String cabinet;
	
	public String getRfid() {
		return rfid;
	}
	public void setRfid(String rfid) {
		this.rfid = rfid;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
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
	public String getCabinet() {
		return cabinet;
	}
	public void setCabinet(String cabinet) {
		this.cabinet = cabinet;
	}
	
	
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}

}
