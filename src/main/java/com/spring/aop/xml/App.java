package com.spring.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_aop.xml");
		User user = (User)context.getBean("user");
		user.getName();
		user.getAge();
		user.throwingException();
	}
}
