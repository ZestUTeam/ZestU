package com.zestu.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 回复评论
 * 
 * @author jose
 *
 */
public class Recomment implements Serializable {
	private static final long serialVersionUID = 1014174002684118654L;
	private Integer rno;
	private Date rdate;
	private String recontent;
	// 文章外键
	private Integer raid;
	// 评论外键
	private Integer rcid;
	// 用户外键
	private Integer ruid;

	public Integer getRno() {
		return rno;
	}

	public void setRno(Integer rno) {
		this.rno = rno;
	}

	public Date getRdate() {
		return rdate;
	}

	public void setRdate(Date rdate) {
		this.rdate = rdate;
	}

	public String getRecontent() {
		return recontent;
	}

	public void setRecontent(String recontent) {
		this.recontent = recontent;
	}

	public Integer getRaid() {
		return raid;
	}

	public void setRaid(Integer raid) {
		this.raid = raid;
	}

	public Integer getRcid() {
		return rcid;
	}

	public void setRcid(Integer rcid) {
		this.rcid = rcid;
	}

	public Integer getRuid() {
		return ruid;
	}

	public void setRuid(Integer ruid) {
		this.ruid = ruid;
	}

}
