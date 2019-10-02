package com.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public WordProcessor wordProcessor() 
	{
		return new WordProcessor(spellChecker());
	}
	
	@Bean
	public SpellChecker spellChecker() 
	{
		return new SpellChecker();
	}
}
