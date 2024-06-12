package lecture;

public class PersonMain2 {
	/*
	 * 파라메터 타입이 부모 클래스 또는 부모 타입인 경우
	 * 해당 클래스를 상위클래스로 두는 모든 하위 클래스를 
	 * 파라메터로 받을 수 있다.
	 */
	public static void getInfo(Person p) {
		//넘어온 사람이 학생인지 직장인인지 구분
		if( p instanceof  Student) {
			((Student)p).getInfo();
		}else if( p instanceof Employee) {
			((Employee)p).getInfo();
		}
	}
	
	public static void main(String[] args) {
		
		Student st = new Student();
		
		st.setMyName("김철수");
		st.setAge(20);
		st.setGender("남자");
		st.setSchool("코리아 대학교");
		
		Employee em = new Employee();
		em.setMyName("김영희");
		em.setAge(20);
		em.setGender("여자");
		em.setCompany("코리아 아카데미");

		PersonMain2.getInfo(st);
		PersonMain2.getInfo(em);
	
	}

}
