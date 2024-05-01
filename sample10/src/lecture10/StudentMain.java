package lecture10;

public class StudentMain {
	public static void main(String[] args) {
		
		
		Student st1 = new Student();
		st1.myName ="홍길동";
		st1.kor = 90;
		st1.eng = 86;
		st1.math = 95;
		
		System.out.println(st1);
		st1.getInfo();

		Student st2 = new Student();
		st2.myName ="김영희";
		st2.kor = 95;
		st2.eng = 90;
		st2.math = 87;
		
		System.out.println(st2);
		st2.getInfo();
		
	}

}
