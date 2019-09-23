package com.spring.lifecycle;

public class MessageService 
{
	private String message;

	public String getMessage() 
	{
		System.out.println("MESSAGE : "+message);
		return message;
	}

	public void setMessage(String message) 
	{
		this.message = message;
	}
	
	public void init() 
	{
		System.out.println("MessageSerive IS INITIALIZING");
	}
	
	public void end() 
	{
		System.out.println("MessageService IS ENDING");
	}
	

}
