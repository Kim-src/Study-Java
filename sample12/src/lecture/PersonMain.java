package lecture;

public class PersonMain {

	public static void main(String[] args) {
		
		Student st = new Student();
		
		st.setMyName("김철수");
		st.setAge(20);
		st.setGender("남자");
		st.setSchool("코리아 대학교");
		st.getInfo();
		
		Employee em = new Employee();
		em.setMyName("김영희");
		em.setAge(20);
		em.setGender("여자");
		em.setCompany("코리아 아카데미");
		em.getInfo();
		
		
		//상속을 이용한 객체선언(다형성을 이용한 선언)
		//부모의 타입으로 선언 가능 
		Person st2 = new Student();
		
		//단점 - 부모타입으로 변경하여 자식을 
		// 선언했기 때문에 자식이 가진 메서드나 변수 사용 불가 
		//st2.setSchool("asdf");

		//데이터 선언에서 중요한 것은 대입 되는 것이 무엇인가 이다!
		//Person st2 = new Student();
		// 부모타입 인스턴스 st2 에는 새로운 학생객체를 선언하여 삽입 함
		//고로 st2의 진짜 타입은 Student 지만,
		// 선언된 타입이 Student 의 상위클래스인 Person 이기 때문에
		// Student 가 가진 메서드 또는 변수를 사용하지 못하고 부모 타입이 물려준것만 사용 가능!
		
		
	}

}
