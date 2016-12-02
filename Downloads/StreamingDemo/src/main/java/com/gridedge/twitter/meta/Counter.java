package com.gridedge.twitter.meta;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Counter")
public class Counter {

	private TwitCount twitCount;
	public TwitCount getTwitCount() {
		return twitCount;
	}
	public void setTwitCount(TwitCount twitCount) {
		this.twitCount = twitCount;
	}
	public UserCount getUserCount() {
		return userCount;
	}
	public void setUserCount(UserCount userCount) {
		this.userCount = userCount;
	}
	public LocationCount getLocationCount() {
		return locationCount;
	}
	public void setLocationCount(LocationCount locationCount) {
		this.locationCount = locationCount;
	}
	private UserCount userCount;
	private LocationCount locationCount;
}
