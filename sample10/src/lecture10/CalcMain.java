package lecture10;

public class CalcMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체를 사용하기 위해서 선언
		Calculate cal = new Calculate();
		
		int sum = cal.add(10, 22);
		//출력 
		cal.printResult(sum);
	}

}
