package com.range.rangEGuard.service;

import java.lang.reflect.Member;
import java.util.List;

import com.range.rangEGuard.dto.MemberDto;

public interface MemberService {
	public List<MemberDto> selectAll();
}
