package com.ceres.minee.vo;

import java.util.Calendar;
import java.util.Date;

public class VideoItem extends ListItem{
	private String imgUrl;

	public VideoItem(String title, String url, Date date, String dsc, String imgUrl) {
		super(title, url, date, dsc);
		this.imgUrl = imgUrl;
	}

	public String getImgUrl() {return imgUrl;}

	public void setImgUrl(String imgUrl) {this.imgUrl = imgUrl;}

}
