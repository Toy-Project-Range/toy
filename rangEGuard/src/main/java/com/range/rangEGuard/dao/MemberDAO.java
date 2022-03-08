package com.range.rangEGuard.dao;

import java.lang.reflect.Member;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.range.rangEGuard.daoImple.daoimple;
import com.range.rangEGuard.dto.MemberDTO;

public class MemberDAO implements daoimple{
	//암호화 해서 hash생성
	private HashMap dbMap;
	
	//생성자
	public MemberDAO() {
		dbMap = new HashMap();
	}

	
	//객체 생성후 정보 넣기
	//hash맵에 넣을거임
	
	@Override
	public void memberInsert(String userId, String userPW, String userName) {
		// TODO Auto-generated method stub
		MemberDTO member = new MemberDTO();
		member.setuserId(userId);
		member.setuserPw(userPW);
		member.setuserName(userName);
		
		dbMap.put(userId,member);
		
		Set keys = dbMap.keySet();
		Iterator iterator = keys.iterator();
		
		while(iterator.hasNext()){
			String key = (String) iterator.next();
			Member mem = (Member) dbMap.get(key);
		}
	}
	
	//누가 찾으면 userId로 정보 가져오기
	@Override
	public Member memberSelect(String userId, String userPw) {
		// TODO Auto-generated method stub
		Member member = (Member) dbMap.get(userId);
		return member;
	}
	
}
