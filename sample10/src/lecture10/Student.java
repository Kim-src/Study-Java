package lecture10;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

	String myName;
	int kor;
	int eng;
	int math;
	
	
	public int totalScore() {
		return kor + eng + math;
	}
	
	//평균점수
	public double socreAvg() {
		double avg = (double) totalScore()  / 3;
		
		// 소수점 자리수 계산하기 
		avg = new BigDecimal(avg).setScale(2, RoundingMode.HALF_UP).doubleValue();
		
		return avg;
	}
	
	public void getInfo( ) {
		
		System.out.print("이름 : " + myName);
		System.out.print(", 국어 : " + kor );
		System.out.print(", 영어 : " + eng );
		System.out.print(", 수학 : " +  math );
		System.out.print(", 총점 : " + totalScore() );
		System.out.println(", 평균 : " +  socreAvg() );
	}
}
