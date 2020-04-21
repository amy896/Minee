package com.ceres.minee;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		return "home";
	}
	
	@RequestMapping(value = "search", method = RequestMethod.GET)
	public String search(@RequestParam("keyword") String keyword) {
		System.out.println("keyword : " + keyword);
		
		return "redirect:/resultAll?keyword=" + keyword + "&page=" + 1;
	}
	
}