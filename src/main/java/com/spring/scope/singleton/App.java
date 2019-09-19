package com.spring.scope.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean_singleton.xml");
		MessageGen msg1 = (MessageGen) context.getBean("msg_gen");
		msg1.getMessage();
		msg1.setMessage("test 2");
		
		MessageGen msg2 = (MessageGen) context.getBean("msg_gen");
		msg2.getMessage();

	}

}
