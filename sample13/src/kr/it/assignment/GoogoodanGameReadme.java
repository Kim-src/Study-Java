package kr.it.assignment;

import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class GoogoodanGameReadme {
	
	/* 프로젝트 설명 */
	
	// 본 프로젝트는 구구단 게임이며 핵심 기능은 아래와 같습니다.
	// 1. 랜덤의 구구단 곱셈식 생성 및 출력
	// 2. 매 곱셈식마다 게임 타이머 작동
	// 3. 정답 입력 및 점수 채점 결과에 따른 게임 결과 출력
	// 4. 타이머 시간 초과 시에 따른 게임 결과 출력
	
	// 핵심 변수는 아래와 같습니다.
	// 1. gameCoinMax : 게임 실행 횟수 결정
	// 2. countTimeDefault : 게임 타이머 시간 설정(초)
	// 각 변수는 클래스 내에서 일일이 값을 할당시키지 않기 위해 정의한 것입니다.
	
	
	/* static 변수 정의 */
	// countTime 변수의 초기값을 설정하기 위해 countTimeDefault 변수를 정의하였습니다.
	static int countTimeDefault = 3;
	// countTime 변수에 countTimeDefault 변수에서 참조하는 값을 할당시켰습니다.
	static int countTime = countTimeDefault;
	
	public static void main(String[] args) {
	
		
		/* 일반 변수 정의 */
		// 구구단 곱셈식 설계를 위한 배열을 생성하였습니다.
		int[] array = new int[9];
		// 구구단의 전항 변수를 생성하였습니다.
		int antecedent = 0;
		// 구구단의 후항 변수를 생성하였습니다.
		int consequent = 0;
		// 구구단 곱셈식 반복문을 위한 변수를 생성하였습니다.
		int gameCoin = 0;
		// 구구단 게임 실행 횟수를 결정하는 값을 할당받는 변수를 생성하였습니다.
		int gameCoinMax = 10;
		// 구구단 게임 정답 입력 시간 초과 시 반복문 종료를 위한 변수를 생성하였습니다.
		boolean gameOver = false;
		// 구구단 곱셈식 정답 입력을 위해 Scanner 클래스를 사용하였습니다.
		Scanner scan = new Scanner(System.in);
		// answer 변수에 입력된 정답을 할당시켰습니다.
		int answer = 0;
		// 구구단 채점을 위한 변수를 생성하였습니다.
		int score = 0;
		// 구구단 게임 참여자의 이름 입력을 위한 변수를 생성하였습니다.
		String user;
		
		
		/* 구구단 게임 시작 */
		// 최대 gameCoinMax개 문제를 풀이하도록 설정하였습니다.
		while(gameCoin < gameCoinMax && gameOver == false) {
		
			/* 구구단 곱셈식 정의 */
			for(int i = 0; i < array.length; i++) {
				array[i] = (int)(Math.random() * 9) + 1;
				antecedent = array[i];
				for(int j = 0; j < array.length; j++) {
					array[j] = (int)(Math.random() * 9) + 1;
					consequent = array[j];
				}
			}
	
			
			/* 구구단 타이머 정의 */
			// while 반복문 내부에서 Timer 및 TimerTask 클래스를 이용하여 변수를 정의하였습니다.
			// 이들을 while 반복문 외부에서 정의하면 schedule 메서드 실행 시 에러가 발생됩니다. 
			Timer timer = new Timer();
			TimerTask task = new TimerTask() {
				public void run() {
					// countTime이 0에 도달하면 타이머가 종료되게 설정하였습니다.
					if(countTime > 0) {
						System.out.println(countTime + "초");
						countTime--;
						if(countTime == 0) {
							System.out.println("---------시간 초과---------");
							System.out.println("숫자를 입력하시면 게임이 종료됩니다.");
							System.out.println("문자를 입력하시면 에러가 발생됩니다.");							
						}
					}
					// countTime에 할당된 값이 0일 경우의 로직은 아래 정답 확인 조건문에 작성하였습니다.
				}
			};
						
			
			/* 구구단 문제 출력 */
			System.out.println(countTimeDefault + "초 안에 정답을 입력하시오.");
			System.out.println(antecedent + " X " + consequent + " = ");
			
			
			/* 구구단 타이머 시작 */
			// Date 클래스를 이용하여 타이머 시작 시간을 설정하였습니다.
			// 이는 타이머 시작 시간을 정확히 설정하는 방법 중 하나입니다.
			// startTime을 설정하지 않으면 schedule 메서드의 파라미터 조건이 바뀌게 됩니다.
			// 참조 사이트 : https://codegym.cc/groups/posts/java-timer-class
			Date startTime = new Date();
			timer.schedule(task, startTime, 1000); // 1000ms = 1s			
			
			
			/* 구구단 정답 입력 */
			if(countTime > 0) {
				answer = scan.nextInt();
			}
						
						
			/* 구구단 정답 확인 */
			if(countTime > 0) {
				if(answer == antecedent*consequent) {
					System.out.println("정답!");
					// countTime에 할당된 초기값을 참조하게 하였습니다.
					countTime = countTimeDefault;
					
					score++;
				}
				else if(answer != antecedent*consequent){
					System.out.println("땡!");
					System.out.println("정답 = " + antecedent*consequent);
					// countTime에 할당된 초기값을 참조하게 하였습니다.
					countTime = countTimeDefault;
				}
			}
			else if(countTime == 0) {
				timer.cancel();
				gameOver = true;
			}
			
			/* while 반복문 1회 종료 시 로직 */
			// 구구단 문항 구분을 위해 공백을 출력하였습니다.
			System.out.println();
			// 타이머가 누적되지 않도록 초기화하였습니다.
			timer.cancel();
			// while 반복문이 반복되도록, 그리고 언젠가 종료되도록 설정하였습니다.
			gameCoin++;
		
		}
		
		// while 반복문이 종료됨과 동시에 타이머를 종료시켰습니다.
		// 참고로 Timer 클래스는 while 반복문 내부에서 이용되었으므로 반복문 외부로 가져올 수 없습니다. 
		countTime = 0;
		// while 반복문이 종료됨과 동시에 버퍼 메모리 공간을 비웠습니다.
		scan.nextLine();
		
		
		/* 구구단 게임 종료 */
		System.out.println("-----게임 종료-----");
		System.out.print("참여자 이름 입력해주세요. = ");
		user = scan.nextLine();
		
		System.out.println();
		
		System.out.println("-----게임 점수-----");
		System.out.println(user + "님 점수 = " + score + "점, " + "만점 = " + gameCoinMax + "점");
		
		// Scanner 클래스를 종료시켰습니다.
		scan.close();
		
	}

}
