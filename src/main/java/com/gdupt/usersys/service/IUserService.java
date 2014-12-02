package com.gdupt.usersys.service;

import java.util.List;

import com.gdupt.usersys.entity.User;

/**
 * 用户service
 * @author cxq
 *
 */
public interface IUserService {
	
	/**
	 * 根据用户id获取指定用户记录
	 * @param id
	 * @return
	 */
	public User getUserById(int id);
	
	/**
	 * 获取所有用户记录
	 * @return
	 */
	public List<User> getAllUsers();

}
