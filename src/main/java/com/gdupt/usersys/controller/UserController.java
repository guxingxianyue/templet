package com.gdupt.usersys.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

	/**
	 * 显示指定id的用户信息
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("{id}")
	public String showUser(@PathVariable int id,HttpServletRequest request) {
		User user=userService.getUserById(id);
		request.setAttribute("user",user);
		return "user_view";
	}
	
	/**
	 * 显示所有用户信息
	 * @param model
	 * @return
	 */
	@RequestMapping("/all") 	 	
	public String showAllUsers(Model model){
		List<User> users=userService.getAllUsers();
		model.addAttribute("users", users);
		return "user_list";
	}

}
