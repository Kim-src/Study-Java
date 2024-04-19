package sample05;

public class LoopTest02 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		// 1에서 100까지의 합을 구하겠습니다.
		for(int i = 1; i <= 100; i++) {
			
			sum += i;
			
		}
		
		System.out.println("합계 = " + sum);
		
	}

}
