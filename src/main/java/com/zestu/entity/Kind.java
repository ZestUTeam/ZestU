package com.zestu.entity;

import java.io.Serializable;

/**
 * 文章类别
 * 
 * @author jose
 *
 */
public class Kind implements Serializable {
	private static final long serialVersionUID = -475622080090968929L;
	private Integer kno;
	private String kname;

	public Integer getKno() {
		return kno;
	}

	public void setKno(Integer kno) {
		this.kno = kno;
	}

	public String getKname() {
		return kname;
	}

	public void setKname(String kname) {
		this.kname = kname;
	}

}
