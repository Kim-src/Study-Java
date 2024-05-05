package kr.it.assignment;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class GoogoodanMaster {
	
//	// static 설정해야만 타이머 변수가 설정되는데 이유는 잘 모르겠습니다.
//	// 변수 선언 위치는 main 메서드보다 먼저 되어야 되는데 그 이유도 잘 모르겠습니다.
//	static int[] countTime = new int[3];
	
	
	/* main 메서드 */
	public static void main(String[] args) {
		
		/* 구구단 게임 체계 */
		// 구구단 곱셈식 설계를 위한 배열을 생성하였습니다.
		int[] array = new int[9];
		// 구구단의 전항 및 후항에 대한 변수를 생성하였습니다.
		int antecedent = 0;
		int consequent = 0;
		// 구구단 곱셈식 반복문을 위한 변수를 생성하였습니다.
		int quiz = 0;
		// 구구단 곱셈식 정답 확인을 위한 변수를 생성하였습니다.
		int answer = 0;
		// 구구단 채점을 위한 변수를 생성하였습니다.
		int score = 0;
		
		// 구구단 곱셈식 정답 입력을 위해 Scanner 클래스를 사용하였습니다.
		Scanner scan = new Scanner(System.in);
		// 구구단 게임 참여자의 이름 입력을 위한 변수를 생성하였습니다.
		String user;
		
		
		/* 구구단 게임 시작 */
		// 최대 10개 문제를 풀이하도록 설정하였습니다.
		while(quiz < 5) {
		
			/* 구구단 곱셈식 */
			for(int i = 0; i < array.length; i++) {
				array[i] = (int)(Math.random() * 9) + 1;
				antecedent = array[i];
				for(int j = 0; j < array.length; j++) {
					array[j] = (int)(Math.random() * 9) + 1;
					consequent = array[j];
				}
			}
		
			/* 구구단 정답 입력 */
			System.out.println("정답을 입력하시오.");
			System.out.print(antecedent + " X " + consequent + " = ");
			answer = scan.nextInt();
			
//			if(answer == 0) {
//				/* 구구단 게임 타이머 */
//				Timer timer = new Timer();
//				TimerTask task = new TimerTask() {
//					public void run() {
//						if(answer != 0) {
//							/* 구구단 정답 */
//							if(antecedent*consequent == answer) {
//								System.out.println("정답!");
//								score++;
//							} else {
//								System.out.println("땡!");
//								System.out.println("정답 = " + antecedent*consequent);
//							}
//						}
//					}
//				};
//				timer.schedule(task, 3000);
//				answer = scan.nextInt();
//			} else if(answer != 0) {
//				answer = 0;
//				/* 구구단 게임 타이머 */
//				Timer timer = new Timer();
//				TimerTask task = new TimerTask() {
//					public void run() {
//						if(answer != 0) {
//							/* 구구단 정답 */
//							if(antecedent*consequent == answer) {
//								System.out.println("정답!");
//								score++;
//							} else {
//								System.out.println("땡!");
//								System.out.println("정답 = " + antecedent*consequent);
//							}
//						}
//					}
//				};
//				timer.schedule(task, 3000);
//			
//					if(countTime > 0) {
//					System.out.println("남은 시간 = " + countTime + "초");
//					countTime--;
//				} else {
//					System.out.println("입력 시간 초과");
//				}
			
			
			/* 구구단 정답 */
			if(antecedent*consequent == answer) {
				System.out.println("정답!");
				score++;
			} else {
				System.out.println("땡!");
				System.out.println("정답 = " + antecedent*consequent);
			}
			
			// 공백 및 while 반복문 종료 로직을 설정하였습니다.
			System.out.println();
			quiz++;
		
		}
		
		scan.nextLine();
		
		System.out.println("-----게임 종료-----");
		System.out.print("참여자 이름 입력해주세요. = ");
		user = scan.nextLine();
		
		System.out.println();
		
		System.out.println("-----게임 점수-----");
		System.out.println(user + "님 점수 = " + score + "점, " + "만점 = " + quiz + "점");
		
		// Scanner 클래스를 종료시켰습니다.
		scan.close();
		
	}

}
