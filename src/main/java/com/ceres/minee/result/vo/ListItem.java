package com.ceres.minee.result.vo;

import java.util.Date;

public class ListItem extends ResultItem{
	private Date date;
	private String dsc;
	
	public ListItem(String title, String url, Date date,String dsc) {
		super(title, url);
		this.date = date;
		this.dsc = dsc;
	}

	public Date getDate() {return date;}

	public void setDate(Date date) {this.date = date;}

	public String getDsc() {return dsc;}

	public void setDsc(String dsc) {this.dsc = dsc;}

}
