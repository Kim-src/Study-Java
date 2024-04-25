package sample07;

import java.util.Arrays;

public class WhileTest01 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 20) + 1;
		}
		
		// while문을 사용하여 배열 안에 짝수만 출력
		int count = 0;
		while(count < arr.length) {
			// count를 인덱스로 설정
			int value = arr[count];
			
			if(value % 2 == 0) {
				System.out.println(value);
			}
			
			// count가 증가되지 않기 때문에 루프가 무한 반복됨
			count++;
		}
		
		System.out.println();
		
		// while문을 사용하여 배열 안에 짝수만 출력
		int count2 = 0;
		
		System.out.println(Arrays.toString(arr));
		while(count2 < arr.length) {
			// count를 인덱스로 설정
			int value2 = arr[count2++];
			
			if(value2 % 2 == 0) {
				System.out.println(value2);
			}
			
			// count가 증가되지 않기 때문에 루프가 무한 반복됨 = 증감식
//			count++;
			
			// for문과 while문의 차이
			// 반복횟수가 정해져있지 않을 때 while
			// 반복횟수를 모를 때(주머니에서 공 꺼내기)니까 계속 반복을 실행함
			// 다 할 때까지 계속해 : while = 일을 처리할 때까지 반복
			// 6회까지만 해 : for = 횟수 안에서 반복
			
			// 다이아몬드 숙제
			
			// jsp 서블릿 시절이 아닌 spring은 서버의 역할만
			// Spring은 업데이트 되면서 클라이언트 프로그래밍은 지원 안할수도
		}
	}

}
