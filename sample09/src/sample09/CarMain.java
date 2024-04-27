package sample09;

public class CarMain {

	public static void main(String[] args) {

		// 자동차 객체를 사용하기 위해 선언
		Car car = new Car();
		
		// 객체가 가진 변수에 접근할 때는 .(dot)을 사용합니다.
		car.name = "붕붕이";
		car.company = "코리아IT";
		car.price = 30000000;
		
		System.out.println("이름 = " + car.name + ", 제조사 = " + car.company + ", 가격 = " + car.price);
		
	}

}
