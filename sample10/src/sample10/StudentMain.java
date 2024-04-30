package sample10;

public class StudentMain {

	public static void main(String[] args) {
		
		// new 생성자 메서드로 새로운 공간을 생성하였습니다.
		// st1 관련 컴퓨터 메모리에 새로운 주소가 생성되었습니다.
		Student st1 = new Student();
		st1.myName = "홍길동";
		st1.kor = 90;
		st1.eng = 86;
		st1.math = 95;
		
		st1.getInfo();
		
		// new 생성자 메서드로 새로운 공간을 생성하였습니다.
		// st2 관련 컴퓨터 메모리에 새로운 주소가 생성되었습니다.
		Student st2 = new Student();
		st2.myName = "김영희";
		st2.kor = 95;
		st2.eng = 90;
		st2.math = 87;
		
		st2.getInfo();
		
	}

}
