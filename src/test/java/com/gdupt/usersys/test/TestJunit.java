package com.gdupt.usersys.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.gdupt.usersys.entity.User;
import com.gdupt.usersys.service.IUserService;

/**
 *  用junit方式测试，需要用到junit-xx.jar包
 *  主要用来测试spring与mybatis的集成是否成功
 * @author cxq
 *
 */
public class TestJunit {
	
	private ApplicationContext ac;
	private IUserService userService;
	
	/**
	 * 在@Test方法之前执行
	 */
	@Before
	public void init() {
		ac=new ClassPathXmlApplicationContext(new String[]{"spring-context.xml","spring-mybatis.xml","spring-mvc.xml"});
		ac=new ClassPathXmlApplicationContext();
	}
	
	/**
	 * 测试方法，用Junit测试，步骤：鼠标移到@Test上---右键---Run As---Junit Test
	 */
	@Test
	public void test() {
		User user=userService.getUserById(1);
		System.out.println(user.getName());
	}
	
	@Test
	public void tt() {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("user.dir"));
	}

}
