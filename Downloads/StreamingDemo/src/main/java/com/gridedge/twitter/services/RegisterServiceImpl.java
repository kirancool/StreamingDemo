package com.gridedge.twitter.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@Service
public class RegisterServiceImpl {
	@Autowired
	TwitterServiceImpl twitterServiceImpl;
	
	public String getCountOnUser() throws JsonProcessingException{
		String result = null;
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		
		
		result = ow.writeValueAsString(twitterServiceImpl.findCountOnUser());
		return result;
	}
	public String getCountOnCountry() throws JsonProcessingException{
		String result = null;
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		
		
		result = ow.writeValueAsString(twitterServiceImpl.findCountOnCountry());
		return result;
	}
	public String getCountOnretweet() throws JsonProcessingException{
		String result = null;
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		
		
		result = ow.writeValueAsString(twitterServiceImpl.findCountOnretweet());
		return result;
	}
}