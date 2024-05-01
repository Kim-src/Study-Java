package sample07;

import java.util.Arrays;

public class Test07 {
	
	public static void main(String[] args) {
		
		// 버블 정렬 테스트를 위한 배열을 생성하였습니다.
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 20) + 1;
		}
		
		System.out.println("정렬 전 arr 배열 = " + Arrays.toString(arr));
		
		
		// 오름차순 정렬을 위한 변수를 생성하였습니다.
		int smallValue = 0;
		// 내림차순 정렬을 위한 변수를 생성하였습니다.
		int bigValue = 0;
		
		
		//* 버블 정렬 1 *//
		// 배열의 전체 인덱스부터 인덱스를 차감시키며 범위를 축소시켰습니다.
		// if 조건문 로직 때문에 i의 초기값이 배열 길이라면 j는 i - 1 미만이어야 됩니다.
		// if 조건문 로직 때문에 i의 초기값이 배열 길이 - 1이라면 j는 i 미만이어야 됩니다.
		// 한편 j는 i보다 작기 때문에 i는 0보다 커야 됩니다.
		// 'i > 0'으로 설정하더라도 arr[j]의 최소 인덱스는 arr[0]이 됩니다.
		for(int i = (arr.length - 1); i > 0; i--) {
			// 'j < i'에서 i+1이 아닌 이유는 아래 if 조건문에서 최종 인덱스가 증가되기 때문입니다.
			// 이때 i+1이 아닌 i여야 arr.length와 동일한 값을 갖게 됩니다.
			for(int j = 0; j < i; j++) {
				// 반복문을 테스트하기 위해 별짓기 테스트를 하였습니다.
				// System.out.print("*");
				
				if(arr[j] > arr[j+1]) {
					bigValue = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = bigValue;
				}
			
			}
			// 반복문을 테스트하기 위해 별짓기 테스트를 하였습니다.
			// System.out.println();
		}
		
		System.out.println("정렬 후 arr 배열 = " + Arrays.toString(arr));
		
		
		//* 버블 정렬 2 *//
		for(int i = (arr.length); i > 0; i--) {
			for(int j = 0; j < i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					bigValue = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = bigValue;
				}
			}
		}
		
		System.out.println("정렬 후 arr 배열 = " + Arrays.toString(arr));
		
		
		//* 버블 정렬 3 *//
		for(int i = (arr.length); i > 0; i--) {
			for(int j = 0; j < i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					bigValue = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = bigValue;
				}
			}
		}
		
		System.out.println("정렬 후 arr 배열 = " + Arrays.toString(arr));
		
		
		//* 버블 정렬 4 *//
		for(int i = (arr.length); i > 0; i--) {
			for(int j = 0; j < i - 1; j++) {
				if(arr[j] < arr[j+1]) {
					smallValue = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = smallValue;
				}
			}
		}
		
		System.out.println("정렬 후 arr 배열 = " + Arrays.toString(arr));

	}

}
