package com.ceres.minee;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ceres.minee.vo.ListItem;
import com.ceres.minee.vo.ResultItem;

@Controller
public class ResultAllController {
	ArrayList<ResultItem> results;
	Pager pager;
	Calendar cal = Calendar.getInstance();
			
	public ResultAllController(){
		results = new ArrayList<ResultItem>();
		
		for(int i=0; i<30; i++) {
		results.add(new ListItem("네이버"+i, "http://www.naver.com", new Date(), "네이버 메인에서 다양한 정보와 유용한 컨텐츠를 만나 보세요."));
		}
		
		pager = new Pager();
	}
	
	
	@RequestMapping(value = "resultAll", method = RequestMethod.GET)
	public String resultAll(@RequestParam("page") int currentPage, Model model){
		final int LIST_SIZE = results.size();
		if((currentPage > 0) && (currentPage <= LIST_SIZE)) {
			// ...(다른 작업)...
			model.addAttribute("resultList",results);
			// 페이징
			pager.setLastPageNum(LIST_SIZE);
			pager.setBlock(currentPage);
			pager.addPagerToModel(model);
			
			return "resulAll";
			}
		else
			return "wrongAccess";
	}
}
