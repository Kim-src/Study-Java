package lecture11;

public class StdMain2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student2 st  =new Student2("홍길동", 90, 100, 80);
		
		//사용자가 생성자를 선언할 경우, 시스템은 사용자가 만든 생성자를
		// 클래스의 기본생성자로 사용하게 된다.
		Student2 st2 = new Student2(); 
		
	}

}
