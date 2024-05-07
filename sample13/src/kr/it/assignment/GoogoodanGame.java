package kr.it.assignment;

import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class GoogoodanGame {
	
	static int countTimeDefault = 3;
	static int countTime = countTimeDefault;
	
	public static void main(String[] args) {
	
		int[] array = new int[9];
		int antecedent = 0;
		int consequent = 0;
		int gameCoin = 0;
		int gameCoinMax = 10;
		int answer = 0;
		int score = 0;
		String user;
		boolean gameOver = false;
		Scanner scan = new Scanner(System.in);
				
		while(gameCoin < gameCoinMax && gameOver == false) {
			for(int i = 0; i < array.length; i++) {
				array[i] = (int)(Math.random() * 9) + 1;
				antecedent = array[i];
				for(int j = 0; j < array.length; j++) {
					array[j] = (int)(Math.random() * 9) + 1;
					consequent = array[j];
				}
			}
	
			Timer timer = new Timer();
			TimerTask task = new TimerTask() {
				public void run() {
					if(countTime > 0) {
						System.out.println(countTime + "초");
						countTime--;
						if(countTime == 0) {
							System.out.println("---------시간 초과---------");
							System.out.println("숫자를 입력하시면 게임이 종료됩니다.");
							System.out.println("문자를 입력하시면 에러가 발생됩니다.");							
						}
					}
				}
			};
						
			System.out.println(countTimeDefault + "초 안에 정답을 입력하시오.");
			System.out.println(antecedent + " X " + consequent + " = ");
			
			Date startTime = new Date();
			timer.schedule(task, startTime, 1000); // 1000ms = 1s			
			
			if(countTime > 0) {
				answer = scan.nextInt();
			}
						
			if(countTime > 0) {
				if(answer == antecedent*consequent) {
					System.out.println("정답!");
					countTime = countTimeDefault;
					score++;
				}
				else if(answer != antecedent*consequent){
					System.out.println("땡!");
					System.out.println("정답 = " + antecedent*consequent);
					countTime = countTimeDefault;
				}
			}
			else if(countTime == 0) {
				timer.cancel();
				gameOver = true;
			}
			
			System.out.println();
			timer.cancel();
			gameCoin++;
		
		}
		
		countTime = 0;
		scan.nextLine();	
	
		System.out.println("-----게임 종료-----");
		System.out.print("참여자 이름 입력해주세요. = ");
		user = scan.nextLine();
		
		System.out.println();
		
		System.out.println("-----게임 점수-----");
		System.out.println(user + "님 점수 = " + score + "점, " + "만점 = " + gameCoinMax + "점");
		
		scan.close();
	}
}
