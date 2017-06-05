package com.zestu.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.zestu.entity.Test;
import com.zestu.service.TestService;

import net.sf.json.JSONObject;

@Controller(value = "testAction")
public class TestAction extends ActionSupport {
	private static final long serialVersionUID = 299749387192243228L;
	
	@Autowired
	private TestService testService;
	private Integer id;
	private String result;
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String find() {
		Test test = testService.test(id);
		JSONObject object = JSONObject.fromObject(test);
		result = object.toString();
		System.out.println(result);
		return "result";
	}
}
