package lecture07;

import java.util.Arrays;

public class ArrayTest03 {

	public static void main(String[] args) {
		
		//10개의 수를 만드는데 각 숫자는 중복이 없다!
		int[] arr = new int[10];
		
		for(int i =0; i < arr.length ; i++) {
			arr[i] = (int)(Math.random() * 20) + 1;
			
			//중복확인!
			for(int j = 0; j < i; j++) {
				if(arr[j] == arr[i]) {
					System.out.println("중복값 : " + arr[i]);
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
