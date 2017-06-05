package com.zestu.entity;

import java.io.Serializable;

public class Test implements Serializable {

	private static final long serialVersionUID = 3578905182857983389L;
	private Integer id;
	private String username;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
