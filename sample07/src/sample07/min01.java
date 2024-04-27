package sample07;

import java.util.Arrays;

public class min01 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[52];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 52) + 1;
			
			
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
