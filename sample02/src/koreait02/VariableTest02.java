package koreait02;

public class VariableTest02 {

	public static void main(String[] args) {
		
		int num01 = 100;
		long loNum = 0;	
		//자동형변환~
		loNum  = num01;
	
		System.out.println(loNum);
		
		//문자 <---> 숫자
		char ch ='A';
		int chToInt = 0;
		// 아스키 코드표에 의해서 
		// 문자는 10진수 값 또는 10진수 값이 문자로 치환된디ㅏ.
		chToInt = ch;
		System.out.println(chToInt);
		
		long lv = 1;
		byte lb = 0;
		
		//강제 형변환 - 일반 데이터 타입 체계에서는 잘 사용하진 않는
		lb  = (byte)lv;
		System.out.println(lb);
		
		
		
		
		
	}

}
