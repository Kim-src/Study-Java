package sample05;

public class LoopTest01 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		// 1. 몇 회 반복할 것인가
		// 2. 반복할 때의 변수를 사용할 것인가
		
		for(int i = 0; i < 5; i++) {
			
			int rand = (int)(Math.random() * 20) + 1;
			System.out.print(rand + " ");
			sum = sum + rand;
			
		}
		
		System.out.println();
		System.out.println("합 = " + sum);
		
		
//		for(int i = 5; i > 0; i--) {
//			
//		}
//		
//		for(int i = 1; i < 20; i = i * 2) {
//			
//		}
	}

}
