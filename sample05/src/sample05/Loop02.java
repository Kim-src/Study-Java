package sample05;

public class Loop02 {

	public static void main(String[] args) {

		int sum = 0;
		
		for (int i = 0; i < 10; i++) {
			sum += i;
			
			for (int j = 0; j < 10; j++) {
				sum += j;
			}
		}
		
		System.out.println("결과값 = " + sum);
 		
	}

}
