package com.gridedge.twitter.controller;

import java.util.List;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.gridedge.twitter.meta.UserTweets;
import com.gridedge.twitter.services.RegisterServiceImpl;
import com.gridedge.twitter.services.TwitterServiceImpl;

@Controller
@RequestMapping(value = "twitter/data")
public class TwitterController {

	@Autowired
	TwitterServiceImpl twitterServiceImpl;

	@Autowired
	RegisterServiceImpl registerServiceImpl;
	
	@RequestMapping(value = "/getCountOnUser", method = RequestMethod.GET)
	public @ResponseBody String getCountOnUser()
			throws JsonProcessingException {	
		return registerServiceImpl.getCountOnUser();
	}
	@RequestMapping(value = "/getCountOnCountry", method = RequestMethod.GET)
	public @ResponseBody String getCountOnCountry()
			throws JsonProcessingException {	
		return registerServiceImpl.getCountOnCountry();
	}
	@RequestMapping(value = "/getCountOnretweet", method = RequestMethod.GET)
	public @ResponseBody String getCountOnretweet()
			throws JsonProcessingException {	
		return registerServiceImpl.getCountOnretweet();
	}
	

}
