package it.exam.wrapper;

public class WrapperTest03 {
	
	public static void main(String[] args) {
		
		// double은 int와 달리 진수 변환 타입 없음
		Double d01 = Double.valueOf("33.33");
		Double d02 = 33.33;
		
		Double d03 = Double.valueOf(33.33);
		
		// pars~ + 데이터 타입 외 리턴은 일반 데이터 형식입니다.
		double d04 = Double.parseDouble("33.33");
		
		System.out.println(d01 == d02);
		System.out.println(d02 == d03);
		System.out.println(d03 == d04);
		
		System.out.println("----------");
		
		System.out.println(d01.doubleValue() == d02.doubleValue());
		System.out.println(d02.doubleValue() == d03.doubleValue());
		System.out.println(d03 == d04);
		
	}

}
