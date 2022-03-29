package com.range.rangEGuard.dao;

import java.lang.reflect.Member;

public interface MemberDao {
	void memberInsert(String userId, String userPW, String userName);
	Member memberSelect(String userId, String userPw);
}
