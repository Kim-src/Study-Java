package review;

public class AbstractionTest {
	
	/* 추상 클래스 */
	// 추상 클래스는 이를 상속받는 클래스에 구현을 요구합니다.
	// Vehicle 추상 클래스를 정의하였습니다.
	public abstract class Vehicle {
		/* 추상 메서드 */
		// 추상 메서드는 이를 포함하는 클래스를 상속받는 클래스에서의 구현을 요구합니다.
		// drive 추상 메서드를 정의하였습니다.
		// 메서드에 기능은 없는 상태입니다.
		public abstract void drive();
		
		// start 메서드를 정의하였습니다.
		// '시동'이라는 문구를 출력합니다.
		public void start() {
			System.out.println("시동");
		}
	}
	
	/* 추상 클래스 상속 */
	// Vehicle 클래스를 상속시켰습니다.
	public class Car extends Vehicle {
		// drive 메서드 오버라이딩하였습니다.
		// drive 메서드에 기능을 부여하였습니다.
		// '운전'이라는 문구를 출력합니다.
		@Override
		public void drive() {
			System.out.println("차량 운전");
		}
	}
	
	/* 인터페이스 */
	// Drivable 인터페이스를 정의하였습니다.
	public interface Drivable {
		// drive 메서드를 정의하였습니다.
		// drive 메서드에 구현 내용은 없습니다.
		// 객체 지향 프로그래밍의 다형성 원리를 따라 drive 메서드 중복 문제는 없습니다.
		public void drive();
	}
	
	/* 인터페이스 구현 */
	public class Bicycle implements Drivable {
		@Override
		public void drive() {
			System.out.println("자전거 운전");
		}
	}

}
