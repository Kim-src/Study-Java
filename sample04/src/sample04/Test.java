package sample04;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	    
		// 키보드로 타이핑 된 내용을 버퍼 공간에 저장하는 scan 변수를 정의하였습니다.
		Scanner scan = new Scanner(System.in);
		
		// 3명의 시험 점수를 입력할 수 있는 반복문을 작성하였습니다.
		for(int i = 0; i < 3; i++) {
			// 점수 입력을 안내하는 문구를 출력하였습니다.
			System.out.println("점수를 입력하세요.");
			// 점수를 입력할 수 있는 score 변수를 정의하였습니다.
			int score = scan.nextInt();
			// 점수가 70점 초과일 경우 상위권으로 분류하였습니다.
			if(score > 70) {
				System.out.println(score + "점 = 상위권");
			// 점수가 70점 이하 40점 초과일 경우 중위권으로 분류하였습니다.
			} else if(score > 40) {
				System.out.println(score + "점 = 중위권");
			// 점수가 40점 이하일 경우 하위권으로 분류하였습니다.
			} else {
				System.out.println(score + "점 = 하위권");
			}
		}
		
		// 버퍼 공간에 잔여되어 있는 모든 공백을 제거하였습니다.
		scan.nextLine();
		
		// 질문을 입력할 수 있도록 설정하였습니다.
		System.out.println("질문을 입력하세요.");
		String question = scan.nextLine();
		System.out.println("질문 = " + question);

	}
	
}
