package com.zestu.entity;

import java.io.Serializable;

/**
 * 文章状态表
 * 
 * @author jose
 *
 */
public class Look implements Serializable {
	private static final long serialVersionUID = 3728775037081231353L;
	private Integer lno;
	// 点赞量
	private Integer lagree;
	// 点击量
	private Integer lclick;
	// 文章外键
	private Integer laid;

	public Integer getLno() {
		return lno;
	}

	public void setLno(Integer lno) {
		this.lno = lno;
	}

	public Integer getLagree() {
		return lagree;
	}

	public void setLagree(Integer lagree) {
		this.lagree = lagree;
	}

	public Integer getLclick() {
		return lclick;
	}

	public void setLclick(Integer lclick) {
		this.lclick = lclick;
	}

	public Integer getLaid() {
		return laid;
	}

	public void setLaid(Integer laid) {
		this.laid = laid;
	}

}
