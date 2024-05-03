package kr.exam.inherit;

public class PersonMain2 {
	
	// 파라미터 타입이 부모 클래스 또는 부모 타입인 경우
	// 해당 클래스를 상위 클래스로 두는 모든 하위 클래스를 파라미터로 받을 수 있다.
	// Person 자식들 와라.
	
	// static은 메모리에 먼저 올라감
	// 그래서~~ 인스턴스를 만들어놓고 사용함
	// 자기것이라도 ~~
	
	public static void getInfo(Person p) {
		
		//넘어온 사람이 학생인지 직장인인지 구분
		if(p instanceof Student) {
			((Student)p).getInfo();
		} else if(p instanceof Employee) {
			((Employee)p).getInfo();
		}
	}
		
	public static void main(String[] args) {
		Student st = new Student();
		
		st.setMyName("촬스");
		st.setAge(20);
		st.setGender("남자");
		st.setSchool("대학");
		
		Employee em = new Employee();
		
		em.setMyName("촬스");
		em.setAge(20);
		em.setGender("남자");
		em.setCompany("아까데미");
		
		PersonMain2.getInfo(st);
		PersonMain2.getInfo(em);
		
	}
}
