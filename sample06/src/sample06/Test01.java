package sample06;

public class Test01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 10;
		
		//변수의 주소값비교
		System.out.println("a 주소 : " +  System.identityHashCode(a));
		System.out.println("b 주소 : " +  System.identityHashCode(b));
		System.out.println("c 주소 : " +  System.identityHashCode(c));
		
		System.out.println();
		
		String str = "Hello";
		System.out.println("Hello 주소 = " + System.identityHashCode(str));

		str = "World";
		System.out.println("World 주소 = " + System.identityHashCode(str));
	}
	
}
