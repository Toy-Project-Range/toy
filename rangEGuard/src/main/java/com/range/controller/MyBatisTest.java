package com.range.controller;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.range.rangEGuard.dao.MemberDao;
import com.range.rangEGuard.dto.MemberDto;


//git Test Ahyun
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class MyBatisTest {
	public static void main(String[] args) {
	
	}
	
	@Inject
	private SqlSessionFactory sqlFactory;

	@Test
	public void testFactory() {
		System.out.println("\n >>>>>>>>>> sqlFactory 출력 : " + sqlFactory);
	}

	@Test
	public void testSession() throws Exception {

		try (SqlSession session = sqlFactory.openSession()) {
			System.out.println(" >>>>>>>>>> session 출력 : " + session + "\n");
			MemberDao dao = session.getMapper(MemberDao.class);
			for (MemberDto a : dao.selectAll()) {
				System.out.println(a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}