package kr.exam.data;

public class Student {
	
	private String stdNum;
	private String stdName;
	private int stdAge;
	private String stdGender;
	
	public String getStdNum() {
		return stdNum;
	}
	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getStdAge() {
		return stdAge;
	}
	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}
	public String getStdGender() {
		return stdGender;
	}
	public void setStdGender(String stdGender) {
		this.stdGender = stdGender;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("학번 = " + this.getStdNum() + ", ");
		sb.append("이름 = " + this.getStdName() + ", ");
		sb.append("나이 = " + this.getStdAge() + ", ");
		sb.append("성별 = " + this.getStdGender() + "\n");
		
		//StringBuilder 타입 = String으로 변환해서 출력
		return sb.toString();
	}

}
