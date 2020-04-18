package com.ceres.minee;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ResultImageController {
	
	public void tempSetFianlResults() {
		
	}
	
	@RequestMapping(value = "resultImage", method = RequestMethod.GET)
	public void resultImage() {
		ArrayList<String> finalResults = new ArrayList();
		finalResults.add("Hi,");
		finalResults.add("Hello~");
		finalResults.add("LOL");
	}
	
	public boolean nextPage(int pageNumber) {
		
	}
	
}
