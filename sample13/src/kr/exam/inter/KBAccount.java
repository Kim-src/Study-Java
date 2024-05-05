package kr.exam.inter;

public class KBAccount implements Bank{
	
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public void withdraw(int price) {

		int remind = this.getBalance() - price;
		if(remind < 1000 ) {
			System.out.println("잔고는 최소 10000원이 있어야 됩니다.");
			
			// 일찍 리턴하기
			return; // 메서드 실행 종료 -> finish
			// else문을 사용하지 않고 if else 기능을 return으로 그대로
			// else가 프로그램 속도를 낮추는 경우가 있음
			// else 때문에 컴파일러에서 버퍼링이 발생될 수 있음
		}
		
		System.out.println(price + "원 출금");
		System.out.println("현재 잔고 = " + remind + "원");
		
		// 값 저장
		this.setBalance(remind);
		
	}

	@Override
	public void deposit(int price) {

		int remind = this.getBalance() + price;
		System.out.println(price + "원 입금");
		System.out.println("현재 잔고 = " + remind);
		
		// 값 저장
		this.setBalance(remind);
		
	}
	
	@Override
	public void destroyAccount() {
		
		int remind = this.getBalance() + (int)(this.getBalance() * Bank.RATE);
		System.out.println("통장 삭제");
		System.out.println("원금 = " + this.getBalance() + "원");
		System.out.println("이자 포함 최종 금액 = " + remind);
		
	}

}
