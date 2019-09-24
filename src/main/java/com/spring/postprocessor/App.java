package com.spring.postprocessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean_postprocessor.xml");
		MessageService msgService = (MessageService)context.getBean("message_service");
		msgService.getMessage();
	}

}
