package com.range.rangEGuard.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.range.rangEGuard.exception.LoginException;
import com.range.rangEGuard.model.dao.MemberDao;
import com.range.rangEGuard.model.dto.MemberDto;
import com.range.rangEGuard.util.SHA256;

@Service("memberService")
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberDao memberDao;
	
	
	@Override
	public MemberDto login(String id, String pw) throws Exception{
		MemberDto member = memberDao.searchById(id);
		if(member==null || !member.getPw().equals(new SHA256().getHash(pw))) {
			throw new LoginException();
		}
		return member;
	}

	@Override
	public List<MemberDto> selectAll() {
		return memberDao.selectAll();
	}

	@Override
	public MemberDto searchById(String id) {
		// TODO Auto-generated method stub
		return memberDao.searchById(id);
	}

	@Override
	public void updateMember(MemberDto member) {
		// TODO Auto-generated method stub
		memberDao.updateMember(member);
	}

	@Override
	public void insertMember(MemberDto member) throws Exception{
		member.setPw(new SHA256().getHash(member.getPw()));
		memberDao.insertMember(member);
	}

}
