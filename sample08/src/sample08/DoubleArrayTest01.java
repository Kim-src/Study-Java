package sample08;

import java.util.Arrays;

public class DoubleArrayTest01 {

	public static void main(String[] args) {

		int[][] arr1 = new int[3][4];
		
		// 각 행의 열을 다르게 만들고 싶을 때
		// 나중에 빈 칸에 숫자를 넣으면 됨
		int[][] arr2 = new int[3][];
		
		// 최초 선언 시에만 가능 값과 크기 부여
		// 값과 크기를 부여하는 것은 최초 선언 시에만 가능
		int[][] arr3 = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		// 2차 배열 출력
		System.out.println("배열 = " + arr1);
		
		// 2차 배열의 1행 출력
		System.out.println("배열 arr[0] = " + arr1[0]);
		
		// 2차 배열의 1행1렬 출력
		System.out.println("배열 arr[0][0] = " + arr1[0][0]);

		// arr2 배열 안에 배열 삽입을 안해서 null이 출력됨
		// null = 공간은 있는데 값이 없음 / 객체가 정의는 됐지만 내용이 없을 때 / 공간이 비어있음
		// 0 = 정수 값
		System.out.println("배열 arr[0] = " + arr2[0]);
		
		// arr.length : 1차에 대한 배열 길이를 구하는 것(그림 참조)
		// arr[0].length : 2차에 대한 배열 길이를 구하는 것(그림 참조)
		// 1차 배열에 배열을 삽입하여 2차 배열로 변환
		for(int i = 0; i < arr2.length; i++) {
			// 행렬과 같이 배열을 사용하고 싶은 경우
			arr2[i] = new int[4];
			// 각 1차적인 배열마다 다른 크기의 2차적인 배열을 사용하고 싶은 경우
			arr2[i] = new int[(i+1)*2];
		}
		
		// 출력
		for(int i = 0; i < arr3.length; i++) {
			for(int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("==========");
		
		// 향상된 for 문
		// 1차원 배열에 대한 루프인 first 임의 변수 생성
		for(int[] first : arr3) {
			// 2차원 배열에 대한 루프인 sec
			for(int sec : first) {
				System.out.print(sec + "\t");
			}
			System.out.println();
		}
		
		System.out.println("==========");
		
		for(int[] first : arr3) {
			System.out.println(Arrays.toString(first));
		}
	}

}
