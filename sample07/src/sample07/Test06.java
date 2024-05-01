package sample07;

import java.util.Arrays;

public class Test06 {

	public static void main(String[] args) {
		
		// 테스트를 위한 변수를 선언하였습니다.
		int[] whileTest = new int[10];
		
		// 테스트용 배열에 랜덤의 정수를 할당시켰습니다.
		for(int i = 0; i < whileTest.length; i++) {
			whileTest[i] = (int)(Math.random() * 20) + 1;
		}
		
		// 정수가 할당된 배열을 출력하였습니다.
		System.out.println("whileTest 배열 = " + Arrays.toString(whileTest));
		
		// while 조건문의 조건을 제어할 변수를 선언하였습니다.
		int count = 0;
		
		// while 조건문을 이용하여 배열에서 짝수만 출력할 수 있도록 설정하였습니다.
		while(count < whileTest.length) {
			// value 변수를 선언하여 whileTest 배열의 각 인덱스에 할당된 정수를 참조하도록 하였습니다.
			int value = whileTest[count++];
			// value 변수를 2로 나누었을 때의 몫이 0일 경우를 if 조건으로 설정하였습니다.
			if(value % 2 == 0) {
				// whileTest 배열에 짝수가 할당되었을 경우 출력되도록 설정하였습니다.
				System.out.print(value + "\t");
			}
		}
		
	}
	
}
