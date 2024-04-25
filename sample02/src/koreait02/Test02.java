package koreait02;

public class Test02 {

	public static void main(String[] args) {
		
		// 자동 형변환 예시(숫자형 → 숫자형)
		int intNum1 = 10; // 4 byte
		long longNum1 = intNum1; // 8 byte
		System.out.println("Implicit Casting = " + longNum1);
		
		// 강제 형변환 예시(숫자형 → 숫자형)
		long longNum2 = 10; // 8 byte
		int intNum2 = (int)longNum2; // 4 byte
		System.out.println("Explicit Casting = " + intNum2);
		
		// 자동 형변환 예시(문자형 → 문자형)
		// 아스키 코드에 따라 A라는 문자가 10진수로 치환되고 65가 출력됩니다.
		char letter1 = 'A'; // 2 byte
		int intNum3 = letter1; // 4 byte
		System.out.println("Implicit Casting = " + intNum3);
		
		// 강제 형변환 예시(숫자형 → 문자형)
		int intNum4 = 65; // 4 byte
		char letter2 = (char)intNum4; // 2 byte
		System.out.println("Explicit Casting = " + letter2);
	}
	
}
