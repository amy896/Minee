package com.ceres.minee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ceres.minee.vo.GalleryItem;

@Controller
public class ResultImageController {
	
	@RequestMapping(value = "resultImage", method = RequestMethod.GET)
	public void resultImage(Model model) {
		List<GalleryItem> galleryItemList = new ArrayList<GalleryItem>();
		for(int i=0;i<20;i++) {
			GalleryItem galleryItem = new GalleryItem("title" + i, "http://www.naver.com", "http://placehold.it/116x70");
			galleryItemList.add(galleryItem);
		}
		model.addAttribute("galleryItemList", galleryItemList);
	}
	
}
