package sample07;

import java.util.Arrays;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		// 정수 10개를 저장할 수 있는 arr 변수를 정의하였습니다.
		int[] arr = new int[10];
		
		// for 반복문으로 arr 변수의 전체 데이터 개수보다 작은 수까지 함수가 반복되도록 설정하였습니다.
		// for 함수가 0부터 9까지 1씩 증가하면서 반복되기 때문에 총 10회 반복됩니다.
		// 따라서 arr[i]는 arr[10]과 동일한 기능을 수행합니다.
		// for 반복문이 실행되면 arr[i] 배열에 1~50 범위의 랜덤의 정수를 저장하도록 설정하였습니다.
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 50) + 1;
		}
		
		// max 변수에 Java의 Integer 클래스에서 설정한 최솟값을 저장하였습니다.
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			
			if (max < arr[i]) {
				max = arr[i];
			}
			
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println();
		
		for(int value : arr) {
			System.out.print(value + "\t");
		}
		
		System.out.println();
		
		// 클래스는 기능을 갖고 있음
		
		System.out.println(Arrays.toString(arr));
		System.out.println("최댓값 = " + max + ", 최솟값 = " + min);
	}

}
