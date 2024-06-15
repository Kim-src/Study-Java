package Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTest {
	
	public static void main(String[] args) {
		
		int num = 10;
		int result = 1;
		Scanner scan = new Scanner(System.in);
		
		// 문법적으로는 맞지만 수학적으로는 문제가 있는 공식을 작성하였습니다.
		try {
			result = num / 0;
		}
		// ArithmeticException 에러 발생 시 안내 문구를 출력하였습니다.
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		// result에 할당된 값이 변경됐는지 확인하였습니다.
		System.out.println(result);
		
		// 문법적으로는 맞지만 사용자가 잘못 입력할 수 있는 코드를 작성하였습니다.
		try {
			System.out.println("숫자를 입력하세요.");
			System.out.print("숫자 입력 = ");			
			scan.nextInt();
			System.out.println("입력 완료");
		}
		// InputMismatchException 에러 발생 시 안내 문구를 출력하였습니다.
		catch(InputMismatchException e) {
			System.out.println("문자를 입력하셨습니다.");
			System.out.println("숫자를 입력하세요.");
			scan.nextLine();
			
			try {
				System.out.print("숫자 입력 = ");
				scan.nextInt();
				System.out.println("입력 완료");
			}
			catch(InputMismatchException ee) {
				System.out.println("문자가 입력되어 시스템을 종료합니다.");
			}
		}
		
		scan.close();
		
	}

}
