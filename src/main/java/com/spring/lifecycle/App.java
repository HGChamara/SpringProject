package com.spring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args)
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean_lifecycle.xml");
		MessageService ms = (MessageService)context.getBean("message_service");
		ms.getMessage();
		context.registerShutdownHook();
	}

}
