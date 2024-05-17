package kr.exam.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.exam.data.Student;

public class DBSelectTest {
	
	public static void main(String[] args) {
		
		// 커넥션 맺기
		Connection conn = null;
		// 
		PreparedStatement pstmt = null;
		ResultSet res = null;
		
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
			
//			// 커넥션 맺기
//			Connection conn = DriverManager.getConnection(dbURL, userName, userPassword);
//			// 
//			PreparedStatement pstmt = null;
//			ResultSet res = null;
			
			conn = DriverManager.getConnection(dbURL, userName, userPassword);
			
			// 문자열 결합을 위해 사용
			StringBuffer sb = new StringBuffer();
			
			if(conn != null) {
				System.out.println("연결성공!");
				
				// DB 데이터 가져오기
				sb.append("select * from std_info");
				// 문서 준비
				// 준비된 문서에 SQL 내용을 적어서 반환
				pstmt = conn.prepareStatement(sb.toString());
				// 문서를 실행하고 결과를 받아오기
				res = pstmt.executeQuery();
				
				while(res.next()) {
					
					Student st = new Student();
					// *이 제일 좋고, 여기에서 세부적으로 꺼내는 것이 더 좋음
					st.setStdNum(res.getString("std_num"));
					st.setStdName(res.getString("std_name"));
					st.setStdAge(res.getInt("std_age"));
					st.setStdGender(res.getString("std_gender"));
					
					System.out.println(st);
					
				}
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		// 무조건 실행되는 finally
		} finally {
			
			try {
				// 사용한 객체들을 닫아주기
				// 마지막에 사용한 것부터 닫기
				if(res != null) {
					res.close();			}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} 
		
	}

}
