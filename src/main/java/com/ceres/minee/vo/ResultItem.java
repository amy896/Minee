package com.ceres.minee.vo;

public class ResultItem {
	private String title;
	private String url;
	
	public ResultItem(String title, String url) {
		super();
		this.title = title;
		this.url = url;
	}

	public String getTitle() {return title;}

	public void setTitle(String title) {this.title = title;}
}
