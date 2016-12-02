package com.gridedge.twitter.meta;

public class ExtendedTweet {

	private String full_text;
	public String getFull_text() {
		return full_text;
	}
	public void setFull_text(String full_text) {
		this.full_text = full_text;
	}
	public String getDisplay_text_range() {
		return display_text_range;
	}
	public void setDisplay_text_range(String display_text_range) {
		this.display_text_range = display_text_range;
	}
	public Entities getEntities() {
		return entities;
	}
	public void setEntities(Entities entities) {
		this.entities = entities;
	}
	public ExtendedEntities getExtended_entities() {
		return extended_entities;
	}
	public void setExtended_entities(ExtendedEntities extended_entities) {
		this.extended_entities = extended_entities;
	}
	private String display_text_range;
	private Entities entities;
	private ExtendedEntities extended_entities;	
}
