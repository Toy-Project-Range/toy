package com.range.rangEGuard.controller;

import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.range.rangEGuard.service.MemberService;

public class MemberController {
	@Autowired
	MemberService service;
	
	@RequestMapping("/join.do")
	public String join(Model model, HttpServletRequest request){
		ModelAndView mav = new ModelAndView();

		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		String userName = request.getParameter("userName");
	
		service.memberRegister(userId, userPw, userName);
		mav.addObject("userId", userId);
		mav.addObject("userPw", userPw);
		mav.addObject("userName", userName);
		return "login";
		
		
	}
	
	
	
	 @RequestMapping("/login.do")
	    public ModelAndView login(Model model, HttpServletRequest request) {
		 	String userId = request.getParameter("userId");
		 	String userPw = request.getParameter("userPw");
	        ModelAndView mav = new ModelAndView();

	        mav.addObject("data", "loginProc");
	        mav.setViewName("loginProc");

	        return mav;
	    }
	    
	    @RequestMapping("/loginProc")
	    public ModelAndView loginChk() {
	        ModelAndView mav = new ModelAndView();
	            mav.setViewName("main"); // 酉곗쓽 �씠由�
	        return mav;
	    }
}
