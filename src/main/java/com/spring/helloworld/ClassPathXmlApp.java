package com.spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlApp 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean_classpath.xml");
		MessageCreator message = (MessageCreator) context.getBean("message_creator");
		message.getMessage();
		

	}

}
