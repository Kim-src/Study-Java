package lecture07;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 20) + 1;
		}

		System.out.println("정렬 전 : " + Arrays.toString(arr));

		int temp = 0; // 임시변수

		// 삼각형 - 별이 개수가 많았다가 1개씩 줄어
		for (int i = (arr.length - 1); i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					// 오름찬순은 앞이 뒤보다 크면 안되니까 바꾼다.
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("정렬 후 : " + Arrays.toString(arr));
	}
}
