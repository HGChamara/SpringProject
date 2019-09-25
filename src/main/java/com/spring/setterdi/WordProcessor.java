package com.spring.setterdi;

public class WordProcessor 
{
	private SpellChecker spellCheker;

	public void setSpellChecker(SpellChecker spellChecker) 
	{
		this.spellCheker = spellChecker;
	}
	
	public SpellChecker getSpellChecker() 
	{
		return spellCheker;
	}
	
	public void spellCheck() 
	{
		spellCheker.checkSpelling();
	}

}
