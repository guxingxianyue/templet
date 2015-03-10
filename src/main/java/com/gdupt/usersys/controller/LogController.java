package com.gdupt.usersys.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogController {
	
	/**
	 * 登录
	 * @return
	 */
	@RequestMapping("/login")
	public String login(HttpServletRequest request) {
		String path = request.getContextPath();
		String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path;
		request.getSession().setAttribute("ctx", basePath);
		return "login";
	}

}
