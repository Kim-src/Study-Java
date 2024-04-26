package sample07;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {

	    // 실습을 위한 arr 배열을 생성하였습니다.
	    int[] arr = new int[10];

	    // 실습을 위하 arr 배열에 값을 할당시켰습니다.
	    for(int i = 0; i < arr.length; i++) {
	        int rand = (int)(Math.random() * 100) + 1;
	        arr[i] = rand;
	    }

	    // 배열 출력 방법 1 : 반복문 및 배열의 인덱스 이용
	    for(int i = 0; i < arr.length; i++) {
	    	System.out.print(arr[i] + "\t");
	    }
	    
	    System.out.println();
	    
	    // 배열 출력 방법 2 : 향상된 for 반복문 이용
	    for(int value : arr) {
	    	System.out.print(value + "\t");
	    }
	    
	    System.out.println();
	    
	    // 배열 출력 방법 3 : Arrays.toString 이용
	    System.out.println(Arrays.toString(arr));

	}
	
}
