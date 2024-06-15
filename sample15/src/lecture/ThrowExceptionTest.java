package lecture;

public class ThrowExceptionTest {

	public static  int divide(int target, int num) throws ArithmeticException, NullPointerException {
		return target / num;
	}
	
	public static void main(String[] args) {

		try {
			
			int result = ThrowExceptionTest.divide(10, 0);
			
		}catch (ArithmeticException e) {
			System.out.println("나누기 에러!");
		}catch (NullPointerException e) {
			System.out.println("객체 생성 에러!");
		}
	
		System.out.println("프로그램이 종료 ");
	}

}
