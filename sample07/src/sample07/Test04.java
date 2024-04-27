package sample07;

import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {
		
		// 정수 10개를 참조할 수 있는 배열 arr을 생성하였습니다.
		int[] arr = new int[10];
		
		// 배열 요소에 순차적으로 접근할 수 있도록 설정하였습니다.
		for(int i = 0; i < arr.length; i++) {
			// 배열에 1부터 20까지의 정수가 랜덤으로 참조될 수 있도록 설정하였습니다.
			arr[i] = (int)(Math.random() * 20) + 1;
			
			for(int j = 0; j < i; j++) {
				// 배열의 앞 인덱스에 할당된 값과 후 인덱스에 할당된 값이 동일한지 확인하도록 설정하였습니다.
				if(arr[j] == arr[i]) {
					// 앞뒤 인덱스에 할당된 값이 동일할 경우 '중복값 발생' 문자열과 중복값을 출력하도록 설정하였습니다.
					System.out.println("중복값 발생 = " + arr[i]);
					// 중복값 출력 후 배열의 앞 인덱스의 값을 다시 랜덤으로 할당시키도록 설정하였습니다.
					i--;
					// 중복값 처리 관련 조건문에서 이탈하도록 설정하였습니다.
					break;
				}
			}
		}
		
		// arr 배열 요소가 서로 중복되지 않을 경우 arr 배열을 출력하도록 설정하였습니다.
		System.out.println("중복값 처리가 완료된 arr 배열 = " + Arrays.toString(arr));
		
	}
	
}
