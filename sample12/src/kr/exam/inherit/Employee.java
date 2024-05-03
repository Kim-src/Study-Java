package kr.exam.inherit;

public class Employee extends Person {
	
	private String company;

	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getCompany() {
		return this.company;
	}
	
	public void getInfo() {
		//부모한테 물려받은 것을 this로 내것처럼 사용 가능
		System.out.print("이름 = " + this.getMyName() + ", ");
		System.out.print("나이 = " + this.getAge() + ", ");
		System.out.print("성별 = " + this.getGender() + ", ");
		// 자식인 내가 가진 것은 company 하나밖에 없음
		System.out.print("회사 = " + this.getCompany() + "\n");
	}

}
