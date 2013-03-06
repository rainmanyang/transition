package com.hxcy.oss.cc.domain;


import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 基站
 * @author QPING
 *
 */
public class Station {
	
	private String rfid;					// RFID标签
	private String sn;						// 编号
	private String name;					// 名称
	private String type;					// 类型
	private String city;						// 地市
	private String county;					// 区县
	private String address;				// 地址
	private String longitude;				// 经度
	private String latitude;				// 纬度
	private String propertyRight;
	
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getPropertyRight() {
		return propertyRight;
	}
	public void setPropertyRight(String propertyRight) {
		this.propertyRight = propertyRight;
	}
	
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}

}
