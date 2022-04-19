package com.range.rangEGuard.dao;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.range.rangEGuard.dto.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao{

	public MemberDaoImpl() {
	}

	@Inject
	private SqlSession sqlSession;

	private static final String Namespace = "com.range.rangEGuard.mapper.memberMapper";
	@Override
	public List<MemberDto> selectAll() {
		
		return sqlSession.selectList(Namespace+".selectAll");
		
	}
	
}
