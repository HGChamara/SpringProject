package com.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		WordProcessor wp = (WordProcessor)context.getBean(WordProcessor.class);
		wp.spellCheck();

	}

}
