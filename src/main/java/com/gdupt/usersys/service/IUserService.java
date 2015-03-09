package com.gdupt.usersys.service;

import com.gdupt.usersys.entity.User;

/**
 * 用户service
 * @author cxq
 *
 */
public interface IUserService {
	
	/**
	 * 根据用户id获取用户信息
	 * @param id
	 * @return
	 */
	public User getUserById(int id);

}
