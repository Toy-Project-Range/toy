package com.range.rangEGuard.dao;

import java.lang.reflect.Member;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.range.rangEGuard.dto.MemberDto;

public class MemberDaoImpl implements MemberDao{
	//��ȣȭ �ؼ� hash����
	private HashMap dbMap;
	
	//������
	public MemberDaoImpl() {
		dbMap = new HashMap();
	}

	
	//��ü ������ ���� �ֱ�
	//hash�ʿ� ��������
	
	@Override
	public void memberInsert(String userId, String userPW, String userName) {
		// TODO Auto-generated method stub
		MemberDto member = new MemberDto();
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
	
	//���� ã���� userId�� ���� ��������
	@Override
	public Member memberSelect(String userId, String userPw) {
		// TODO Auto-generated method stub
		Member member = (Member) dbMap.get(userId);
		return member;
	}


	@Override
	public List<MemberDto> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
