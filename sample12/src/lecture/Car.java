package lecture;

public class Car {

	//상수 만들기 
	public static final String COMPANY_NAME ="현대";

	private String myName;
	
	private String price;
	
	
	public void setMyName(String myName) {
		this.myName = myName;
	}	
	
	
	public String getMyName() {
		return myName;
	}

	
	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	//정적 메서드
	public static String getCompany() {
		//사용하는데 제약 조건이 있음
		// 인스턴스변수나 메서드를 내부에서 사용 불가 
		// this 못씀 
		return COMPANY_NAME;
	}
}
