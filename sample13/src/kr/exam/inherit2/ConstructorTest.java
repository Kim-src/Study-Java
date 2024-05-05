package kr.exam.inherit2;

public class ConstructorTest {
	
	public static void main(String[] args) {
		Actor actor = new Actor("김배우", 30, "출연영화");
		
//		actor.setMyName("김배우");
//		actor.setAge(30);
//		actor.setMyMovie("출연영화");
		
		System.out.println("이름 = " + actor.getMyName() + ", 나이 = " + actor.getAge() + ", 출연작 = " + actor.getMyMovie());
		
		
		Employee em = new Employee("고길동", 40, "컴퍼니");
		System.out.println(em);
	}
}
