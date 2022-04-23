package com.range.rangEGuard.model.service;

import java.util.List;

import com.range.rangEGuard.model.dto.MemberDto;

public interface MemberService {
	//로그인 함수
	MemberDto login(String id, String pw) throws Exception;
	
	//멤버 전체 조회
	List<MemberDto> selectAll();
	
	//아이디로 유저조회
	MemberDto searchById(String id);

	//유저 수정
	void updateMember(MemberDto member);

	//유저 생성
	void insertMember(MemberDto member) throws Exception;
}
