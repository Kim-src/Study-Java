package it.exam.wrapper;

public class WrapperTest01 {
	
	public static void main(String[] args) {
		
		// 정수 형태의 wrapper 클래스
		// 취소선 = 디스퍼레이티드? 지금 당장은 없애지 않지만 Java에서 안내해주는 내용
		Integer num01 = new Integer(100);
		// 생성자를 사용한 객체 선언 대용
		Integer num = Integer.valueOf(10);
		// wrapper 클래스의 autoboxing 기능을 이용하였습니다.
		Integer num02 = 100;
		// 정수형 타입의 문자열을 정수로 형변환 하였습니다.
		Integer num03 = Integer.valueOf("100");
		Integer num033 = Integer.valueOf("FF", 16);
		// 16진수를 10진수로 변환할 때 사용
		// valueOf는 int를 받음(뭔소리?) 
		Integer hexToDecimal = Integer.valueOf("17", 8);
		// 10진수를 2진수로 변환하는 모습 = 15가 1111로
		String DecimalToBinary = Integer.toBinaryString(15);
		
		
		System.out.println(num03);
		System.out.println(num033);
		System.out.println(hexToDecimal);
		System.out.println(DecimalToBinary);
		
		
		Integer num3 = Integer.valueOf("1213");
		int num33 = Integer.parseInt("1213");
		
		// 10진수 형태의 문자가 있을 경우 해당 문자를 정수 형태로 변경한다고 했을 때 valueOf가 좋을지, parseInt가 좋을지
		
		System.out.println(num3);
		System.out.println(num33);
		
		
	}

}
