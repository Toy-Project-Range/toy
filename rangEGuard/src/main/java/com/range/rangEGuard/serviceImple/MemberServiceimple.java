package com.range.rangEGuard.serviceImple;

import java.lang.reflect.Member;

public interface MemberServiceimple {
	void memberRegister(String userId, String userPw, String userName);
	Member memberSearch(String userId, String userPw);
}
