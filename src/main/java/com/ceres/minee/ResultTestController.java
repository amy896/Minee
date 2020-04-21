package com.ceres.minee;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ceres.minee.vo.ResultItem;

@Controller
public class ResultTestController {
	
	ArrayList<ResultItem> fianlResults;
	Pager pager;
	
	public ResultTestController() {
		fianlResults = new ArrayList();
		fianlResults.add(null);
		fianlResults.add(null);
		fianlResults.add(null);
		fianlResults.add(null);
		fianlResults.add(null);
		fianlResults.add(null);
		fianlResults.add(null);
		fianlResults.add(null);
		fianlResults.add(null);
		fianlResults.add(null);
		fianlResults.add(null);
		fianlResults.add(null);
		fianlResults.add(null);
		fianlResults.add(null);
		
		pager = new Pager();
	}
	
	@RequestMapping(value = "resultTest", method = RequestMethod.GET)
	public String resultTest(@RequestParam("page") int currentPage, Model model) {
		final int LIST_SIZE = fianlResults.size();
		if((currentPage > 0) && (currentPage <= LIST_SIZE)) {
			// ...(다른 작업)...
			
			// 페이징
			pager.setLastPageNum(LIST_SIZE);
			pager.setBlock(currentPage);
			pager.addPagerToModel(model);
			
			return "resultTest";
		}
		else 
			return "wrongAccess";
	}

}
