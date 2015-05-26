package cn.springmvc.test;

import cn.springmvc.model.User;
import cn.springmvc.service.UserService;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
	private UserService userService;
	@Before
	public void before(){
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        userService = (UserService) context.getBean("userServiceImp");
	}
	@Test
	public void getUser(){
		User user = userService.getUserById(1);
		System.out.println(user.getName()+"-------------------------"+user.getNickName());
	}
	
}
