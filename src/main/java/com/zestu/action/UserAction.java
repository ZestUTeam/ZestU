package com.zestu.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zestu.entity.UserInfo;
import com.zestu.service.UserService;
import com.zestu.utils.DESUtil;
import com.zestu.utils.SimpleMailSend;

import net.sf.json.JSONObject;

@Controller(value = "userAction")
public class UserAction extends ActionSupport implements ModelDriven<UserInfo> {
	@Autowired
	private UserService userService;
	String result = null;
	String verifyCode = null;
	UserInfo userInfo = new UserInfo();

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public UserInfo getModel() {
		return userInfo;
	}
	
	//发送邮箱验证
	public String email() throws Exception{
		String content = (Math.random()*100) + "";
		SimpleMailSend.Send(userInfo.getUemail(), content);
		HttpSession session2 = ServletActionContext.getRequest().getSession();
		session2.setMaxInactiveInterval(60);
		session2.setAttribute("verifyCode", content);
		result = "邮箱发送成功！";
		return "SendSUCCESS";
		
	}
	
	//注册
	public String regist() throws Exception{
		HttpSession session = ServletActionContext.getRequest().getSession();
		String s = (String) session.getAttribute("verifyCode");
		if(s.equals(verifyCode)){
			//密码加密
			String password = DESUtil.Encode(userInfo.getUpassword());
			UserInfo userInfos = new UserInfo();
			userInfos.setUemail(userInfo.getUemail());
			userInfos.setUname(userInfo.getUname());
			//保存信息
			userService.add(userInfos);
			result = "RegiterSUCCESS";
		}else{
			result = "RegisterFAIL";
		}
		//保存信息
		return "RegiterSUCCESS";
		
	}
	
	//登录action
	public String login(){
		UserInfo userInfos = new UserInfo();
		String name = userInfo.getUname();
		String password = userInfo.getUpassword();
		userInfos.setUname(name);
		List<UserInfo> userInfo1 = userService.select(userInfos);
		for (UserInfo userInfo2 : userInfo1) {
			if(userInfo2.getUpassword().equals(userInfos.getUpassword())){
				result = "true";
			}else{
				result = "false";
			}
		}
		return "LoginSUCCESS";
		
	}

}
