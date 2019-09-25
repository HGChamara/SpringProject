package com.spring.constructordi;

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
