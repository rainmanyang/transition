package com.hxcy.oss.cc.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.domain.Persistable;


/**
 * 告警信息
 * 
 * @author 潘海春
 * @version 2012-10-25
 */
@Entity
@Table(name = "XM_WARNING")
public class Warning implements Persistable<Integer>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5034569420998718239L;
	
	public static final char TYPE_NORMAL = '1';		// 正常消息
	
	public static final char TYPE_WARNING = '2';	// 告警消息
	
	public static final char TYPE_FAULT = '3';		// 故障消息

	public static final char STATUS_SENT = '1';		// 已发送
	
	public static final char STATUS_UNSENT = '0';	// 未发送
	
	public static final char STATUS_PENDING = '1';	// 打开状态
	
	public static final char STATUS_CLOSED = '2';	// 关闭状态

	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="SEQ_XM_WARNING")
//	@SequenceGenerator(name = "SEQ_XM_WARNING", sequenceName="SEQ_XM_WARNING", initialValue = 1, allocationSize = 1)
	@Column(name = "ID")
	private Integer id;			// 流水ID

	@Column(name = "CONTENT")
	private String content;		// 内容
	
	@Column(name = "CREATE_TIME")
	private Date createTime;	// 创建时间
	
	@ManyToOne
	@JoinColumn(name = "ROOM_SN")
	private Room room;			// 机房
	
	@Column(name = "TYPE")
	private char type;			// 类型
	
	@Column(name = "SEND_TIME")
	private Date sendTime;		// 发送时间

	@Column(name = "SEND_STATUS")
	private char sendStatus;	// 发送状态

	@Column(name = "CLOSE_TIME")
	private  Date closeTime;	// 关闭时间	
	
	@Column(name = "OPINION")
	private String opinion;		// 处理意见

	@Column(name = "STATUS")
	private char status;		// 状态

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public char getSendStatus() {
		return sendStatus;
	}

	public void setSendStatus(char sendStatus) {
		this.sendStatus = sendStatus;
	}

	public Date getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(Date closeTime) {
		this.closeTime = closeTime;
	}

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	@Override
	public boolean isNew() {
		return getId() == null;
	}

}
