package lecture08;

import java.util.Arrays;

public class DoubleArrayTest01 {
	public static void main(String[] args) {
		
		int[][] arr01 = new int[3][4];
		//각행의 열을 다르게 만들고싶을때
		int[][] arr02 = new int[3][];
		//최초 선언시에만 가능 값과  크기 부여
		int[][] arr03 =  { {1,2,3}, {4,5,6},{7,8,9} };
		
		
		//2차배열의 출력
		System.out.println("배열 arr : " + arr01);
		//2차배열의 1행 출력
		System.out.println("배열 arr[0] : " + arr01[0]);
		//2차배열의 1행1열 출력
		System.out.println("배열 arr[0][0] : " + arr01[0][0]);
		
		System.out.println("배열 arr02[0] : " + arr02[0]);

		
		
		for(int i =0; i < arr02.length; i++) {
			arr02[i] = new int[(i+1)*2];
		}
		
		
		//출력
		for(int i =0; i < arr03.length; i++) {
			for(int j = 0; j < arr03[i].length; j++) {
				System.out.print(arr03[i][j]+"\t");
			}	
			System.out.println();
		}
		
		
		System.out.println("=============================");
	
		//향상된 for문 2차배열 출력 
		for(int[] first  : arr03) {
			for(int sec : first) {
				System.out.print(sec+"\t");
			}
			System.out.println();
		}
		
		System.out.println("=============================");
		for(int[] first  : arr03) {
			System.out.println(Arrays.toString(first));
		}
		
	}

}
