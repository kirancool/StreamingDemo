package com.gridedge.twitter.meta;

import java.util.List;

public class Entities {
	
	private List<Hashtags> hashtags;
	public List<Hashtags> getHashtags() {
		return hashtags;
	}
	public void setHashtags(List<Hashtags> hashtags) {
		this.hashtags = hashtags;
	}
	public List<Urls> getUrls() {
		return urls;
	}
	public void setUrls(List<Urls> urls) {
		this.urls = urls;
	}
	public List<UserMentions> getUser_mentions() {
		return user_mentions;
	}
	public void setUser_mentions(List<UserMentions> user_mentions) {
		this.user_mentions = user_mentions;
	}
	public List<Symbols> getSymbols() {
		return symbols;
	}
	public void setSymbols(List<Symbols> symbols) {
		this.symbols = symbols;
	}
	public List<Media> getMedia() {
		return media;
	}
	public void setMedia(List<Media> media) {
		this.media = media;
	}
	private List<Urls> urls;
	private List<UserMentions> user_mentions;
	private List<Symbols> symbols;
	private List<Media> media; 
}
