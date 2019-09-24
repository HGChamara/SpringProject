package com.spring.postprocessor;

public class MessageService 
{
	private String message;

	public String getMessage() 
	{
		System.out.println("Message : "+message);
		return message;
	}

	public void setMessage(String message) 
	{
		this.message = message;
	}
	
	public void init() 
	{
		System.out.println("inside init method");
	}
	
	public void end() 
	{
		System.out.println("inside end method");
	}
}
