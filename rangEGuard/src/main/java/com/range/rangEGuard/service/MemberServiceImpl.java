package com.range.rangEGuard.service;

import java.lang.reflect.Member;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.range.rangEGuard.dao.MemberDao;
import com.range.rangEGuard.dao.MemberDaoImpl;
import com.range.rangEGuard.dto.MemberDto;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Inject
	private MemberDao dao;

	@Override
	public List<MemberDto> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}


	
}
