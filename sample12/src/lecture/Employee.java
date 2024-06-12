package lecture;

public class Employee extends Person{

	private String company;
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getCompany() {
		return this.company;
	}
	
	public void getInfo() {
		System.out.print("이름 : " + this.getMyName() +  ", ");
		System.out.print("나이 : " + this.getAge()    +  ", ");
		System.out.print("성별 : " + this.getGender() +  ", ");
		System.out.print("회사 : " + this.getCompany() +  "\n");
	}
}
