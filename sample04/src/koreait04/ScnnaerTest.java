package koreait04;

import java.util.Scanner;

public class ScnnaerTest {
	public static void main(String[] args) {
		
		//스캐너 선언
		Scanner scan = new Scanner(System.in);
	
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
	
		
		System.out.println("입력 :" + num);
	
		System.out.println("문자열을 입력하세요:");
		String str = scan.next();
		
		System.out.println("입력문자 :" + str);
		
		//버퍼에 남아있는 데이터를 지운다.
		scan.nextLine();
		
		System.out.println("문자열을 입력하세요2:");
		String str2 = scan.nextLine();
		
		System.out.println("입력문자2 :" + str2);
		
	}

}
