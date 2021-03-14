package com.spring.hch;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


//주입 설정하는 xml을 불러옴(root-context.xml)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class DataSourceTest {
	
	// 주입 받을 set메서드 자동으로 설정해줌
	@Inject
	private DataSource ds;
	
	// junit 라는 테스트 해주는 프로그램이 메이븐에 설치 되어 있음, 테스트 용 메서드
	@Test
	public void testConnection() throws Exception {	
		try {
			Connection con = ds.getConnection();
			System.out.println(con);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
