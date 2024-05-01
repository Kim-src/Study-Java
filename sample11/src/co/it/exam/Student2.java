package co.it.exam;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student2 {
	
	private String myName;
	private int kor;
	private int eng;
	private int math;
	
	
	// 기본 생성자
//	public Student2() {
//	}
	// 오버로딩 생성자가 기본 생성자를 인용(?)하면 기본 생성자가 필요 없음
	
	// 생성자 오버로딩
	// 생성자 오버로딩을 통해서 데이터를 입력받을 수 있다.
	public Student2(String myName, int kor, int eng, int math) {
		this.setMyName(myName);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);
	}
	
	
	
	
	public String getMyName() {
		return this.myName;
	}
	
	public void setMyName(String myName) {
		// 어느쪽이 클래스의 myName이고 어느쪽이 메서드의 myName인지 모름
		// 대입해야 될 변수와 파라미터명을 동일하게 작성하는 것이 Java의 약속..임
		// 그래서 클래스의 myName에는 this를 사용 - 인칭으로 자기 자신을 가리킬 때
		// 메서드의 myName에는 아무것도 없음
		// . 클래스가 가지고 있는 하위 메서드를 호출할 때 사용
		// 그래서 this.myName인것임
		this.myName = myName;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
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
		
//			BigDecimal big = new BigDecimal(avg);
//			avg = big.setScale(2, RoundingMode.HALF_UP).doubleValue();
		
		return avg;
	}
	
	public void getInfo() {
		// 객체 내부에서도 getter 및 setter 이용
		System.out.print("이름 = " + this.getMyName());
		System.out.print(", 국어 = " + this.getKor());
		System.out.print(", 영어 = " + this.getEng());
		System.out.print(", 수학 = " + this.getMath());
		System.out.print(", 총점 = " + this.totalScore());
		System.out.println(", 평균 = " + this.scoreAvg());
	}

}
