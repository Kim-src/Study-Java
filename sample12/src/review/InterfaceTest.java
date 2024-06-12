package review;

public class InterfaceTest {
	
	public interface Human {
		// 정의된 메서드는 전부 추상 메서드입니다.
		// 리턴 타입, 메서드명, 파라미터를 기술하였습니다.
		// 간결함을 위해 abstract 키워드는 생략하였습니다.
		public void eat(String food);
		public void sleep(int sleepTime);
	}
	
	public interface Man {
		// 간결함을 위해 abstract 키워드는 생략하였습니다.
		public void serveMilitary(int servicePeriod);
	}
	
	public interface Woman {
		// 간결함을 위해 abstract 키워드는 생략하였습니다.
		public void bePregnant(int pregnancyPeriod);
	}
	
	public class KoreanMan implements Human, Man {
		
		@Override
		public void eat(String food) {
			System.out.println(food + "을(를) 먹습니다.");
		}
		
		@Override
		public void sleep(int sleepTime) {
			System.out.println("잠을 " + sleepTime + "시간 잡니다.");
		}
		
		@Override
		public void serveMilitary(int servicePeriod) {
			System.out.println("군 복무 기간은 " + servicePeriod + "달 입니다.");
		}
	}

}
