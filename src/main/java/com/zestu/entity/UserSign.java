package com.zestu.entity;

import java.io.Serializable;

/**
 * 用户等级表
 * 
 * @author jose
 *
 */
public class UserSign implements Serializable {
	private static final long serialVersionUID = 7678822118989107348L;
	private Integer Sno;
	private String sicon;
	private Integer sexperence;

	public Integer getSno() {
		return Sno;
	}

	public void setSno(Integer sno) {
		Sno = sno;
	}

	public String getSicon() {
		return sicon;
	}

	public void setSicon(String sicon) {
		this.sicon = sicon;
	}

	public Integer getSexperence() {
		return sexperence;
	}

	public void setSexperence(Integer sexperence) {
		this.sexperence = sexperence;
	}

}
