package co.it.exam;

public class Calc {

	// 오버로드(오버로딩)
	// 사용자는 편하게 add 변수를 사용 가능
	// 개발자는 일일이 add 변수에 여러 함수식 추가
	
	// 2개의 수를 더해서 return하는 메서드
	public int add(int f, int s) {
		return f + s;
	}
	
	// 3개의 수를 더해서 return하는 메서드
	public int add(int f, int s, int th) {
		return f + s + th;
	}
	
}
