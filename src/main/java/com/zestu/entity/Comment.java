package com.zestu.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 评论表
 * 
 * @author jose
 *
 */
public class Comment implements Serializable {
	private static final long serialVersionUID = -8418539574683033066L;
	private Integer cno;
	private Date cdate;
	private String content;
	// 回复量
	private Integer ccounts;
	// 用户外键
	private Integer cuid;
	// 文章外键
	private Integer caid;

	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

	public Date getCdate() {
		return cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getCuid() {
		return cuid;
	}

	public void setCuid(Integer cuid) {
		this.cuid = cuid;
	}

	public Integer getCaid() {
		return caid;
	}

	public void setCaid(Integer caid) {
		this.caid = caid;
	}

	public Integer getCcounts() {
		return ccounts;
	}

	public void setCcounts(Integer ccounts) {
		this.ccounts = ccounts;
	}

}
