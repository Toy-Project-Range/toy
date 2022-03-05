package com.range.rangEGuard.dao;

import java.lang.reflect.Member;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.range.rangEGuard.daoImple.daoimple;
import com.range.rangEGuard.dto.MemberDTO;

public class MemberDAO implements daoimple{
	private HashMap dbMap;
	
	public MemberDAO() {
		dbMap = new HashMap();
	}

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

	@Override
	public Member memberSelect(String userId, String userPw) {
		// TODO Auto-generated method stub
		Member member = (Member) dbMap.get(userId);
		return member;
	}
	
}
