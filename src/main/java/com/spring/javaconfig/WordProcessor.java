package com.spring.javaconfig;

public class WordProcessor 
{
	private SpellChecker spellCheker;
	public WordProcessor(SpellChecker spellChecker) 
	{
		this.spellCheker = spellChecker;
	}
	
	public void spellCheck() 
	{
		spellCheker.checkSpelling();
	}

}
