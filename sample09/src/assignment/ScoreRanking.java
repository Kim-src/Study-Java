package assignment;

import java.util.Scanner;

public class ScoreRanking {

	// 점수 입력 및 출력 메서드 생성
	// 1. 학생들의 과목별 점수를 입력할 수 있도록 설정하였습니다.
	// 2. 학생별 합산된 점수 중 최댓값과 최솟값을 출력하도록 설정하였습니다.
	// 3. 최댓값 또는 최솟값이 할당된 학생의 번호와 합산된 점수를 표시하였습니다.
	public static void main(String[] args) {

		// 학생 3명의 국어, 영어, 수학, 자바 점수를 참조할 메모리 공간을 생성하였습니다.
		int[][] lecture = new int[3][4];
		// 점수를 입력할 scan 변수를 정의(선언)하였습니다.
		Scanner scan = new Scanner(System.in);
		// 과목을 표현하기 위한 major 배열을 생성하였습니다.
		String[] major = {"국어", "영어", "수학", "자바"};
		
		// 점수 입력을 위한 for 반복문을 생성하였습니다.
		for(int i = 0; i < lecture.length; i++) {
			for(int j = 0; j < lecture[i].length; j++) {
				System.out.print((i+1) + "번째 학생의 " + major[j] + "점수 = ");
				// 점수는 직접 입력하여 생성할 수 있도록 설정하였습니다.
				lecture[i][j] = scan.nextInt();
			}
			// 각 학생의 각 과목 당 점수를 출력하였습니다.
			System.out.println((i+1) + "번 학생의 점수 = " + "국어 : " + lecture[i][0] + ", 영어 : " + lecture[i][1] + ", 수학 : " + lecture[i][2] + ", 자바 : " + lecture[i][3]);
		}
		
		// 최댓값을 초기화하였습니다.
		int maxScore = Integer.MIN_VALUE;
		// 최솟값을 초기화하였습니다.
		int minScore = Integer.MAX_VALUE;
		// 최댓값을 가지는 학생 번호를 초기화하였습니다.
		int maxScoreStudent = 0;
		// 최솟값을 가지는 학생 번호를 초기화하였습니다.
		int minScoreStudent = 0;
		// 총점을 참조하기 위한 변수를 생성하였습니다.
		int sum = 0;
		
		// 학생의 번호를 알기 위한 for 반복문을 생성하였습니다.
		for(int i = 0; i < lecture.length; i++) {
			
			// 점수 합산을 위한 for 반복문을 생성하였습니다.
			for(int j = 0; j < lecture[i].length; j++) {
				// sum 변수를 이용하여 한 학생(lecture[i])의 점수를 합산하였습니다.
				sum += lecture[i][j];
			}
						
			// 초기화 된 최댓값보다 학생의 총점이 클 경우 해당 총점을 최댓값으로 설정하였고 학생의 번호를 할당시켰습니다.  
			if (maxScore < sum) {
				maxScore = sum;
				maxScoreStudent = i+1;
			}
			// 초기화 된 최솟값보다 학생의 총점이 작을 경우 해당 총점을 최솟값으로 설정하였고 학생의 번호를 할당시켰습니다.
			if (minScore > sum) {
				minScore = sum;
				minScoreStudent = i+1;
			}
			// 다음 학생의 총점을 계산하기 위해 총점을 초기화하였습니다.
			// 단, maxScore 및 minScore에 대한 이전 학생의 총점은 변수에 할당시킨 상태입니다. 
			sum = 0;
			
		}
		
		// 최고점자의 번호와 총점을 출력하였습니다.
		System.out.println("최고점자 = " + maxScoreStudent + "번 학생, " + "총점 = " + maxScore);
		// 최저점자의 번호와 총점을 출력하였습니다.
		System.out.println("최저점자 = " + minScoreStudent + "번 학생, " + "총점 = " + minScore);
		
	}

}
