package kr.exam.st;

public class Car {
	
	// 상수 생성
	// 상수명은 모든 글자가 대문자로
	public static final String COMPANY_NAME = "현대";
	
	private String myName;
	private String price;
	
	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	// 정적 메서드 생성
	public static String getCompany() {
		// 사용하는 데 제약이 있음
		// 인스턴스 변수나 메서드를 내부에서 사용 불가
		// this 못씀
		return COMPANY_NAME;
	}

}
