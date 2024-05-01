package sample10;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

	// String int 등 앞에 아무것도 없어보이지만 'default' 상태임
	String myName;
	int kor;
	int eng;
	int math;
	
	// 점수 합계
	// 리턴 있고 파라미터(소괄호 내용) 없음
	public int totalScore() {
		return kor + eng + math;
	}
	
	// 평균 점수
	// 리턴 있고 파라미터(소괄호 내용) 없음
	public double scoreAvg() {
		double avg = (double)totalScore() / 3;
		
		// 소수점 깔끔하게
		// 소수점이 계산되어 나옴
		// HALF_UP = 반올림 / 소수점 둘째자리로 반올림
		avg = new BigDecimal(avg).setScale(2, RoundingMode.HALF_UP).doubleValue();
		
//		BigDecimal big = new BigDecimal(avg);
//		avg = big.setScale(2, RoundingMode.HALF_UP).doubleValue();
		
		return avg;
	}
	
	public void getInfo() {
		System.out.print("이름 = " + myName);
		System.out.print(", 국어 = " + kor);
		System.out.print(", 영어 = " + eng);
		System.out.print(", 수학 = " + math);
		System.out.print(", 총점 = " + totalScore());
		System.out.println(", 평균 = " + scoreAvg());
	}
	
	
}
