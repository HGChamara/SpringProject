package com.spring.helloworld;

public class MessageCreator 
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
	
}
