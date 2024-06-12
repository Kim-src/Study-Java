package review;

public class Employee extends Person {
	
	public Employee(String name, int age, String gender, String company) {
		super(name, age, gender);
		this.setCompany(company);
	}

	private String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
}
