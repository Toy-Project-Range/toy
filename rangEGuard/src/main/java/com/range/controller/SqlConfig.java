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
			//���� ���丮�� �̿��Ͽ� ������ ���Դ�.
			session = sqlSessionFactory.openSession(true); //true �ɼ��� �ְԵǸ� �ڵ� Ŀ���� �ȴ�.
			System.out.println("���� ���� ����");
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("���� ���� ����");
		}
	}
	
	public static SqlSession getSession() {
		return session;
	}
	
	
}


