package sample07;

import java.util.Arrays;

public class Test05 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 20) + 1;
			
			for(int j = 0; j < i; j++) {
				if(arr[j] == arr[i]) {
					System.out.print("중복값 발생 = " + arr[i]);
					i--;
					break;
				}
			}
		}
		
		System.out.println("중복 없는 arr 배열 = " + Arrays.toString(arr));
		
	}

}
