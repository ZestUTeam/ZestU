package com.zestu.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 文章表
 * 
 * @author jose
 *
 */
public class Article implements Serializable {
	private static final long serialVersionUID = 6020628550028634208L;
	private Integer ano;
	private String atitle;
	private String acontent;
	private Date adate;
	private String aimg;
	// 外键，用户
	private Integer auno;
	// 外键，类别
	private Integer akno;
	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getAtitle() {
		return atitle;
	}

	public void setAtitle(String atitle) {
		this.atitle = atitle;
	}

	public String getAcontent() {
		return acontent;
	}

	public void setAcontent(String acontent) {
		this.acontent = acontent;
	}

	public Date getAdate() {
		return adate;
	}

	public void setAdate(Date adate) {
		this.adate = adate;
	}

	public String getAimg() {
		return aimg;
	}

	public void setAimg(String aimg) {
		this.aimg = aimg;
	}

	public Integer getAuno() {
		return auno;
	}

	public void setAuno(Integer auno) {
		this.auno = auno;
	}

	public Integer getAkno() {
		return akno;
	}

	public void setAkno(Integer akno) {
		this.akno = akno;
	}

}
