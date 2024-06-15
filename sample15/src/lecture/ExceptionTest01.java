package lecture;

public class ExceptionTest01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		int result = 0;
		
		
		try {

			result = num / 0;
			
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}
		
	
		System.out.println("결과 :"  + result );
		
		
	}

}
