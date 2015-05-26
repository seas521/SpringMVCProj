package cn.springmvc.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class UserController {
	
	private Logger logger = Logger.getLogger(UserController.class);
	
	private String username;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@RequestMapping("index")
	public ModelAndView index(){
		return new ModelAndView("index");
	}
	
	@RequestMapping("login")
	public ModelAndView login(){
		logger.debug("Test=========");
		return new ModelAndView("login");
	}

}
