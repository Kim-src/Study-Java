package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class LottoGenerator_List {

	public static void main(String[] args) {
		
		// * 로또 프로그램 요구사항 * //
		// 1. 로또 당첨 번호 생성 : 컴퓨터가 랜덤 출력
		// 2. 로또 보너스 번호 생성 : 컴퓨터가 랜덤 출력
		// 3. 로또 개인 번호 생성 : 개발자가 직접 입력
		// 4. 로또 번호 일치 결과 출력 : 상세한 로또 당첨 번호 출력
		// 5. 로또 당첨 결과 등수 출력 : 로또 당첨 등수 또는 낙첨 출력
		// 결과 출력 전, 당첨 결과 출력 테스트 필요
		
		
		// * 로또 당첨 번호 * //
		// 로또 당첨 번호 6개를 참조할 수 있는 배열을 생성하였습니다.
		int[] lottoWinningNumber = new int[6];
		// 로또 보너스 번호 1개를 참조할 수 있는 배열을 생성하였습니다.
		int[] lottoBonusNumber = new int[1];
		
		// 일반 로또 번호 배열에 1부터 45까지의 정수를 랜덤으로 할당시켰습니다.
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
		System.out.println("로또 당첨 번호 = " + Arrays.toString(lottoWinningNumber));
		System.out.println("로또 보너스 번호 = " + Arrays.toString(lottoBonusNumber));
		
		
		System.out.println("-----------------------------------");
		
		
		
		// * 개인의 로또 번호 * //
		
		// 개인이 입력한 로또 번호 6개를 참조할 수 있는 배열을 생성하였습니다. 
		int[] lottoUserNumber = new int[6];
		// 로또 번호 입력 기능 제공을 위한 scan 변수를 생성하였습니다.
		Scanner scan = new Scanner(System.in);
		
		// lottoUserNumbers 배열에 정수를 입력할 수 있도록 설정하였습니다.
		for(int i = 0; i < lottoUserNumber.length; i++) {
			System.out.print("로또 번호 입력 = ");
			lottoUserNumber[i] = scan.nextInt();
			
			// 1부터 45까지의 정수를 입력하도록 설정하였습니다.
			if(lottoUserNumber[i] < 1 || lottoUserNumber[i] > 45) {
				System.out.println("1부터 45까지의 정수를 입력해주세요.");
				// 반복문을 중지시키지 않고 인덱스만 차감되도록 설정하였습니다.
				i--;
				// 조건문을 완전 이탈하지는 않도록 설정하였습니다.
				continue;
			}
			
			// lottoUserNumbers 배열 요소 중 동일한 값이 있을 경우 재입력을 요청하였습니다. 
			for(int j = 0; j < i; j++) {
				// 이중 for 반복문을 이용하여 배열의 전체 인덱스에 대한 요소를 비교하였습니다.
				// 중복값이 존재할 경우 if 조건문이 실행되도록 설정하였습니다.
				if(lottoUserNumber[j] == lottoUserNumber[i]) {
					System.out.println("중복값입니다. 다시 입력해주세요.");
					// 인덱스를 감소시킴으로써 중복값 입력이 무효화되도록 설정하였습니다.
					i--;
					// 내부 for 반복문이 즉시 종료되고 초기 for 반복문으로 이동되도록 설정하였습니다.  
					break;
				}
			}
		}
		
		// 스캐너 사용을 종료하였습니다.
		scan.close();
		
		
		System.out.println("-----------------------------------");
		
		
		// 개인이 입력한 로또 번호를 출력하였습니다.
		System.out.println("개인 로또 번호 = " + Arrays.toString(lottoUserNumber));
		
		
		System.out.println("-----------------------------------");
		
		
		// * 로또 당첨 결과 테스트 * //
		
//		// 테스트 변수에 당첨 결과 테스트를 위한 번호를 할당시켰습니다.
//		int[] userTest = {1,2,3,4,5,7};
//		int[] lottoTest = {1,2,3,4,5,6};
//		int[] bonusTest = {7};
//		// 로또 번호 당첨 개수를 합산하기 위한 변수를 생성하였습니다.
//		int winCount = 0;
//		// 보너스 번호에 당첨되었을 경우를 위한 변수를 생성하였습니다.
//		int bonusCount = 0;
//		
//		// 일반 로또 당첨에 대한 for 반복문을 생성하였습니다.
//		for(int i = 0; i < lottoTest.length; i++) {
//			for(int j = 0; j < userTest.length; j++) {		
//				// 개인의 로또 번호가 일반 로또 번호와 일치할 경우를 if 조건문으로 설정하였습니다.
//				if(lottoTest[i] == userTest[j]) {
//					// winCount가 1씩 증가되도록 설정하였습니다.
//					winCount++;
//				}
//			}
//		}
//		
//		// 보너스 로또 당첨에 대한 for 반복문을 생성하였씁니다.
//		for(int i = 0; i < bonusTest.length; i++) {
//			for(int j = 0; j < userTest.length; j++) {
//				// 개인의 로또 번호가 보너스 로또 번호와 일치할 경우를 if 조건문으로 설정하였습니다.
//				if(bonusTest[i] == userTest[j]) {
//					// bonusCount가 1씩 증가되도록 설정하였습니다.
//					bonusCount++;
//				}
//			}
//		}
		
		
		// * 로또 당첨 결과 * //
		// 로또 번호 당첨 개수를 합산하기 위한 변수를 생성하였습니다.
		int winCount = 0;
		// 보너스 번호에 당첨되었을 경우를 위한 변수를 생성하였습니다.
		int bonusCount = 0;
		
		// 일반 로또 당첨에 대한 for 반복문을 생성하였습니다.
		for(int i = 0; i < lottoWinningNumber.length; i++) {
			for(int j = 0; j < lottoUserNumber.length; j++) {		
				// 개인의 로또 번호가 일반 로또 번호와 일치할 경우를 if 조건문으로 설정하였습니다.
				if(lottoWinningNumber[i] == lottoUserNumber[j]) {
					// winCount가 1씩 증가되도록 설정하였습니다.
					winCount++;
				}
			}
		}
		
		// 보너스 로또 당첨에 대한 for 반복문을 생성하였씁니다.
		for(int i = 0; i < lottoBonusNumber.length; i++) {
			for(int j = 0; j < lottoUserNumber.length; j++) {
				// 개인의 로또 번호가 보너스 로또 번호와 일치할 경우를 if 조건문으로 설정하였습니다.
				if(lottoBonusNumber[i] == lottoUserNumber[j]) {
					// bonusCount가 1씩 증가되도록 설정하였습니다.
					bonusCount++;
				}
			}
		}
		
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
		switch(winCount) {
		// 로또 당첨 번호 개수가 6일 경우를 설정하였습니다.
		case 6 :
			// 당첨 결과를 출력하였습니다.
			System.out.println("당첨 결과 = 1등");
			// 당첨 결과 출력 후 switch 조건문에서 이탈시켰습니다.
			break;
		// 로또 당첨 번호 개수가 5일 경우를 설정하였습니다.
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
