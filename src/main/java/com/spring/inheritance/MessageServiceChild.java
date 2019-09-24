package com.spring.inheritance;

public class MessageServiceChild 
{
	private String message1;
	private String message2;
	private String message3;
	
	public String getMessage1() 
	{
		System.out.println(message1);
		return message1;
	}

	public void setMessage1(String message1) 
	{
		this.message1 = message1;
	}

	public String getMessage2() 
	{
		System.out.println(message2);
		return message2;
	}

	public void setMessage2(String message2) 
	{
		this.message2 = message2;
	}
	
	public void init() 
	{
		System.out.println("MessageSerive IS INITIALIZING");
	}
	
	public void end() 
	{
		System.out.println("MessageService IS ENDING");
	}

	public String getMessage3() 
	{
		System.out.println(message3);
		return message3;
	}

	public void setMessage3(String message3) 
	{
		this.message3 = message3;
	}
	

}
