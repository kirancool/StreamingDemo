package com.gridedge.twitter.meta;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="reTweets")
public class TwitCount {
	
	private String user_Id;
	public String getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}

	private String retweet;
	public String getRetweet() {
		return retweet;
	}

	public void setRetweet(String retweet) {
		this.retweet = retweet;
	}
	

	
}