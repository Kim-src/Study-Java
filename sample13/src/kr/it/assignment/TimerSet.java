package kr.it.assignment;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class TimerSet {
	
	static int countTime = 3;
	
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
		
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			public void run() {
				if(countTime > 0) {
					System.out.println("남은시간 = " + countTime + "초");
					countTime--;
				}
				else {
					timer.cancel();
					System.out.println("-----게임 종료-----");
				}
			}
		};
		
		timer.schedule(task, 0, 1000);
		
	}
}
