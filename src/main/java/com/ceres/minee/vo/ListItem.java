package com.ceres.minee.vo;

import java.util.Calendar;

public class ListItem extends ResultItem{
	private Calendar date;
	private String dsc;
	
	public ListItem(String title, String url, Calendar date,String dsc) {
		super(title, url);
		this.date = date;
		this.dsc = dsc;
	}

	public Calendar getDate() {return date;}

	public void setDate(Calendar date) {this.date = date;}

	public String getDsc() {return dsc;}

	public void setDsc(String dsc) {this.dsc = dsc;}

}
