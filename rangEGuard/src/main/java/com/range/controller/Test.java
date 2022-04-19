package com.range.controller;

import com.range.rangEGuard.dao.MemberDao;
import com.range.rangEGuard.dao.MemberDaoImpl;
import com.range.rangEGuard.dto.MemberDto;

public class Test {
	public static void main(String[] args) {
		MemberDao dao = SqlConfig.getSession().getMapper(MemberDao.class);
		System.out.println(dao.selectAll());
		System.out.println(12);
	}
}
