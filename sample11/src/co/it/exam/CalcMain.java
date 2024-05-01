package co.it.exam;

public class CalcMain {
	
	public static void main(String[] args) {
	
		Calc calc = new Calc();
		
		System.out.println("10과 11의 합 = " + calc.add(10,11));
		System.out.println("10과 11과 12의 합 = " + calc.add(10,11,12));

	}
	
}
