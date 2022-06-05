package com.range.rangEGuard.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.range.rangEGuard.dto.MemberDto;
import com.range.rangEGuard.service.MemberService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@Inject
	private MemberService service;
	
	@RequestMapping(value="/login.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception{
		logger.info("home");
		List<MemberDto> memberList = service.selectAll();
		for (MemberDto memberDto : memberList) {
			System.out.println(memberDto);
		}
		model.addAttribute("memberList",memberList);
		
		return "home";
	}
	
//	@RequestMapping("/login.do")
//	public ModelAndView login() {
//		ModelAndView mav = new ModelAndView();
//
//		
//		mav.addObject("data", "login");
//		mav.setViewName("login");
//
//		return mav;
//	}
}