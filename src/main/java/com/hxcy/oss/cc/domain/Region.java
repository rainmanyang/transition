package com.hxcy.oss.cc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 区域
 * @author QPING
 */
@Entity
@Table(name="xm_region")
public class Region {
	//流水id
	private Integer id;
	//名称
	private String name;
	//描述
	private String description;
	//编码
	private String code;
	//上级区域
	private Integer parent_id;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="cc_seq_region")
	@SequenceGenerator(name = "cc_seq_region", sequenceName="cc_seq_region", initialValue = 1, allocationSize = 1)
	@Column(name = "ID")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getParent_id() {
		return parent_id;
	}
	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}

}
