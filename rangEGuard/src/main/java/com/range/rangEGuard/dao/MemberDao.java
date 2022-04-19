package com.range.rangEGuard.dao;

import java.util.List;


import com.range.rangEGuard.dto.MemberDto;


public interface MemberDao {
	public List<MemberDto> selectAll();
}
