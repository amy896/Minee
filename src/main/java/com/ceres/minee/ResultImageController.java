package com.ceres.minee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ceres.minee.vo.GalleryItem;

@Controller
public class ResultImageController {
	
	// 임시!!!
	private final int DATA_MAX_PER_PAGE = 15;
	private List<GalleryItem> galleryItemList;
	private Pager pager;
	
	// 임시영역!!
	// 서비스에서 해야 하는 부분!!
	public ResultImageController() {
		galleryItemList = new ArrayList<GalleryItem>();
		for(int i=0;i<20;i++) {
			GalleryItem galleryItem = new GalleryItem("title" + i, "http://www.naver.com", "http://placehold.it/116x70");
			galleryItemList.add(galleryItem);
		}
		
		Pager pager = new Pager();
		pager.setLastPage(galleryItemList.size(), DATA_MAX_PER_PAGE);
	}
	
	@RequestMapping(value = "resultImage", method = RequestMethod.GET)
	public String resultImage(@RequestParam("keyword") String keyword, @RequestParam("page") int currentPage, Model model) {
		final int LAST_PAGE = pager.getLastPageNum();
		if((currentPage > 0) && (currentPage <= LAST_PAGE)) {
			// ...(다른 작업)...
			
			// 페이징
			pager.setLastPageNum(LAST_PAGE);
			pager.setBlock(currentPage);
			pager.addPagerToModel(model);
			
			// 한 페이지에 들어가는 리스트
			List<GalleryItem> galleryList = new ArrayList<GalleryItem>();
			final int START_INDEX = (currentPage - 1) * DATA_MAX_PER_PAGE;
			final int END_CONDITION = START_INDEX + DATA_MAX_PER_PAGE;
			for(int index = START_INDEX; index < END_CONDITION; index++) {
				galleryList.add(galleryItemList.get(index));
			}
			
			model.addAttribute("galleryItemList", galleryList);
			
			return "resultImage";
		}
		else 
			return "wrongAccess";
	}
	
}
