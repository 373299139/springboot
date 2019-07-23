package com.example.Eureka.app.controller;


import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Eureka.app.entity.User;
import com.example.Eureka.app.service.UserService;

@Controller
@RequestMapping("/userController")
public class UserController {

	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/sss")
	public String sss() {
		System.out.println("sss");
		
		return "sss";
	}
	@ResponseBody
	@RequestMapping("/user")
	public User sqs() {
		User u = userService.selectByPrimaryKey(1);
		
		return u;
	}
	
	@RequestMapping("/index")
	public String index() {
		User u = userService.selectByPrimaryKey(1);
		
		return "index";
	}
	@RequestMapping("/login")
	@RequiresRoles("admin")
	public String login() {
		
		return "jsp/login.jsp";
	}
	
	
}
