package lecture;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RaiseExceptionExample {
	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		int dan = 0;
		while(true) {
			
			try {
				
				System.out.println("구구단 ? ");
			   dan = scan.nextInt();
			   
			   if(dan < 2 || dan > 9) {
				   //에러!!
				   throw new InputMismatchException("2 ~ 9 사이를 입력하세요.");
			   }
			   
			   for(int i = 1; i < 10; i++) {
				   System.out.print(dan+"X"+i +"=" + (dan * i) +"\t");
			   }
			   //출력이 끝났으니 종료 
			   break;
				
			}catch(Exception e) {
				//폭탄제거 -> 버퍼를 비우자
				scan.nextLine();
				String str = (e.getMessage() == null ? "잘못입력했습니다" :  e.getMessage());
				System.out.println(str);
			}finally {
				//예외발생 유무와 상관없이 무조건 실행
				System.out.println();
				System.out.println("finally");
				
				// 스캐너 닫기 
				scan.close();
			}
		}
		
		
		

	}

}
