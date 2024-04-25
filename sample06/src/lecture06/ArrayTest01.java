package lecture06;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		int[] arr01 = new int[4];
		//초기 선어시에만 가능
		int[] arr02 = {1,2,3,4,5};
		
		int a = 10;
		int b = 10;
		int c = 10;
		
		//변수의 주소값비교
		System.out.println("a 주소 : " +  System.identityHashCode(a));
		System.out.println("b 주소 : " +  System.identityHashCode(b));
		System.out.println("c 주소 : " +  System.identityHashCode(c));
		System.out.println("arr01 주소 : " +  System.identityHashCode(arr01));
		
		a = a + 5;
		
		System.out.println("=======================================");
		
		//배열의 값 삽입
		arr01[0] = 10;
		
		System.out.println("a 주소 : " +  System.identityHashCode(a));
		System.out.println("a 주소 : " +  System.identityHashCode(15));
		System.out.println("b 주소 : " +  System.identityHashCode(b));
		System.out.println("c 주소 : " +  System.identityHashCode(c));
		System.out.println("arr01 주소 : " +  System.identityHashCode(arr01));
		
		System.out.println("arr01[0] 값  : " +  arr01[0]);
		

	}

}
