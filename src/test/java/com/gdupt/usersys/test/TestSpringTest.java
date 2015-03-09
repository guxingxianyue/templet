package com.gdupt.usersys.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gdupt.usersys.entity.User;
import com.gdupt.usersys.service.IUserService;

/**
 *  用spring+junit方式测试，需要用到spring-test-xxx.jar和junit-xx.jar包
 *  主要用来测试spring与mybatis的集成是否成功
 * @author cxq
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-context.xml","classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
public class TestSpringTest {
	@Autowired
	private IUserService userService;
	
	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
	@Test
	public void test() {
		User user=userService.getUserById(1);
		System.out.println(user.getName());
	}

}
