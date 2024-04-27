package lecture09;

public class CarMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//자동차 객체를 사용하기 위해 선언!
		Car car = new Car();
		
		//객체가 가진 변수에 접근할때는 .(닷) 을 사용한다.
		car.name ="붕붕이";
		car.company ="코리아IT";
		car.price = 30000000;
		
		System.out.println("이름 : " + car.name + ", 제조사 : " + 
		                car.company  + ", 가격 : " + car.price +" 원") ;
	}

}
