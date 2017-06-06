package com.zestu.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户个人信息表
 * 
 * @author jose
 *
 */
public class UserInfo implements Serializable {
	private static final long serialVersionUID = -3856860229714296120L;
	private Integer uno;
	private String uname;
	private String upassword;
	// 等级
	private Integer usign;
	private String uemail;
	// 头像
	private String uicon;
	private Date ubirthday;
	private String uphone;
	// 个人简介
	private String udescription;
	// 经验
	private Integer uexperience;
	// 是否签到
	private Integer uget;

	public Integer getUno() {
		return uno;
	}

	public void setUno(Integer uno) {
		this.uno = uno;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public Integer getUsign() {
		return usign;
	}

	public void setUsign(Integer usign) {
		this.usign = usign;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUicon() {
		return uicon;
	}

	public void setUicon(String uicon) {
		this.uicon = uicon;
	}

	public Date getUbirthday() {
		return ubirthday;
	}

	public void setUbirthday(Date ubirthday) {
		this.ubirthday = ubirthday;
	}

	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public String getUdescription() {
		return udescription;
	}

	public void setUdescription(String udescription) {
		this.udescription = udescription;
	}

	public Integer getUexperience() {
		return uexperience;
	}

	public void setUexperience(Integer uexperience) {
		this.uexperience = uexperience;
	}

	public Integer getUget() {
		return uget;
	}

	public void setUget(Integer uget) {
		this.uget = uget;
	}

}
