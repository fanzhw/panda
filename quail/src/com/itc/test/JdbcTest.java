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
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getName()+"       "+list.get(i).getAge());
		}
		System.out.println(list.size());
	}
}
