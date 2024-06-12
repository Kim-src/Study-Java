package lecture;

public class Student extends Person{
	
	private String school;
	
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	  
	public void getInfo() {
		System.out.print("이름 : " + this.getMyName() +  ", ");
		System.out.print("나이 : " + this.getAge()    +  ", ");
		System.out.print("성별 : " + this.getGender() +  ", ");
		System.out.print("학교 : " + this.getSchool() +  "\n");
	}
}
