package com.spring.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean_inheritance.xml");
		MessageService ms = (MessageService)context.getBean("message_service");
		ms.getMessage1();
		ms.getMessage2();
		
		MessageServiceChild msc = (MessageServiceChild)context.getBean("message_service1");
		msc.getMessage1();
		msc.getMessage2();//This is not defined in the xml. but it uses the parent message2 value
		msc.getMessage3();
		
		MessageServiceChild1 msc1 = (MessageServiceChild1)context.getBean("message_service2"); //using abstract template
		msc1.getMessage1();
		msc1.getMessage2();
		msc1.getMessage3();
	}

}
