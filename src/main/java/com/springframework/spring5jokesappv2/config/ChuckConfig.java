package com.springframework.spring5jokesappv2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/* This is Java Based Configuration 
 * @Configuration
public class ChuckConfig {
	
	@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes()
	{
		return new ChuckNorrisQuotes();
	}

}*/


// This is for XML based configuration
public class ChuckConfig {
	
	
	public ChuckNorrisQuotes chuckNorrisQuotes()
	{
		return new ChuckNorrisQuotes();
	}

}

