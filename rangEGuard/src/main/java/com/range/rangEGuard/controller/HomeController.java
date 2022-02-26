package com.range.rangEGuard.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping("/home.do")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("serverContry", "Korea");
		mav.setViewName("home");
		
		return mav;
	}
	
	@RequestMapping("/login.do")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("data", "login");
		mav.setViewName("login");
		
		return mav;
	}
	
	@RequestMapping("/main.do")
	public ModelAndView main() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("main");
		
		return mav;
	}
	
}
