package sample16;

public class ThrowExceptionTest {
	
	// double인 경우 0으로 나누면 무한으로 이어짐
	public static int divide(int target, int num) throws ArithmeticException {
		return target / num;
	} 
	public static void main(String[] args) {
		
		try {
			
			int result = ThrowExceptionTest.divide(10, 0);
			
		} catch (ArithmeticException e) {
			System.out.println("나누기 에러");
		}
		
		System.out.println("프로그램 종료");
		
	}
	
	// 처리하라고 강제하는 것이 throws exception

}
