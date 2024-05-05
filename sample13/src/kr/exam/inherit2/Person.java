package kr.exam.inherit2;

public class Person {
	
	private String myName;
	private int age;
	
	// 기본 생성자가 아니라 파라미터가 있는 생성자
	public Person(String myName, int age) {
		this.setMyName(myName);
		this.setAge(age);
	}
	
	
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
