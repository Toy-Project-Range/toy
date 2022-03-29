package com.range.rangEGuard.controller;

import java.lang.reflect.Member;

import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.range.rangEGuard.service.MemberServiceImpl;

public class MemberController {
	@Autowired
	MemberServiceImpl service;

	// join 페이지 요청이 들어오면
	// 요청한 페이지에서 사용자 정보(userId, userPw, userName)을 받아와서
	// 우리가 가지고 있는 객체에 각각을 저장해주고
	// loginpage반환
	@RequestMapping("/join.do")
	public ModelAndView join(Model model, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();

		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		String userName = request.getParameter("userName");

		service.memberRegister(userId, userPw, userName);
		mav.addObject("userId", userId);
		mav.addObject("userPw", userPw);
		mav.addObject("userName", userName);

		// 회원가입 잘됐는지 확인을 위해
		System.out.println("회원가입 완료");
		mav.setViewName("login");
		return mav;

	}
	
	
	
	@RequestMapping(value = "/login.do")
	public ModelAndView login(Model model, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("data", "loginProc");
		mav.setViewName("loginProc");

		return mav;
	}
	
	//login 페이지에서 로그인을 위해서 id랑 pw를 입력후에 jsp에서 버튼을 누르면
	// /loginProc여기 들어와서 사용자가 입력한 값들을 저장
	// 실제로 우리 member인지 확인
	@RequestMapping(value = "/loginProc", method = RequestMethod.POST)
	public ModelAndView loginChk(Model model, HttpServletRequest request) {
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		System.out.println(userId);
		System.out.println(userPw);
		
		
		ModelAndView mav = new ModelAndView();
		if(userId.equals("a@naver.com")) {
			if(userPw.equals("b")) {
				System.out.println("ok있음");
				mav.setViewName("main");
				return mav;
			}
		}
		//멤버인지 확인
//		Member member = service.memberSearch(userId, userPw);
		
		
		
		System.out.println("실패");
		mav.setViewName("login"); // 酉곗쓽 �씠由�
		return mav;
	}
}
