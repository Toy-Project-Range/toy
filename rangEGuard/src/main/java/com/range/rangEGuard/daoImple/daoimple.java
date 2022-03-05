package com.range.rangEGuard.daoImple;

import java.lang.reflect.Member;

public interface daoimple {
	void memberInsert(String userId, String userPW, String userName);
	Member memberSelect(String userId, String userPw);
}
