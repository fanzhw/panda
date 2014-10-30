package com.itc.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTest {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		UserService service = (UserService) context.getBean("userService");
		List<User> list = service.getUsers();
		System.out.println(list.size());
	}
}
