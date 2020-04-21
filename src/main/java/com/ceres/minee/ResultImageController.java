package com.ceres.minee;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ResultImageController {
	
	private ArrayList<String> finalResults;
	
	public void tempSetFianlResults() {
		finalResults = new ArrayList();
		finalResults.add("Hi,");
		finalResults.add("Hello~");
		finalResults.add("LOL");
	}
	
	@RequestMapping(value = "resultImage", method = RequestMethod.GET)
	public void resultImage() {
	}
	
}
