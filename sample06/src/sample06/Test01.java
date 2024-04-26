package sample06;

public class Test01 {

	public static void main(String[] args) {

	    // "Hello" 문자열 데이터의 주소 출력
	    String str1 = "Hello";
	    System.out.println("Hello 주소 = " + System.identityHashCode(str1));

	    // "World" 문자열 데이터의 주소 출력
	    str1 = "World";
	    System.out.println("World 주소 = " + System.identityHashCode(str1));
	    
	    // str2 변수가 참조하는 데이터의 주소 출력
	    String str2 = "World";
	    System.out.println("str2 변수가 참조하는 데이터 = " + System.identityHashCode(str2));
	    
	    // str1 및 str2 변수가 저장된 메모리의 주소 출력
	    System.out.println("str1 변수가 저장된 메모리 주소 = " + System.identityHashCode(str1));
	    System.out.println("str2 변수가 저장된 메모리 주소 = " + System.identityHashCode(str2));
	}
	
}
