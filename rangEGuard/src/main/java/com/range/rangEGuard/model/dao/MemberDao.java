package com.range.rangEGuard.model.dao;

import java.util.List;

import com.range.rangEGuard.model.dto.MemberDto;


public interface MemberDao {
	//멤버 생성
	void insertMember(MemberDto member);
	
	//아이디로 멤버 조회
	MemberDto searchById(String id);
	
	//멤버 전체 조회
	List<MemberDto> selectAll();
	
	//개인정보 수정
	void updateMember(MemberDto member);
}
