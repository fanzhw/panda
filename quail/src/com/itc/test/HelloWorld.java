package com.itc.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/test")
public class HelloWorld {

	@RequestMapping(value={"/","/logon"})
	public ModelAndView sayHello(){
		ModelAndView model = new ModelAndView("addSuccess");
		return model;
	}
	
}
