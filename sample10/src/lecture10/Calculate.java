package lecture10;

public class Calculate {
	
	// 리턴타입이 있고, 파라메터도 있는 메서드
	// 메서드에 리턴타입이 있는 경우
	// 메서드의 마지막에 return 키워드가 존재해야한다.
	// return 키워드는 메서드가 호출 대상에게 반환하는 값을 의미한다.
	// 반환하는 값은 메서드의 리턴타입과 데이터타입이 동일해야한다. 
	public int add(int x, int y ) {
		
		return x + y;
	}
	
	
	//리턴타입은 없고 파라메터가 있는 메서드
	public void printResult(int result) {
		System.out.println("값 : " + result);
	}

}
