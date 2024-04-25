package koreait02;

public class Test {

	public static void main(String[] args) {
	    
	    // 숫자형 변수를 선언하였습니다.
	    // byte 타입으로 정의할 수 있는 변수의 최댓값은 127입니다.
	    byte byteNum = 127;
	    short shortNum = 777;
	    int intNum = 777;
	    long longNum = 777;

	    // 실수형 변수를 선언하였습니다.
	    // Java의 기본적인 실수는 double이기 때문에 float일 경우 실수 끝에 'f' 글자를 입력해야 인식됩니다.
	    float floatNum = 7.7f;
	    // double은 Java의 기본적인 실수 유형이기 때문에 실수 끝에 'd' 글자를 입력하지 않아도 인식됩니다.
	    double doubleNum = 7.777d;
	    
	    // 문자형 변수를 선언하였습니다.
	    char charLetter = 'c';
	    String stringLetter = "string";
	    
	    // 논리형 변수를 선언하였습니다.
	    boolean bool = true;
	    
	    // 각 변수에 저장된 데이터를 출력하였습니다.
	    System.out.println("Byte Type = " + byteNum);
	    System.out.println("Short Type = " + shortNum);
	    System.out.println("Int Type = " + intNum);
	    System.out.println("Long Type = " + longNum);
	    System.out.println("Float Type = " + floatNum);
	    System.out.println("Double Type = " + doubleNum);
	    System.out.println("Char Type = " + charLetter);
	    System.out.println("String Type = " + stringLetter);
	    System.out.println("Boolean Type = " + bool);
	}
	
}
