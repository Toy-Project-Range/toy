package com.range.rangEGuard.dao;

import java.lang.reflect.Member;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.range.rangEGuard.dto.MemberDto;

@Repository
public interface MemberDao {
	void memberInsert(String userId, String userPW, String userName);
	Member memberSelect(String userId, String userPw);
	
	public List<MemberDto> selectAll();
}
