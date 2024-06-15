package Test;

public class ThrowsTest {
	
	public static int divide(int numerator, int denominator)
		throws ArithmeticException {
		return numerator / denominator;
	} 
	
	public static void main(String[] args) {
		
		try {
			System.out.println(divide(10, 0));
		}
		catch (ArithmeticException e) {
			System.out.println("나눗셈 오류");
		}
		catch (NullPointerException e) {
			System.out.println("객체 생성 오류");
		}
		
		System.out.println("시스템 종료");
		
	}

}
