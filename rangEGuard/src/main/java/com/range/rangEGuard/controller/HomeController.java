package com.range.rangEGuard.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("serverContry", "Korea");
		mav.setViewName("login");

		return mav;
	}

	@RequestMapping("/login.do")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("data", "login");
		mav.setViewName("login");

		return mav;
	}

	// login 페이지에서 로그인을 위해서 id랑 pw를 입력후에 jsp에서 버튼을 누르면
	// /loginProc여기 들어와서 사용자가 입력한 값들을 저장
	// 실제로 우리 member인지 확인
//	@RequestMapping(value = "/loginProc", method = RequestMethod.POST)
//	public ModelAndView loginChk(@RequestParam("userId") String Id, @RequestParam("userPw") String Pw) {
//		System.out.println(Id);
//		System.out.println(Pw);
//
//		ModelAndView mav = new ModelAndView();
//		if (Id.equals("a@naver.com")) {
//			if (Pw.equals("b")) {
//				System.out.println("ok있음");
//				mav.setViewName("main");
//				return mav;
//			}
//		}
//		 멤버인지 확인
//  		Member member = service.memberSearch(userId, userPw);
//
//		System.out.println("실패");
//		mav.setViewName("login"); // 酉곗쓽 �씠由�
//		return mav;
//	}

    @RequestMapping("/loginProc")
    public ModelAndView loginChk(HttpServletRequest req) {
    	String userId = req.getParameter("userId");
    	System.out.println(userId);
        ModelAndView mav = new ModelAndView();
            mav.setViewName("main"); // 酉곗쓽 �씠由�
        return mav;
    }
}