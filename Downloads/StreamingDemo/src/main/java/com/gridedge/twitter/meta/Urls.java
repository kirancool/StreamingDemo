package com.gridedge.twitter.meta;

import java.util.List;

public class Urls {
	
	private String url;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getExpanded_url() {
		return expanded_url;
	}
	public void setExpanded_url(String expanded_url) {
		this.expanded_url = expanded_url;
	}
	public String getDisplay_url() {
		return display_url;
	}
	public void setDisplay_url(String display_url) {
		this.display_url = display_url;
	}
	public List<Integer> getIndices() {
		return indices;
	}
	public void setIndices(List<Integer> indices) {
		this.indices = indices;
	}
	private String expanded_url;
	private String display_url;
	private List<Integer> indices; 

}
