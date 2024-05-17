package kr.exam.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DBInsertTest {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		
		Scanner scan = new Scanner(System.in); 
		
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
			conn = DriverManager.getConnection(dbURL, userName, userPassword);
			
			if(conn != null) {
				System.out.println("연결성공!");
				
				// 오토 커밋 취소
				conn.setAutoCommit(false);
				
				StringBuffer sb = new StringBuffer();
				
				sb.append("insert into std_score(std_num, grade, terms, kor, eng, math)");
				sb.append("valuew(?, ?, ?, ?)");
				
				pstmt = conn.prepareStatement(sb.toString());
				
				// 물음표에 값을 대응
				int sqlIndex = 1; // 시작 인덱스가 1부터 시작(PreparedStatement는 시작이 0이 아님)
				
				// 앞에 있는 index는 ?에 대응하는 순서임
				System.out.print("학생 학번 = ");
				pstmt.setString(sqlIndex++, scan.next());

				System.out.print("학생 이름 = ");
				pstmt.setString(sqlIndex++, scan.next());
				
				System.out.print("학생 나이 = ");
				pstmt.setInt(sqlIndex++, scan.nextInt());

				System.out.print("학생 성별 = ");
				pstmt.setString(sqlIndex++, scan.next());
				
				// insert / update / delete는 실행이 executeUpdate(); 
				int result = pstmt.executeUpdate();
				
				if(result > 0) {
					System.out.println("입력 성공");
					conn.commit();
				}
				else {
					// 성공하지 못하면 내가 했던 행위(여기서는 insert)를 취소 = rollback
					// conn.rollback();
					conn.rollback();
					throw new Exception("입력 실패");
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				// 사용한 객체들을 닫아주기
				// 마지막에 사용한 것부터 닫기
				if(res != null) {
					res.close();
				}
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
