package com.range.controller;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlConfig {
	private static SqlSession session;
	static {
		try {
			String resource = "mybatis-config.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			//세션 팩토리를 이용하여 세션을 얻어왔다.
			session = sqlSessionFactory.openSession(true); //true 옵션을 주게되면 자동 커밋이 된다.
			System.out.println("세션 빌드 성공");
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("세션 빌드 실패");
		}
	}
	
	public static SqlSession getSession() {
		return session;
	}
	
	
}


