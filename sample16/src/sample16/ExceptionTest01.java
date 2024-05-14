package sample16;

public class ExceptionTest01 {

	public static void main(String[] args) {
		
		int num = 10;
		int result = 0;
		
		// 에러가 발생될 것 같은 코드에 try catch 사용
		try {
			result = num/0;
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		System.out.println("결과 = " + result);
		
	}

}
