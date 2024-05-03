package kr.exam.inherit;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Student st = new Student();
		
		st.setMyName("촬스");
		st.setAge(20);
		st.setGender("남자");
		st.setSchool("대학");
		st.getInfo();
		
		Employee em = new Employee();
		
		em.setMyName("촬스");
		em.setAge(20);
		em.setGender("남자");
		em.setCompany("아까데미");
		em.getInfo();
		
		
		// 상속을 이용한 객체 선언(다형성을 이용한 선언)
		// 부모의 타입으로 선언 가능
		// 좌변과 우변 -> 결정하는 것은 우변 Student();
		// 형변환 -> 일반 변수의 형변환보다 클래스에서의 형변환이 더 많이 사용됨
		// 형변환은 자동으로 되지 않으니까 강제 형변환을 시켜야 됨
		Person st2 = new Student();
		
		// 단점 - 부모타입으로 변경하여 자식을
		// 선언했기 때문에 자식이 가진 메서드나 변수 사용 불가
		// Person을 st2로 선언해버림	
		// 그래서 에러 = st2.setSchool("asdf");
		
		// 데이터 선언에서 중요한 것은 대입되는 것이 무엇인가이다!
		// Person st2 = new Student();
		// 부모타입 인스턴스 st2에는 새로운 학생 객체를 선언하여 삽입 함
		// 고로 st2의 진짜 타입은 Student 이지만
		// 선언된 타입이 Student의 상위 클래스인 Person이기 때문에
		// Student가 가진 메서드 또는 변수를 사용하지 못하고 부모 타입이 물려준것만 사용 가능!
		
	}

}
