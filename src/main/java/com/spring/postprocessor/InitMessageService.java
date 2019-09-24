package com.spring.postprocessor;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitMessageService implements BeanPostProcessor 
{
	public Object postProcessBeforeInitialization(Object bean, String beanName) 
	{
		System.out.println("postProcessBeforeInitialization() : "+beanName);
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) 
	{
		System.out.println("postProcessAfterInitialization() : "+beanName);
		return bean;
	}	
}
