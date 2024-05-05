package kr.exam.inter;

public interface Bank {
	
	// 어떤 은행이든지 이 기능을 탑재시키려고 은행
	
	// 상수
	public static final double RATE = 0.02;
	
	// 출금
	public abstract void withdraw(int price);
	
	// 입금
	// 인터페이스는 기본적으로 접근제한자가 public
	// 메서드는 추상 메서드이기 때문에 public abstract 생략 가능
	void deposit(int price);
	
	// 통장 삭제
	void destroyAccount();

}
