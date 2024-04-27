package sample09;

import java.util.Scanner;

public class DoubleArrayTest {

	public static void main(String[] args) {
		
		// 3명의 학생이 국어, 영어, 수학 점수 보유
		int[][] school = new int[3][3];
		
		// 문자열을 잘라서 배열에 집어넣는 Spring의 기능?
		Scanner scan = new Scanner(System.in);
		
		// 과목을 표현하기 위한 1차 함수
		String[] major = {"국어", "영어", "수학"};
		
		// 입력
		for(int i = 0; i < school.length; i++) {
			for(int j = 0; j < school[i].length; j++) {
				System.out.println((i+1) + "번째 학생의" + major[j] + "점수 = ");
				school[i][j] = scan.nextInt();
			}
		}
		
		int maxScore = 0; // 최댓값
		int studentNum = 0; // 최댓값을 가지는 학생 번호
		int sum = 0; // 합계
		
		for(int i = 0; i < school.length; i++) {
			for(int j = 0; j < school[i].length; j++) {
				sum += school[i][j]; // 학생이 가진 점수를 합한다.
			}
			
			// 합산한 결과를 최대 값 변수와 비교하여 최댓값보다 크면 치환한다.
			if(maxScore < sum) {
				maxScore = sum;
				studentNum = i; // 최댓값 위치 저장
			}
			
			// 합산한 값을 초기화
			sum = 0;
		}
		
		System.out.println("최고점자 = " + (studentNum + 1) + "번 학생, 총점 = " + maxScore);
		
		
	}
	
}
