package com.spring.scope.singleton;

public class MessageGen 
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
