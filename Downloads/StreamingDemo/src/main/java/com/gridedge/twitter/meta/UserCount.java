package com.gridedge.twitter.meta;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="UserCount")
public class UserCount {
	private String id;
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
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	private String name;
	private Integer count;

}
