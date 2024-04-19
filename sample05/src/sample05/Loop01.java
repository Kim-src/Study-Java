package sample05;

public class Loop01 {

	public static void main(String[] args) {
		// 1부터 1000까지 짝수끼리 홀수끼리 짝수의 합, 홀수의 합을 각각 구해서 출력하세요.
		
		// 짝수의 합
		int sum1 = 0;
		// 홀수의 합
		int sum2 = 0;
		
		// for 반복문
		for (int i = 1; i <= 1000; i++) {
			//
			if (i % 2 == 0) {
				sum1 += i;
			} else {
				sum2 += i;
			}
		}
		
		// 결과 출력
		System.out.println("짝수의 합 = " + sum1);
		System.out.println("홀수의 합 = " + sum2);
		
	}

}
