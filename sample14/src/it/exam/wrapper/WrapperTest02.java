package it.exam.wrapper;

public class WrapperTest02 {
	
	public static void main(String[] args) {
		
		/* jdk 1.9 이후로 사용 금지 */
		// 100의 값을 바로 할당받는 것이 아니라 100이 있는 위치값을 받는 것이 아니라 객체 안의 값을 받는 것임
		Integer a = new Integer(10000);
		
		// valueOf의 경우 숫자가 작은 등 특정 조건에서는 괜찮음
		// 예를들면 100까지는 b,c,d까지는 동일, 10000까지는 c,d까지 동일, 100000까지는 다 달라져버림
		// 따라서 valueOf로 작성해버리면 값을 새로 만들고 저장해버림(객체의 주소를 참조해버림)(그래서 주소값이 달라져버림)
		// 정수가 저장된 캐시 메모리를 벗어나면 new 메서드로 공간을 새롭게 만들어버림
		Integer b = Integer.valueOf(10000);
		
		Integer c = Integer.valueOf("10000");
		
		int d = Integer.parseInt("10000");
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		
		
		// 값을 비교할 때 객체 타입으로 비교하면 정확하지 않다?
		// 값을 비교할 때 일반 데이터 타입으로 비교하면 사과 개수(값)를 비교하는 것임
		// 형 변환을 하는 목적이 값을 비교하는 것이라면 valueOf 보다 parseInt를 사용해야 주소비교? 정확히 비교 가능
		System.out.println("a vs b = " + (a == b));
		System.out.println("b vs c = " + (b == c));
		System.out.println("c vs d = " + (c == d));
		System.out.println("d vs a = " + (d == d));
		
		System.out.println();
		
		System.out.println("a vs b = " + (a.intValue() == b.intValue()));
		System.out.println("b vs c = " + (b.intValue() == c.intValue()));
		System.out.println("c vs d = " + (c.intValue() == d));
		System.out.println("d vs a = " + (b.intValue() == d));
		
	}
}
