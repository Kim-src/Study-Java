package kr.it.backup;

import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class GoogoodanMasterVersion_4 {
	
	/* 해결해야 될 것 */
	// 1. answer를 입력할 때마다 타이머 감소가 더 가속되는 이유 파악하기
	// 2. 입력 시간 초과 시 answer 입력 후에만 '입력 시간 초과' 안내문이 출력되고 게임이 종료되는데, answer를 입력하지 않아도 '입력 시간 초과' 안내문이 출력되고 게임이 종료되게 설정할 수 있는지 알아보기
	// 3. countTime을 정의할 때 왜 static 데이터 타입으로 선언해야만 되는지 파악하기
	
	static int countTime = 10;
	
	public static void main(String[] args) {
		
		/* 구구단 게임 체계 */
		// 구구단 곱셈식 설계를 위한 배열을 생성하였습니다.
		int[] array = new int[9];
		// 구구단의 전항 및 후항에 대한 변수를 생성하였습니다.
		int antecedent = 0;
		int consequent = 0;
		// 구구단 곱셈식 반복문을 위한 변수를 생성하였습니다.
		int gameCoin = 0;
		// 구구단 게임 정답 입력 시간 초과 시 반복문 종료를 위한 변수를 생성하였습니다.
		boolean gameOver = false;
		// 구구단 곱셈식 정답 입력을 위해 Scanner 클래스를 사용하였습니다.
		Scanner scan = new Scanner(System.in);
		int answer = 0;
		// 구구단 채점을 위한 변수를 생성하였습니다.
		int score = 0;
		// 구구단 게임 참여자의 이름 입력을 위한 변수를 생성하였습니다.
		String user;
		
		
		/* 구구단 게임 시작 */
		// 최대 5개 문제를 풀이하도록 설정하였습니다.
		while(gameCoin < 5 && gameOver == false) {
		
			/* 구구단 곱셈식 */
			for(int i = 0; i < array.length; i++) {
				array[i] = (int)(Math.random() * 9) + 1;
				antecedent = array[i];
				for(int j = 0; j < array.length; j++) {
					array[j] = (int)(Math.random() * 9) + 1;
					consequent = array[j];
				}
			}
	
			
			/* 구구단 타이머 설정 */
			Timer timer = new Timer();
			TimerTask task = new TimerTask() {
				public void run() {
					// countTime이 0에 도달하면 타이머가 종료되게 설정하였습니다.
					if(countTime > 0) {
						System.out.println(countTime + "초");
						countTime--;
					} else if(countTime == 0) {
						timer.cancel();
					}
				}
			};
						
			Date startTime = new Date();
			timer.schedule(task, startTime, 1000);			
			
			
			/* 구구단 정답 입력 */
			System.out.println("5초 안에 정답을 입력하시오.");
			System.out.println(antecedent + " X " + consequent + " = ");
			answer = scan.nextInt();

						
			/* 구구단 정답 확인 */
			if(countTime > 0) {
				if(answer == antecedent*consequent) {
					System.out.println("정답!");
					countTime = 10;
					score++;
				}
				else if(answer != antecedent*consequent){
					System.out.println("땡!");
					System.out.println("정답 = " + antecedent*consequent);
					countTime = 10;
				}
			}
			else if(countTime == 0) {
				System.out.println("입력 시간 초과");
				gameOver = true;
			}
			
			// 공백 및 while 반복문 종료 로직을 설정하였습니다.
			System.out.println();
			gameCoin++;
		
		}
		
		// while 반복문이 1회 종료될 때마다 버퍼 메모리 공간을 비웠습니다.
		scan.nextLine();
		
		
		/* 구구단 게임 종료 */
		System.out.println("-----게임 종료-----");
		System.out.print("참여자 이름 입력해주세요. = ");
		user = scan.nextLine();
		
		System.out.println();
		
		System.out.println("-----게임 점수-----");
		System.out.println(user + "님 점수 = " + score + "점, " + "만점 = " + gameCoin + "점");
		
		// Scanner 클래스를 종료시켰습니다.
		scan.close();
		
	}

}
