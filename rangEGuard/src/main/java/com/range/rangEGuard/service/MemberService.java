package com.range.rangEGuard.service;

import java.lang.reflect.Member;

public interface MemberService {
	void memberRegister(String userId, String userPw, String userName);
	Member memberSearch(String userId, String userPw);
}
