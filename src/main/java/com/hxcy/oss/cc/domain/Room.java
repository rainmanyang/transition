package com.hxcy.oss.cc.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 机房
 * @author QPING
 */

@Entity
@Table(name="xm_room")
public class Room {

	@Id
	private String sn;  // 编号
	private String name;  // 名称
	private String remark;  // 备注
	private String responsible;  // 责任人
	private String type;  // 类型
	private Integer inactive_collectors;  // 失效采集器个数
	@ManyToOne
	@JoinColumn(name = "region_id")
	private Region region;
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getResponsible() {
		return responsible;
	}
	public void setResponsible(String responsible) {
		this.responsible = responsible;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public Integer getInactive_collectors() {
		return inactive_collectors;
	}
	public void setInactive_collectors(Integer inactive_collectors) {
		this.inactive_collectors = inactive_collectors;
	}

}
