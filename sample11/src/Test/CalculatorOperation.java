package Test;

public class CalculatorOperation {

	// 2개의 정수를 더하는 계산식을 생성하였습니다.
	public int add(int a, int b) {
		return a + b;
	}
	
	// 5개의 정수를 더하는 계산식을 생성하였습니다.
	public int add(int a, int b, int c, int d, int e) {
		return a + b + c + d + e;
	}
	
	// 삼항연산자로 정수 2개의 값을 비교하는 계산식을 생성하였습니다.
	public boolean ternary(int a, int b) {
		return a > b ? true : false;
	}
	
}
