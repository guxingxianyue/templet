package com.gdupt.usersys.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gdupt.usersys.entity.User;
import com.gdupt.usersys.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/show")
	public String showUser(int id,HttpServletRequest request) {
		User user=userService.getUserById(id);
		request.setAttribute("user",user);
		return "user_view";
	}

}
