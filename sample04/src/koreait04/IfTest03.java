package koreait04;

import java.util.Scanner;

public class IfTest03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("국어성적을 입력 : ");
		int kor = scan.nextInt();
		
		if(kor >=90) {
			System.out.println("점수 : " + kor +", 등급 : A");
		
		}else  	if(kor >=80) {
			System.out.println("점수 : " + kor +", 등급 : B");
		
		}else  	if(kor >=70) {
			System.out.println("점수 : " + kor +", 등급 : C");
		
		}else  	if(kor >=60) {
			System.out.println("점수 : " + kor +", 등급 : D");
		
		}else {
			System.out.println("점수 : " + kor +", 등급 : F");
		}
		
		//스캐너는 다쓰고 닫아야 한다.
		scan.close();
	}

}
