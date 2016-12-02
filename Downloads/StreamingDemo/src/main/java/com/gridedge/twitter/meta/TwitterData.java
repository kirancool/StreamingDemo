package com.gridedge.twitter.meta;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="TwitterData")
public class TwitterData {
	
	private String created_at;
	private Integer count;
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getDisplay_text_range() {
		return display_text_range;
	}
	public void setDisplay_text_range(String display_text_range) {
		this.display_text_range = display_text_range;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTruncated() {
		return truncated;
	}
	public void setTruncated(String truncated) {
		this.truncated = truncated;
	}
	public String getIn_reply_to_status_id() {
		return in_reply_to_status_id;
	}
	public void setIn_reply_to_status_id(String in_reply_to_status_id) {
		this.in_reply_to_status_id = in_reply_to_status_id;
	}
	public String getIn_reply_to_status_id_str() {
		return in_reply_to_status_id_str;
	}
	public void setIn_reply_to_status_id_str(String in_reply_to_status_id_str) {
		this.in_reply_to_status_id_str = in_reply_to_status_id_str;
	}
	public String getIn_reply_to_user_id() {
		return in_reply_to_user_id;
	}
	public void setIn_reply_to_user_id(String in_reply_to_user_id) {
		this.in_reply_to_user_id = in_reply_to_user_id;
	}
	public String getIn_reply_to_user_id_str() {
		return in_reply_to_user_id_str;
	}
	public void setIn_reply_to_user_id_str(String in_reply_to_user_id_str) {
		this.in_reply_to_user_id_str = in_reply_to_user_id_str;
	}
	public String getIn_reply_to_screen_name() {
		return in_reply_to_screen_name;
	}
	public void setIn_reply_to_screen_name(String in_reply_to_screen_name) {
		this.in_reply_to_screen_name = in_reply_to_screen_name;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getGeo() {
		return geo;
	}
	public void setGeo(String geo) {
		this.geo = geo;
	}
	public String getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getContributors() {
		return contributors;
	}
	public void setContributors(String contributors) {
		this.contributors = contributors;
	}
	public String getIs_quote_status() {
		return is_quote_status;
	}
	public void setIs_quote_status(String is_quote_status) {
		this.is_quote_status = is_quote_status;
	}
	public ExtendedTweet getExtended_tweet() {
		return extended_tweet;
	}
	public void setExtended_tweet(ExtendedTweet extended_tweet) {
		this.extended_tweet = extended_tweet;
	}
	public String getRetweet_count() {
		return retweet_count;
	}
	public void setRetweet_count(String retweet_count) {
		this.retweet_count = retweet_count;
	}
	public String getFavorite_count() {
		return favorite_count;
	}
	public void setFavorite_count(String favorite_count) {
		this.favorite_count = favorite_count;
	}
	public String getEntities() {
		return entities;
	}
	public void setEntities(String entities) {
		this.entities = entities;
	}
	public String getFavorited() {
		return favorited;
	}
	public void setFavorited(String favorited) {
		this.favorited = favorited;
	}
	public String getRetweeted() {
		return retweeted;
	}
	public void setRetweeted(String retweeted) {
		this.retweeted = retweeted;
	}
	public String getPossibly_sensitive() {
		return possibly_sensitive;
	}
	public void setPossibly_sensitive(String possibly_sensitive) {
		this.possibly_sensitive = possibly_sensitive;
	}
	public String getFilter_level() {
		return filter_level;
	}
	public void setFilter_level(String filter_level) {
		this.filter_level = filter_level;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getTimestamp_ms() {
		return timestamp_ms;
	}
	public void setTimestamp_ms(String timestamp_ms) {
		this.timestamp_ms = timestamp_ms;
	}
	private String id;
	private String id_str;
	public String getId_str() {
		return id_str;
	}
	public void setId_str(String id_str) {
		this.id_str = id_str;
	}
	private String text;
	private String display_text_range;
	private String source;
	private String truncated;
	private String in_reply_to_status_id;
	private String in_reply_to_status_id_str;
	private String in_reply_to_user_id;
	private String in_reply_to_user_id_str;
	private String in_reply_to_screen_name;
	private User user;
	private String geo;
	private String coordinates;	
	private String place;
	private String contributors;
	private String is_quote_status;
	private ExtendedTweet extended_tweet;
	private String retweet_count;
	private String favorite_count;
	private String entities;
	private String favorited;
	private String retweeted;
	private String possibly_sensitive;
	private String filter_level;
	private String lang;
	private String timestamp_ms;		

}
