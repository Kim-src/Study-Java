package review;

/* 엔터티 클래스 정의 */
public class BasicTerm {

	static String gender; // 클래스 변수 정의
	
	private String name; // 멤버 변수 정의
	private int age; // 멤버 변수 정의
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printInfo() { // 멤버 메서드 정의
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
	}
		
	
	/* 실행 클래스 정의 */
	class ExeTest {
		
		public static void main(String[] args) { // 클래스 메서드 정의
			
			BasicTerm firstVariable = new BasicTerm(); // 로컬 변수 정의
			// 생성자 메서드 = BasicTerm() 메서드
			// 객체 초기화 = new 키워드
			
			firstVariable.setName("이름"); // 로컬 변수를 통해 인스턴스에 값 할당
			firstVariable.setAge(30); // 로컬 변수를 통해 인스턴스에 값 할당
			firstVariable.gender = "남성"; // 클래스 변수에 값 할당
			
			firstVariable.printInfo(); // 멤버 메서드 사용
			
			/* 출력 내용 */
//			이름
//			30
//			남성
			
			BasicTerm secondVariable = new BasicTerm(); // BasicTerm 객체 인스턴스 초기화
			
			secondVariable.printInfo();
			
			/* 출력 내용 */
//			null
//			0
//			남성 // 클래스 변수로 선언됐기 때문에 BasicTerm 객체 인스턴스 초기화와 무관
			
		}
		
	}

}
