package com.springframework.spring5jokesappv2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {
	
	
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	/*public JokeServiceImpl() {
		chuckNorrisQuotes = new ChuckNorrisQuotes();
		
	}*/
	
	
	public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
		
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}


	@Override
	public String getJoke() {
		
		return chuckNorrisQuotes.getRandomQuote();
	}

	

}
