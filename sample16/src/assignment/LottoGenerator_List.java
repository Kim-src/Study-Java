package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LottoGenerator_List {

	public static void main(String[] args) {
		
		/* 로또 프로그램 제작 요구사항 */
		// 1. 로또 번호 생성 : 컴퓨터가 랜덤 출력
		// 2. 로또 번호 입력 : 개발자가 직접 입력
		// 3. 당첨 번호 출력 : 상세 로또 당첨 번호 출력
		// 4. 당첨 결과 출력 : 로또 당첨 등수 또는 낙첨 출력
		// 5. 기존에 구현했던 Array 기반의 로또 시스템을 List 기반의 시스템으로 재구현
		
		
		// * 1. 로또 번호 생성 * //
		// 로또 번호 생성을 위한 lottoSystemNumber 변수를 정의하였습니다.
		int lottoSystemNumber = 0;		
		// 로또 당첨 번호를 할당시키기 위한 lottoWinningNumber 리스트를 생성하였습니다.
		List<Integer> lottoWinningNumber = new LinkedList<>();
		// 로또 보너스 번호를 할당시키기 위한 lottoBonusNumber 리스트를 생성하였습니다.
		List<Integer> lottoBonusNumber = new LinkedList<>();
				
		// 로도 번호 생성을 위한 반복문을 정의하였습니다.
		for(int i = 0; i < 7; i++) {
			// lottoSystemNumber 변수에 1부터 45까지의 랜덤의 정수를 할당시켰습니다.
			lottoSystemNumber = (int)(Math.random() * 45) + 1;
			
			if(i < 6) {
				// 생성된 로또 번호가 중복된다면 반복문 순서를 차감시켰습니다.
				if(lottoWinningNumber.contains(lottoSystemNumber) == true) {
					i--;
					// 인덱스 차감이 아닌 remove 메서드를 이용하여 중복된 데이터를 삭제시키는 방법도 있습니다.
				}
				// 생성된 로또 번호가 중복되지 않는다면 lottoWinningNumber 리스트에 로또 번호를 할당시켰습니다.
				else if(lottoWinningNumber.contains(lottoSystemNumber) == false) {
					lottoWinningNumber.add(lottoSystemNumber);
				}
			}
			else {
				// 생성된 로또 번호가 중복된다면 반복문 순서를 차감시켰습니다.
				if(lottoWinningNumber.contains(lottoSystemNumber) == true) {
					i--;
					// 인덱스 차감이 아닌 remove 메서드를 이용하여 중복된 데이터를 삭제시키는 방법도 있습니다.
				}
				// 생성된 로또 번호가 중복되지 않는다면 lottoBonusNumber 리스트에 로또 번호를 할당시켰습니다.
				else if(lottoWinningNumber.contains(lottoSystemNumber) == false) {
					lottoBonusNumber.add(lottoSystemNumber);
				}
			}
		}
		
		// 생성된 로또 번호를 출력하였습니다.
		System.out.println("-----------------------------------");		
		System.out.println("로또 당첨 번호 = " + lottoWinningNumber);
		System.out.println("로또 보너스 번호 = " + lottoBonusNumber);		
		System.out.println("-----------------------------------");
		
		
		/* 2. 로또 번호 입력 */
		// 로또 입력 번호 할당을 위한 lottoUserNumber 리스트를 생성하였습니다.
		List<Integer> lottoUserNumber = new LinkedList<>();
		// 로또 번호 입력을 위해 Scanner 클래스를 사용하였습니다.
		Scanner scan = new Scanner(System.in);
		// 입력된 로또 번호를 처리할 lottoCheckNumber 변수를 정의하였습니다.
		int lottoCheckNumber = 0;
		
		// 번호 입력을 위한 반복문을 정의하였습니다.
		while(lottoUserNumber.size() < 6) {
			// 로또 번호의 입력 횟수를 안내하였습니다.
			System.out.print((lottoUserNumber.size() + 1) + "번째 로또 번호 입력 = ");
			// lottoCheckNumber 변수에 정수를 입력할 수 있게 설정하였습니다.
			lottoCheckNumber = scan.nextInt();
			
			// 조건문으로 lottoCheckNumber 변수에 1부터 45까지의 정수가 할당될 경우를 설정하였습니다.
			// 꼭 if 조건문만이 아니라 try-catch 구문을 적용시킬 수도 있습니다.
			if(lottoCheckNumber > 0 && lottoCheckNumber < 46) {
				// 입력된 번호가 중복되지 않는다면 lottoUserNumber 리스트에 로또 번호를 할당시켰습니다.
				if(lottoUserNumber.contains(lottoCheckNumber) == false) {
					lottoUserNumber.add(lottoCheckNumber);
				}
				// 입력된 번호가 중복된다면 값이 중복됐다는 안내 문구를 출력하고 조건문을 재실행하였습니다.
				else if(lottoUserNumber.contains(lottoCheckNumber) == true) {
					System.out.println("중복된 값입니다.");
					continue;
				}
			}
			// 조건문으로 lottoCheckNumber 변수에 로또 번호에 적합하지 않은 정수가 할당될 경우를 설정하였습니다.
			else if(lottoCheckNumber < 1 || lottoCheckNumber > 45) {
				// 값을 다시 입력하라는 안내 문구를 출력하고 조건문을 재실행하였습니다.
				System.out.println("1부터 45까지의 숫자를 입력하세요.");
				continue;
			}			
		}		
		
		// 메모리 누수 방지를 위해 스캐너 사용을 종료하였습니다.
		scan.close();
		
		// 입력된 로또 번호를 출력하였습니다.
		System.out.println("-----------------------------------");
		System.out.println("개인 로또 번호 = " + lottoUserNumber);		
		System.out.println("-----------------------------------");
		
		
		/* 3. 당첨 번호 출력 */
		// 당첨 결과 안내 문구를 단 1회만 출력하기 위한 check 변수를 정의하였습니다.
		boolean check = false;
		
		// 입력된 로또 번호와 시스템의 로또 번호가 일치할 경우 check 변수에 true를 할당시켰습니다.
		for(int i = 0; i < lottoUserNumber.size(); i++) {
			for(int j = 0; j < lottoUserNumber.size(); j++) {
				if(lottoUserNumber.get(i) == lottoWinningNumber.get(j)) {
					check = true;
				}
			}
			// check 변수에 true가 할당되었을 경우 안내 문구를 출력하고 반복문을 종료시켰습니다.
			if(check == true) {
				System.out.print("당첨 번호 = ");
				break;
			}	
		}
		
		// 입력된 로또 번호와 시스템의 로또 번호가 일치할 경우 일치된 번호를 출력하였습니다.
		for(int i = 0; i < lottoUserNumber.size(); i++) {
			for(int j = 0; j < lottoUserNumber.size(); j++) {
				if(lottoUserNumber.get(i) == lottoWinningNumber.get(j)) {
					System.out.print(lottoUserNumber.get(i) + ", ");
				}
			}
		}
		
		
		/* 4. 당첨 결과 출력 */
		// 담첨된 로또 번호의 개수를 합산하기 위한 winningCount 변수를 정의하였습니다.
		int winningCount = 0;
		// 당첨된 보너스 번호의 개수를 합산하기 위한 bonusCount 변수를 정의하였습니다.
		int bonusCount = 0;
		
		// 입력된 로또 번호가 시스템의 로또 번호와 일치할 경우에 대한 반복문을 정의하였습니다.
		for(int i = 0; i < lottoUserNumber.size(); i++) {
			// 입력된 로또 번호가 시스템의 로또 번호와 일치할 경우 winningCount를 증가시켰습니다.
			for(int j = 0; j < lottoWinningNumber.size(); j++) {
				if(lottoUserNumber.get(i) == lottoWinningNumber.get(j)) {
					winningCount++;
				}
			}
			// 입력된 로또 번호가 보너스 로또 번호와 일치할 경우 bonusCount를 증가시켰습니다.
			for(int j = 0; j < lottoBonusNumber.size(); j++) {
				if(lottoUserNumber.get(i) == lottoBonusNumber.get(j)) {
					bonusCount++;
				}
			}
		}
		
		// 로또 당첨 결과 출력을 위해 switch 조건문을 정의하였습니다.
		switch(winningCount) {
		// 로또 당첨 번호 개수가 6일 경우를 정의하였습니다.
		case 6 :
			// 당첨 결과를 출력하였습니다.
			System.out.println("당첨 결과 = 1등");
			// 당첨 결과 출력 후 switch 조건문에서 이탈시켰습니다.
			break;
		// 로또 당첨 번호 개수가 5일 경우를 정의하였습니다.
		case 5 :
			if(bonusCount == 1) {
				// 보너스 번호에 당첨되었을 경우의 결과를 출력하였습니다.
				System.out.println("당첨 결과 = 2등");
			} else {
				// 보너스 번호에 당첨되지 않았을 경우의 결과를 출력하였습니다.
				System.out.println("당첨 결과 = 3등");
			}
			// 당첨 결과 출력 후 switch 조건문에서 이탈시켰습니다.
			break;
		// 로또 당첨 번호 개수가 4일 경우를 정의하였습니다.		
		case 4 : 
			// 당첨 결과를 출력하였습니다.
			System.out.println("당첨 결과 = 4등");
			// 당첨 결과 출력 후 switch 조건문에서 이탈시켰습니다.
			break;
		// 로또 당첨 번호 개수가 3일 경우를 정의하였습니다.
		case 3 : 
			// 당첨 결과를 출력하였습니다.
			System.out.println("당첨 결과 = 5등");
			// 당첨 결과 출력 후 switch 조건문에서 이탈시켰습니다.
			break;
		// 로또 당첨 번호 개수가 2 이하일 경우를 정의하였습니다.
		default :
			// 당첨 결과를 출력하였습니다.
			System.out.println("당첨 결과 = 낙첨");
		}
		
		System.out.println("-----------------------------------");
	}
}
