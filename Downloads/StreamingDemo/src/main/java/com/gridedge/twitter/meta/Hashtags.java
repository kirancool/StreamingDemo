package com.gridedge.twitter.meta;

import java.util.List;

public class Hashtags {
	
	private String text;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public List<Integer> getIndices() {
		return indices;
	}
	public void setIndices(List<Integer> indices) {
		this.indices = indices;
	}
	private List<Integer> indices;

}
