package com.zestu.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.zestu.entity.Test;
import com.zestu.entity.UserInfo;
import com.zestu.service.TestService;
import com.zestu.service.UserService;

import net.sf.json.JSONObject;

@Controller(value = "testAction")
public class TestAction extends ActionSupport {
	private static final long serialVersionUID = 299749387192243228L;
	
	@Autowired
	private TestService testService;
	@Autowired
	private UserService userService;
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
	public String userTest(){
		UserInfo userInfo = new UserInfo();
		userInfo.setUno(2);
		UserInfo temp =  userService.select(userInfo).get(0);
		String str = JSONObject.fromObject(temp).toString();
		System.out.println(str);
		return "success";
	}
}
