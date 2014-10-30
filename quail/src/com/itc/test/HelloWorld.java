package com.itc.test;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/test")
public class HelloWorld {

	@RequestMapping(value={"/","/logon"})
	public ModelAndView sayHello(){
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		UserService service = (UserService) context.getBean("userService");
		List<User> list = service.getUsers();
		System.out.println(list.size());
		ModelAndView model = new ModelAndView("addSuccess");
		return model;
	}
	
}
