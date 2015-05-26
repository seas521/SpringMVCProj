package cn.springmvc.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.springmvc.service.UserService;
import cn.springmvc.service.VelocityTemplateService;

public class templateTest {
	private VelocityTemplateService velocityTemplate;
	
	@Before
	public void before(){
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
		velocityTemplate = (VelocityTemplateService) context.getBean("velocityTemplateServiceImp");
	}
	
	@Test
	public void getTmpl(){
		velocityTemplate.generateTmpl();
	}

}
