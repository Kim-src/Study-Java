package lecture07;

import java.util.Arrays;

public class ArrayTest02 {
	public static void main(String[] args) {
		
		//배열 선언
		int[] arr = new int[10];
		
		for(int i = 0; i< arr.length; i++) {
			arr[i] = (int)(Math.random() * 50) + 1;
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE ;
		
		
		for(int i = 0; i< arr.length; i++) {
			
			//특정위치의 배열값이 max 보다 크면 치환 
			if (max < arr[i]) {
				max = arr[i];
			}
			
			//특정위취의 배열값이 min 보다 작으면 치환 
			if (min > arr[i]) {
				min= arr[i];
			}
		}
		
		//배열 출력1
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		System.out.println();
		
		//배열출력2 - 향상된 포문!! 첫등장!!
		for(int value : arr) {
			System.out.print(value+"\t");
		}
		
		System.out.println();
		/*
		 *  배열의 도우미 클래스
		 *  이름 : Arrays
		 */
		
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println("최대값 : " + max + ", 최소값 : " + min);
		
		
		
		
		
	}

}
