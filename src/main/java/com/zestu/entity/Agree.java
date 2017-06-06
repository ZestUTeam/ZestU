package com.zestu.entity;

import java.io.Serializable;

/**
 * 用户点赞表
 * 
 * @author jose
 *
 */
public class Agree implements Serializable {
	private static final long serialVersionUID = -58681015907098647L;
	private Integer ano;
	private Integer aflah;
	// 用户外键
	private Integer auid;
	// 文章外键
	private Integer aaid;

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getAflah() {
		return aflah;
	}

	public void setAflah(Integer aflah) {
		this.aflah = aflah;
	}

	public Integer getAuid() {
		return auid;
	}

	public void setAuid(Integer auid) {
		this.auid = auid;
	}

	public Integer getAaid() {
		return aaid;
	}

	public void setAaid(Integer aaid) {
		this.aaid = aaid;
	}

}
