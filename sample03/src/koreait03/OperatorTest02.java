package koreait03;

public class OperatorTest02 {
	public static void main(String[] args) {
		
	
		int num1 = 10;
		int sum1 = 0;
		int num2 = 10;
		int sum2 = 0;
		
		//증감연산자가 뒤에 붙는 경우
		sum1 = num1++;
		
		System.out.println("sum1 = " + sum1  +", num = " + num1);
		
		//증감연산자가 앞에 붙는 경우
		sum2 = ++num2;
				
		System.out.println("sum2 = " + sum2  +", num2 = " + num2);
	

	}

}
