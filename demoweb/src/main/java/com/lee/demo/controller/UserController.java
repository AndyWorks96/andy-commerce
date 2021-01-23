package com.lee.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lee.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	//远程注入 引用 远端
	@Reference
	private UserService userService;
	@RequestMapping("/showName")
	//表示返回值是一个输出不加代表跳转的页面 直接输出的部分
	@ResponseBody
	public String showName(){
		return userService.getName();
	}
}
