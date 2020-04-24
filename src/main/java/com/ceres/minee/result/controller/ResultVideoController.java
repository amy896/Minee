package com.ceres.minee.result.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ceres.minee.result.Pager;
import com.ceres.minee.result.vo.VideoItem;

@Controller
public class ResultVideoController {
	
	// 임시!!!
	private final int DATA_MAX_PER_PAGE = 10;
	private List<VideoItem> originalVideoList;
	private Pager pager;
	
	public ResultVideoController() {
		// 임시영역!!
		// 서비스에서 해야 하는 부분!!
		originalVideoList = new ArrayList<VideoItem>();
		for(int i=0;i<132;i++) {
			VideoItem video = new VideoItem("title"+i, "http://www.naver.com", new Date(), "dcs"+i,"http://placehold.it/116x70");
			originalVideoList.add(video);			
		}
		
		pager = new Pager();
		pager.setLastPage(originalVideoList.size(), DATA_MAX_PER_PAGE);
	}
	
	@RequestMapping(value = "resultVideo", method = RequestMethod.GET)
	public String resultVideo(@RequestParam("keyword") String keyword, @RequestParam("page") int currentPage, Model model) {
		final int LAST_PAGE = pager.getLastPageNum();
		if((currentPage > 0) && (currentPage <= LAST_PAGE)) {
			// 한 페이지에 들어가는 리스트
			List<VideoItem> videoList = new ArrayList<VideoItem>();
			final int START_INDEX = (currentPage - 1) * DATA_MAX_PER_PAGE;
			final int END_CONDITION = START_INDEX + DATA_MAX_PER_PAGE;
			final int ORIGINAL_SIZE = originalVideoList.size();
			for(int index = START_INDEX; index < END_CONDITION && index < ORIGINAL_SIZE; index++) {
				videoList.add(originalVideoList.get(index));
			}

			model.addAttribute("keyword", keyword);
			model.addAttribute("videoItemList", videoList);

			// 페이징
			pager.setLastPageNum(LAST_PAGE);
			pager.setBlock(currentPage);
			pager.addPagerToModel(model);

			return "result/resultVideo";
		}
		else 
			return "result/wrongAccess";
	}
	
}
