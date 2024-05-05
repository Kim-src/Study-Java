package kr.exam.inherit2;

// 부모 생성자가 default 접근제한자가 아니면 에러 발생
public class Employee extends Person {

	// default가 아니어도 괜찮은 방법
	public Employee(String myName, int age, String string) {
		super(myName, age);
		// TODO Auto-generated constructor stub
	}
	
	private String company;
	
	

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
	// 부모가 물려준 toString 메서드를 재정의
	
	
	// 오버라이드 작성했는데 에러가 안나면 부모것
	// 오버라이드 작성했는데 에러 발생하면 오타
	@Override
	public String toString() {
		String str = "";
		str += "이름 = " + this.getMyName() + ", ";
		str += "나이 = " + this.getAge() + ", ";
		str += "회사명 = " + this.getCompany();
		
		return str;
	}

	
}
