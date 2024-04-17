package sample04;

import java.util.Scanner;

public class IfTest03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어성적을 입력 = ");
		int kor = scan.nextInt();
		
		if(kor >= 90) {
			System.out.println("점수 = " + kor + ", 등급 = A");
		} else if(kor >= 80) {
			System.out.println("점수 = " + kor + ", 등급 = B");
		} else if(kor >= 70) {
			System.out.println("점수 = " + kor + ", 등급 = C");
		} else if(kor >= 60) {
			System.out.println("점수 = " + kor + ", 등급 = D");
		} else {
			System.out.println("점수 = " + kor + ", 등급 = F");
		}
		
		// Scanner 클래스를 닫기 위해 close() 함수를 사용하였습니다. 
		// 버퍼를 비워주기 위해
		// 가비지 컬렉터
		// 메모리 회수, 자바에 돌려줌
		// 사용했던 메모리를 
		scan.close();
	}

}
