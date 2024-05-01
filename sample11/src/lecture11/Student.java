package lecture11;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

	
	private String myName;
	
	private int kor;
	
	private int eng;
	
	private int math;
	
	
	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	public String getMyName() {
		return this.myName;
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
	
	//총점구하기 
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
		
		System.out.print("이름 : " + this.getMyName());
		System.out.print(", 국어 : " + this.getKor() );
		System.out.print(", 영어 : " + this.getEng() );
		System.out.print(", 수학 : " +  this.getMath() );
		System.out.print(", 총점 : " + this.totalScore() );
		System.out.println(", 평균 : " +  this.socreAvg() );
	}
	
}
