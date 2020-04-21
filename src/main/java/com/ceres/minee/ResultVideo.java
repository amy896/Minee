package com.ceres.minee;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ceres.minee.vo.VideoItem;

@Controller
public class ResultVideo {
	
	@RequestMapping(value = "resultVideo", method = RequestMethod.GET)
	public void resultVideo(Model model) {
		List<VideoItem> videoItemList = new ArrayList<VideoItem>();
		
		for(int i=0;i<20;i++) {
			VideoItem video = new VideoItem("title"+i, "http://www.naver.com", Calendar.getInstance(), "dcs"+i,"http://placehold.it/116x70");
			videoItemList.add(video);			
		}
		
		model.addAttribute("videoItemList", videoItemList);		
	}
	
}
