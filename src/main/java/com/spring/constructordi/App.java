package com.spring.constructordi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean_constdi.xml");
		WordProcessor wp = (WordProcessor)context.getBean("word_processor");
		wp.spellCheck();

	}

}
