package sample04;

// 스캐너 클래스를 사용하였습니다.
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Scanner 클래스 및 nextInt() 함수를 이용하여 숫자 입력하는 기능을 추가하였습니다. 
		System.out.println("이곳에 숫자를 입력하세요.");
		int num = scan.nextInt();
		System.out.println("입력된 숫자 = " + num);

		// Scanner 클래스 및 next() 함수를 이용하여 문자 입력하는 기능을 추가하였습니다.
		System.out.println("이곳에 문자를 입력하세요.");
		String str = scan.next();
		System.out.println("입력된 문자 = " + str);
		
		// 버퍼 저장소에 이미 입력되어 있는 'str'
		// nextLine() 함수는 찌꺼기
		//System.out.println("이곳에 문자를 입력하세요.");
		//String str2 = scan.nextLine();
		//System.out.println("입력된 문자 = " + str2);
		
		// 버퍼 저장소에 잔여 데이터를 지우기 위한 함수를 입력하였습니다.
		scan.nextLine();
		
		System.out.println("이곳에 문자를 입력하세요.");
		String str3 = scan.nextLine();
		System.out.println("입력된 문자 = " + str3);
	
	}

}
