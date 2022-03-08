package com.range.rangEGuard.service;

import java.lang.reflect.Member;

import org.springframework.beans.factory.annotation.Autowired;

import com.range.rangEGuard.dao.MemberDAO;
import com.range.rangEGuard.serviceImple.MemberServiceimple;

public class MemberService implements MemberServiceimple {
	
	@Autowired
	MemberDAO dao;
	
	//userId, userPw, userName을 받아서
	//dao실행해서 member넣어주기
	@Override
	public void memberRegister(String userId, String userPw, String userName) {
		// TODO Auto-generated method stub
		dao.memberInsert(userId, userPw, userName);
	}

	
	//userId, userPw를 받아서
	//dao에 해당 멤버있는지 확인
	@Override
	public Member memberSearch(String userId, String userPw) {
		// TODO Auto-generated method stub
		Member member = dao.memberSelect(userId, userPw);
		return member;
	}
	
}
