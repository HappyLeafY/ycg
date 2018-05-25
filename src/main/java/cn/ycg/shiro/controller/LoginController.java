package cn.ycg.shiro.controller;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ycg.shiro.dao.User;

/**
*@description
*@author ycg
*@date Feb 9, 2018
*/
@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String login() {
		System.out.println("------登录页面-----"+System.getProperty("user.dir"));
		return "login";
	}
	
	@RequestMapping("/loginUser")
	public String loginUser(String userName,String passWord,HttpSession session) {
		UsernamePasswordToken usernamePasswordToken=new UsernamePasswordToken(userName,passWord);
		Subject subject=SecurityUtils.getSubject();
		try {
			//完成登录
			subject.login(usernamePasswordToken);
			User user=(User) subject.getPrincipal();
			session.setAttribute("user", user);
			return "index";
		} catch (Exception e) {
			//返回登录页面
			return "login";
		}
	}

	@RequestMapping("/logOut")
	public String logOut(HttpSession session) {
		Subject subject=SecurityUtils.getSubject();
		subject.logout();
		return "login";
	}
}
