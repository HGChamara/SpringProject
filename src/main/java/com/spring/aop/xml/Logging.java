package com.spring.aop.xml;

public class Logging 
{

	public void beforeAdvice() 
	{
		System.out.println("Log : Before setup user");
	}
	
	public void afterAdvice() 
	{
		System.out.println("Log : After setup the user");
	}
	
	public void afterReturningAdvice(Object retVal) 
	{
		System.out.println("Log : After return method : "+retVal.toString());
	}
	
	public void afterThrowingAdvice(IllegalArgumentException ex) 
	{
		System.out.println("Log : After throwing advice : "+ex.toString());
	}
}
