package kr.exam.inter;

public class AccountMain {
	
	public static void main(String[] args) {
		
		/*
		인터페이스를 상속하고 인터페이스가 물려준 메서드만 구현한 구현체의 경우에는
		다형성을 이용한 객체 선언을 사용하여 만든다.
		
		만약 자식 클래스에 추가적인 코드가 있을 경우에는
		기존과 동일하게 본인의 타입으로 선언하면 된다.
		*/
		
		KBAccount kb = new KBAccount();
		
		kb.setBalance(10000);
		kb.withdraw(3500);
		kb.withdraw(3500);
		kb.withdraw(3500);
		
		kb.deposit(1000);
		
		kb.destroyAccount();
		
	}

}
