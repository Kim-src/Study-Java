package sample07;

import java.util.Arrays;

public class ArrayTest03 {

	public static void main(String[] args) {
		
		// 1개의 정수를 담을 수 있는 배열 arr를 정의하였습니다.
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 20) + 1;
			
			// 중복 확인
			for(int j = 0; j < i; j++) {
				System.out.println(j);
				if(arr[j] == arr[i]) {
					System.out.println("중복값 = " + arr[i]);
					i--;
					// 루프가 완전히 끝나지 않았음에도 종료시키는 break 레이블
					// 메모리(저장)가 많이 드는 작업, CPU(실행)가 많이 드는 작업
					// 컴퓨터는 기본적으로 싱글코어
					// 아무리 돌려도 코어 한개만 돌림
					// 게임을 하면 코어 수 올리면 됨(멀티코어)
					// 그래서 100만회 계산을 시키면 코어 하나만 돌려짐
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		// 알고리즘에서 정렬 중요
		// 정렬 버블정렬(제일 쉬움) 퀵정렬 병합정렬 최상급정렬 삽입정렬 C분할정렬 분할정렬
		
	}

}
