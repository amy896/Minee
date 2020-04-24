package com.ceres.minee.result.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ceres.minee.result.Pager;
import com.ceres.minee.result.vo.ListItem;
import com.ceres.minee.result.vo.ResultItem;

@Controller
public class ResultAllController {
	
	private final int DATA_MAX_PER_PAGE = 10;
	ArrayList<ResultItem> results;
	Pager pager;
	Calendar cal = Calendar.getInstance();
			
	public ResultAllController(){
		results = new ArrayList<ResultItem>();
		
		for(int i=0; i<30; i++) {
		results.add(new ListItem("네이버"+i, "http://www.naver.com", new Date(), "네이버 메인에서 다양한 정보와 유용한 컨텐츠를 만나 보세요."));
		}
		
		pager = new Pager();
		pager.setLastPage(results.size(), DATA_MAX_PER_PAGE);
		
	}
	
	
	@RequestMapping(value = "resultAll", method = RequestMethod.GET)
	public String resultAll(@RequestParam("keyword") String keyword, @RequestParam("page") int currentPage, Model model){
		final int LIST_PAGE = pager.getLastPageNum();
		if((currentPage > 0) && (currentPage <= LIST_PAGE)) {
			//한페이지에 들어가는 리스트
			ArrayList<ResultItem> resultsList = new ArrayList<ResultItem>();
			final int START_INDEX = (currentPage - 1) * DATA_MAX_PER_PAGE;
			final int END_CONDITION = START_INDEX + DATA_MAX_PER_PAGE;
			final int ORIGINAL_SIZE = results.size();
			for(int index = START_INDEX; index < END_CONDITION && index < ORIGINAL_SIZE; index++) {
				resultsList.add(results.get(index));
			}
			
			model.addAttribute("keyword", keyword);
			model.addAttribute("resultList",resultsList);
			
			// 페이징
			pager.setLastPageNum(LIST_PAGE);
			pager.setBlock(currentPage);
			pager.addPagerToModel(model);
			
			return "resultAll";
			}
		else
			return "wrongAccess";
	}
	
}
