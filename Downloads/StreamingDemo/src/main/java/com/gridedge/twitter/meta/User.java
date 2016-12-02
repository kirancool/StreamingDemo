package com.gridedge.twitter.meta;

public class User {

	private String id;
	private String id_str;
	public String getId_str() {
		return id_str;
	}
	public void setId_str(String id_str) {
		this.id_str = id_str;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getFollowers_count() {
		return followers_count;
	}
	public void setFollowers_count(String followers_count) {
		this.followers_count = followers_count;
	}
	public String getFriends_count() {
		return friends_count;
	}
	public void setFriends_count(String friends_count) {
		this.friends_count = friends_count;
	}
	public String getListed_count() {
		return listed_count;
	}
	public void setListed_count(String listed_count) {
		this.listed_count = listed_count;
	}
	public String getFavourites_count() {
		return favourites_count;
	}
	public void setFavourites_count(String favourites_count) {
		this.favourites_count = favourites_count;
	}
		
	private String name;	
	private String location;	
	private String followers_count;
	private String friends_count;
	private String listed_count;
	private String favourites_count;	
	
}
