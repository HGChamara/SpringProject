package com.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageCreator 
{
	@Autowired
	@Qualifier("spellChecker")
	private SpellChecker spellChecker;
	private String message;

	public void spellCheck() 
	{
		spellChecker.checkSpelling();
	}
	
	public String getMessage()
	{
		System.out.println("Message : "+message);
		return message;
	}

	public void setMessage(String message) 
	{
		this.message = message;
	}

	public SpellChecker getSpellChecker() 
	{
		return spellChecker;
	}
	
}
