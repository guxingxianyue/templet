package com.gdupt.usersys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdupt.usersys.dao.UserMapper;
import com.gdupt.usersys.entity.User;
import com.gdupt.usersys.service.IUserService;

@Service("UserService")
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public User getUserById(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

	public List<User> getAllUsers() {
		return userMapper.selectAll();
	}

	public User findUser(String name, String password) {
		User user=new User(name,password);
		userMapper.getUserByNamePwd(user);
		return user;
	}

}
