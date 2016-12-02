package com.gridedge.twitter.meta;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="countryTweets")
public class LocationCount {


	private String country;
	private Integer count;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}


}