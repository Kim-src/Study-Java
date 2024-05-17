package kr.exam.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionTest {
	
	public static void main(String[] args) {
		
		/* 필요한 것
		 * 1. DB 드라이버 이름
		 * 2. 데이터베이스 주소
		 * 3. 데이터베이스 아이디
		 * 4. 데이터베이스 패스워드
		 * */
		
		// 연동에 관련된 것은 대부분 CheckedException에 들어감
		
		try {
			String driverName = "org.mariadb.jdbc.Driver";
			// jdb, DBMS명, 로컬주소, schema명 순
			String dbURL = "jdbc:mariadb://localhost:13306/it_java";
			String userName = "root";
			String userPassword = "0000";
			
			// 드라이버 로드
			// 드라이버가 한 개일 때는 지워도 상관없음
			// 그런데 드라이버가 2개 이상일 경우 명확하게 작성해줘야 됨
			Class.forName(driverName);
			
			// 커넥션 맺기
			Connection conn = DriverManager.getConnection(dbURL, userName, userPassword);
			
			if(conn != null) {
				System.out.println("연결성공!");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
