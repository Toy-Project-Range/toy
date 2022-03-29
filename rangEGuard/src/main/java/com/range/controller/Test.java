package com.range.controller;

import com.range.rangEGuard.dao.MemberDao;
import com.range.rangEGuard.dto.MemberDto;

public class Test {
	public static void main(String[] args) {
		MemberDao dao = SqlConfig.getSession().getMapper(MemberDao.class);
		for (MemberDto a : dao.selectAll()) {
			System.out.println(a);
		}

	}
}
