package lecture07;

import java.util.Arrays;

public class WhileTest01 {
	public static void main(String[] args) {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 20) + 1;
		}

		//while문을 사용하여 배열안에 짝수만 출력해봅시다.
		int count = 0;
		
		System.out.println(Arrays.toString(arr));
		while(count < arr.length) {
			
			int value = arr[count++];
			
			if( value % 2 == 0) {
				System.out.println(value);
			}
		
			
		}

	}

}
