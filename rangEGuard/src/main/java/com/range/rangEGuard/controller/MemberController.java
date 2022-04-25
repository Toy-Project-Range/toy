package com.range.rangEGuard.controller;

import java.lang.reflect.Member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.range.rangEGuard.model.dto.MemberDto;
import com.range.rangEGuard.model.service.MemberService;
import com.range.rangEGuard.model.service.MemberServiceImpl;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;

	@PostMapping("loginProc")
	public String login(HttpSession session, String floatingInput, String floatingPassword) throws Exception{
		System.out.println(floatingInput);
		System.out.println(floatingPassword);
		System.out.println(memberService.searchById(floatingInput));
		MemberDto member = memberService.login(floatingInput, floatingPassword);
		if(member!=null) {
			session.setAttribute("user", member);
			System.out.println(member);
			return "main";
		}
		return "login";
	}
}
