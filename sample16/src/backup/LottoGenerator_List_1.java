package backup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LottoGenerator_List_1 {

	public static void main(String[] args) {
		// 정적인 배열 기반 로또 시스템을 동적인 리스트로
		// * 로또 프로그램 요구사항 * //
		// 1. 로또 당첨 번호 생성 : 컴퓨터가 랜덤 출력
		// 2. 로또 보너스 번호 생성 : 컴퓨터가 랜덤 출력
		// 3. 로또 개인 번호 생성 : 개발자가 직접 입력
		// 4. 로또 번호 일치 결과 출력 : 상세한 로또 당첨 번호 출력
		// 5. 로또 당첨 결과 등수 출력 : 로또 당첨 등수 또는 낙첨 출력
		// 결과 출력 전, 당첨 결과 출력 테스트 필요
		
		
		// * 로또 당첨 번호 * //
		// 로또 당첨 번호 6개를 참조할 수 있는 배열을 생성하였습니다.
		int lottoSystemNumber = 0;		
		List<Integer> lottoWinningNumber_List = new LinkedList<>();
		List<Integer> lottoBonusNumber_List = new LinkedList<>();
		int[] lottoWinningNumber = new int[6];
		// 로또 보너스 번호 1개를 참조할 수 있는 배열을 생성하였습니다.
		int[] lottoBonusNumber = new int[1];
		
		System.out.println("*");
		
		// 일반 로또 번호 배열에 1부터 45까지의 정수를 랜덤으로 할당시켰습니다.
		for(int i = 0; i < 7; i++) {
			lottoSystemNumber = (int)(Math.random() * 7) + 1;
			
			if(i < 6) {
				if(lottoWinningNumber_List.contains(lottoSystemNumber) == true) {
					i--;
				}
				else if(lottoWinningNumber_List.contains(lottoSystemNumber) == false) {
					lottoWinningNumber_List.add(lottoSystemNumber);
				}
			}
			else {
				if(lottoWinningNumber_List.contains(lottoSystemNumber) == true) {
					i--;
				}
				else if(lottoWinningNumber_List.contains(lottoSystemNumber) == false) {
					lottoBonusNumber_List.add(lottoSystemNumber);
				}
			}
		}
		
		System.out.println("**");
		System.out.println(lottoWinningNumber_List);
		System.out.println("***");
		System.out.println(lottoBonusNumber_List);		
		System.out.println("****");
		System.out.println(lottoSystemNumber);
		
		
		
		for(int i = 0; i < lottoWinningNumber.length; i++) {
			lottoWinningNumber[i] = (int)(Math.random() * 45) + 1;
			
			// 일반 로또 번호 배열에 동일한 요소가 없도록 설정하였습니다.
			for(int j = 0; j < i; j++) {
				if(lottoWinningNumber[j] == lottoWinningNumber[i]) {
					i--;
					break;
				}
			}
		}
		
		// 보너스 로또 번호 배열에 1부터 45까지의 정수를 랜덤으로 할당시켰습니다.
		for(int i = 0; i < lottoBonusNumber.length; i++) {
			lottoBonusNumber[i] = (int)(Math.random() * 45) + 1;
			
			// 보너스 로또 번호와 일반 로또 번호가 중복되지 않도록 설정하였습니다.
			for(int j = 0; j < lottoWinningNumber.length; j++) {
				if(lottoWinningNumber[j] == lottoBonusNumber[i]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println("-----------------------------------");
		
		// 로또 당첨 번호를 출력하였습니다.
		System.out.println("로또 당첨 번호 = " + lottoWinningNumber_List);
		System.out.println("로또 보너스 번호 = " + lottoBonusNumber_List);
		
		System.out.println("-----------------------------------");
		
		
		
		// * 개인 로또 번호 입력 * //

		// 개인이 입력한 로또 번호 6개를 참조할 수 있는 배열을 생성하였습니다.
		List<Integer> lottoUserNumber_List = new LinkedList<>();
		int[] lottoUserNumber = new int[6];
		// 로또 번호 입력 기능 제공을 위한 scan 변수를 생성하였습니다.
		Scanner scan = new Scanner(System.in);
		int lottoCheckNumber = 0;
		
		while(lottoUserNumber_List.size() < 6) {
			System.out.print((lottoUserNumber_List.size() + 1) + "번째 로또 번호 입력 = ");
			lottoCheckNumber = scan.nextInt();
			
			if(lottoCheckNumber > 0 && lottoCheckNumber < 46) {
				if(lottoUserNumber_List.contains(lottoCheckNumber) == false) {
					lottoUserNumber_List.add(lottoCheckNumber);
				}
				else if(lottoUserNumber_List.contains(lottoCheckNumber) == true) {
					System.out.println("중복된 값입니다.");
					continue;
				}
			}
			else if(lottoCheckNumber < 1 || lottoCheckNumber > 45) {
				System.out.println("1부터 45까지의 숫자를 입력하세요.");
				continue;
			}			
		}		
		
		// 스캐너 사용을 종료하였습니다.
		scan.close();
		
		// 개인이 입력한 로또 번호를 출력하였습니다.
		System.out.println("-----------------------------------");
		
		System.out.println("개인 로또 번호 = " + lottoUserNumber_List);		
		
		System.out.println("-----------------------------------");
		
		
		// * 로또 당첨 결과 * //
		// 로또 번호 당첨 개수를 합산하기 위한 변수를 생성하였습니다.
		int winningCount = 0;
		int bobo = 0;
		int winCount = 0;
		// 보너스 번호에 당첨되었을 경우를 위한 변수를 생성하였습니다.
		int bonusCount = 0;
		
		for(int i = 0; i < lottoUserNumber_List.size(); i++) {
			for(int j = 0; j < lottoWinningNumber_List.size(); j++) {
				if(lottoUserNumber_List.get(i) == lottoWinningNumber_List.get(j)) {
					winningCount++;
				}
			}
			for(int j = 0; j < lottoBonusNumber_List.size(); j++) {
				if(lottoUserNumber_List.get(i) == lottoBonusNumber_List.get(j)) {
					bobo++;
				}
			}
		}
			System.out.println("*****");
		
		System.out.println("*");
		System.out.println(winningCount);
		System.out.println(bobo);
		System.out.println("*");
		
		
		// 로또 번호 일치 결과 출력을 위한 배열을 생성하였습니다.
		int[] detailWinningNumber = new int[6];
		int[] detailBonusNumber = new int[1];
		
		// 로또 일반 번호 일치 결과 출력을 위한 반복문을 생성하였습니다.
		for(int i = 0; i < lottoWinningNumber.length; i++) {
			for(int j = 0; j < lottoUserNumber.length; j++) {
				
				if(lottoWinningNumber[i] == lottoUserNumber[j]) {
					detailWinningNumber[i] = lottoWinningNumber[i];
				}
			}
		}
		
		// 로또 보너스 번호 일치 결과 출력을 위한 반복문을 생성하였습니다.
		for(int i = 0; i < lottoBonusNumber.length; i++) {
			for(int j = 0; j < lottoUserNumber.length; j++) {
				if(lottoBonusNumber[i] == lottoUserNumber[j]) {
					detailBonusNumber[i] = lottoBonusNumber[i];
				}
			}
		}
		
		// 로또 번호 일치 번호 안내문을 1회만 출력하고 반복문에서 이탈시켰습니다.
		for(int i = 0; i < detailWinningNumber.length; i++) {
			if(detailWinningNumber[i] != 0) {
				System.out.print("일치 번호 = ");
				break;
			}
		}
		
		// 로또 번호 일치 결과 출력을 위한 반복문 및 조건문을 생성하였습니다.
		for(int i = 0; i < detailWinningNumber.length; i++) {
			if(detailWinningNumber[i] != 0) {
				System.out.print(detailWinningNumber[i] + ", ");
			}
		}
		
		// 로또 당첨 결과 출력을 위해 switch 조건문을 생성하였습니다.
		switch(winningCount) {
		// 로또 당첨 번호 개수가 6일 경우를 설정하였습니다.
		case 6 :
			// 당첨 결과를 출력하였습니다.
			System.out.println("당첨 결과 = 1등");
			// 당첨 결과 출력 후 switch 조건문에서 이탈시켰습니다.
			break;
		// 로또 당첨 번호 개수가 5일 경우를 설정하였습니다.
		case 5 :
			if(bobo == 1) {
				// 보너스 번호에 당첨되었을 경우의 결과를 출력하였습니다.
				System.out.println("당첨 결과 = 2등");
			} else {
				// 보너스 번호에 당첨되지 않았을 경우의 결과를 출력하였습니다.
				System.out.println("당첨 결과 = 3등");
			}
			// 당첨 결과 출력 후 switch 조건문에서 이탈시켰습니다.
			break;
		// 로또 당첨 번호 개수가 4일 경우를 설정하였습니다.		
		case 4 : 
			// 당첨 결과를 출력하였습니다.
			System.out.println("당첨 결과 = 4등");
			// 당첨 결과 출력 후 switch 조건문에서 이탈시켰습니다.
			break;
		// 로또 당첨 번호 개수가 3일 경우를 설정하였습니다.
		case 3 : 
			// 당첨 결과를 출력하였습니다.
			System.out.println("당첨 결과 = 5등");
			// 당첨 결과 출력 후 switch 조건문에서 이탈시켰습니다.
			break;
		// 로또 당첨 번호 개수가 2 이하일 경우를 설정하였습니다.
		default :
			// 당첨 결과를 출력하였습니다.
			System.out.println("당첨 결과 = 낙첨");
		}
		
		
		System.out.println("-----------------------------------");
		
	}
	
}
