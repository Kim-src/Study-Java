package lecture;

public class CarMain {
	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.setMyName("붕붕이");
		car.setPrice("300만원");
		
		System.out.println(Car.getCompany());
		System.out.println("이름 :" + car.getMyName() + ", 가격 : " + car.getPrice());
	}
}
