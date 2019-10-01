package com.spring.injectcollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean_collections.xml");
		JavaCollections javaCollections = (JavaCollections)context.getBean("java_collections");
		javaCollections.getList();
		javaCollections.getMap();
		javaCollections.getProperties();
		javaCollections.getSet();
	}

}
