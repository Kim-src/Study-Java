package koreait04;

public class IfTest01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double rand = Math.random();
		
		System.out.println(rand); // 0이상 1 미만 사이에서 불특정 값을 준다.(실수)
		System.out.println(rand * 10);
		System.out.println((int)(rand * 10));
		System.out.println((int)(rand * 10) + 1 );
	}

}
