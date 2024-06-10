package Test;

public class Calculator {
	
	public static void main(String[] args) {
		
		CalculatorOperation operator = new CalculatorOperation();
		CalculatorOperation add2 = new CalculatorOperation();
		CalculatorOperation add3 = new CalculatorOperation();
		CalculatorOperation add4 = new CalculatorOperation();
		CalculatorOperation add5 = new CalculatorOperation();
		
		// add 메서드에는 정수 2개 또는 5개만 할당이 가능합니다.
		System.out.println(operator.add(10, 20));
		System.out.println(operator.add(10, 20, 30));
		System.out.println(operator.add(10, 20, 30, 40));
		System.out.println(operator.add(10, 20, 30, 40, 50));
		System.out.println(add2.add(10, 20));
		System.out.println(add3.add(10, 20, 30));
		System.out.println(add4.add(10, 20, 30, 40));
		System.out.println(add5.add(10, 20, 30, 40, 50));
		// ternary 메서드는 값을 비교하는 기능이 있습니다.
		System.out.println(operator.ternary(10, 20));
		
	}

}
