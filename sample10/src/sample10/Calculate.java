package sample10;

public class Calculate {

	// 리턴 타입이 있고 매개변수도 있는 메서드
	// 메서드에 리턴 타입이 있는 경우
	// 메서드의 마지막에 return 키워드가 존재해야 된다.
	// return 키워드는 메서드가 호출 대상에게 반환하는 값을 의미한다.
	// 반환하는 값은 메서드의 리턴 타입과 데이터 타입이 동일해야 된다.
	public int add(int x, int y) {
		
		return x + y;
		
	}
	
	// 리턴 타입은 없고 매개변수는 있는 메서드
	// void의 의미는 리턴될 것이 없다는 의미
	// 리턴이 없는 대신 프린트
	public void printResult(int result) {
		System.out.println("값 = " + result);
	}
	
}
