package sample07;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 20) + 1;
		}
		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < (arr.length - 1) - i; j++) {
//				
//			}
//		}
		
		System.out.println("정렬 전 = " + Arrays.toString(arr));
		// 임시 변수
		int temp = 0;
		
		for(int i = (arr.length -1); i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("정렬 후 = " + Arrays.toString(arr));
		// Ctrl + Shift + F 자동정렬 : 회사에서 템플릿을 따로 만들어 둠 보통
		
		// for는 i가 있는데 while은 i가 없음
	}

}
