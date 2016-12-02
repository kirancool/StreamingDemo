package com.gridedge.twitter.meta;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="userTweets")
public class UserTweets {
	private String user_Id;
	private String count;
	private String name;
	public String getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
