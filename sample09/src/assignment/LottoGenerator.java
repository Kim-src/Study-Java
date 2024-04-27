package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class LottoGenerator {

	public static void main(String[] args) {
		
		// 개인이 입력한 로또 번호 6개를 참조할 수 있는 배열을 생성하였습니다. 
		int[] lottoUserNumbers = new int[6];
		// 로또 번호 입력 기능 제공을 위한 scan 변수를 생성하였습니다.
		Scanner scan = new Scanner(System.in);
		
		// lottoUserNumbers 배열에 1부터 45까지의 정수를 입력하도록 설정하였습니다.
		for(int i = 0; i < lottoUserNumbers.length; i++) {
			System.out.print("로또 번호 입력 = ");
			lottoUserNumbers[i] = scan.nextInt();
		}
		System.out.println("개인의 로또 번호 = " + Arrays.toString(lottoUserNumbers));
		
		System.out.println("-----------------------------------");
		
		// 로또 번호 정답 6개를 참조할 수 있는 배열을 생성하였습니다.
		int[] lottoWinningNumbers = new int[6];
		
		// lottoWinningNumbers 배열에 1부터 45까지의 정수를 랜덤으로 할당시켰습니다.
		for(int i = 0; i < lottoWinningNumbers.length; i++) {
			lottoWinningNumbers[i] = (int)(Math.random() * 45) + 1;
			
			// lottoUserNumbers 배열에 동일한 요소가 없도록 설정하였습니다.
			for(int j = 0; j < i; j++) {
				if(lottoWinningNumbers[j] == lottoWinningNumbers[i]) {
					i--;
					break;
				}
			}
		}
		
		// 로또 번호 정답을 출력하였습니다.
		System.out.println("당첨된 로또 번호" + Arrays.toString(lottoWinningNumbers));
		System.out.println("보너스 로또 번호" + Arrays.toString(lottoWinningNumbers));
		
		System.out.println("-----------------------------------");
		
		// 당첨 결과를 출력하였습니다.
		System.out.println();
		
	}
	
}
