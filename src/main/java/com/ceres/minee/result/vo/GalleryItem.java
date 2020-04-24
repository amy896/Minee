package com.ceres.minee.result.vo;

public class GalleryItem extends ResultItem{
	
	private String imgUrl;
	
	public GalleryItem(String title, String url,String imgUrl) {
		super(title, url);
		this.imgUrl = imgUrl;
	}

	public String getImgUrl() {return imgUrl;}

	public void setImgUrl(String imgUrl) {this.imgUrl = imgUrl;}
	
	
}
