package com.gdupt.usersys.service;

import java.util.List;

import com.gdupt.usersys.entity.User;

/**
 * 用户service接口类
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
	
	/**
	 * 根据用户名，密码查找是否存在指定用户
	 * @param name 用户名
	 * @param password 密码
	 */
	public User findUser(String name,String password);

}
