package kr.exam.inherit;

// 왼쪽이 자식 //오른쪽이 부모
// 나를 부모로 확장하다
// 상속 예제
public class Student extends Person {
	
	private String school;

	
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	
	public void getInfo() {
		//부모한테 물려받은 것을 this로 내것처럼 사용 가능
		System.out.print("이름 = " + this.getMyName() + ", ");
		System.out.print("나이 = " + this.getAge() + ", ");
		System.out.print("성별 = " + this.getGender() + ", ");
		// 자식인 내가 가진 것은 school 하나밖에 없음
		System.out.print("학교 = " + this.getSchool() + "\n");
	}

}
