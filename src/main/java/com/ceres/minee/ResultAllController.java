package com.ceres.minee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ResultAllController {
	
	@RequestMapping(value = "resultAll", method = RequestMethod.GET)
	public void resultAll() {
	}
	
}
