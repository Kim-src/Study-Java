package review;

// 다양하게 응용할 Person 객체를 정의하였습니다.
public class Person {
	
	// 핵심 요소는 private으로 선언하였습니다.
	private String name;
	private int age;
	private String gender;
	
	// 파라미터가 있는 생성자일 때 하위 클래스에서 호출 가능합니다.
	public Person(String name, int age, String gender) {
		this.setName(name);
		this.setAge(age);
		this.setGender(gender);
	}
	
	// 각 요소에 대한 getter/setter 메서드는 public으로 선언하였습니다.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
