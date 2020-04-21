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
	
	private final int DATA_SIZE_PER_PAGE = 10;
	
	private ArrayList<ResultItem> fianlResults;
	private Pager pager;
	
	public ResultTestController() {
		fianlResults = new ArrayList();
		for(int i = 0; i < 140; i++) 
			fianlResults.add(null);
		
		pager = new Pager();
		pager.setLastPage(fianlResults.size(), DATA_SIZE_PER_PAGE);
	}
	
	@RequestMapping(value = "resultTest", method = RequestMethod.GET)
	public String resultTest(@RequestParam("page") int currentPage, Model model) {
		final int LAST_PAGE = pager.getLastPageNum();
		if((currentPage > 0) && (currentPage <= LAST_PAGE)) {
			// ...(다른 작업)...
			
			// 페이징
			pager.setLastPageNum(LAST_PAGE);
			pager.setBlock(currentPage);
			pager.addPagerToModel(model);
			
			return "resultTest";
		}
		else 
			return "wrongAccess";
	}

}
