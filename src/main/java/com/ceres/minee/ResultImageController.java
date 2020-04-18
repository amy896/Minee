package com.ceres.minee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ResultImageController {
	
	@RequestMapping(value = "resultImage", method = RequestMethod.GET)
	public void resultImage() {
	}
	
}
