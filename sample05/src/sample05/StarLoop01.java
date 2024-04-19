package sample05;

// 별짓기 우측정렬 과제 수행용 클래스를 생성하였습니다.
public class StarLoop01 {

	// 메인 메서드를 선언하였습니다.
	public static void main(String[] args) {

		// 변수 i에 공백을 저장하였습니다.
		String i = " ";
		// 변수 j에 * 기호를 저장하였습니다.
		String j = "*";
		
		// 정수 a가 0부터 4까지 오름차순으로 반복되도록 설정하였습니다.
		for (int a = 0; a < 5; a ++) {
			
			// 정수 b가 4부터 1까지 내림차순으로 반복되도록 설정하였습니다.
			for (int b = 4; b > a; b--) {
				// 정수 b가 포함된 for 반복문 수행 시 변수 i를 출력하도록 설정하였습니다.
				System.out.print(i);
			}
			
			// 정수 c가 0부터 4까지 오름차순으로 반복되도록 설정하였습니다.
			for (int c = 0; c < a + 1; c++) {
				// 정수 c가 포함된 for 반복문 수행 시 변수 j를 출력하도록 설정하였습니다.
				System.out.print(j);
			}
			
			// 내부 for 반복문 수행이 종료되면 출력문이 다음 행부터 출력되도록 설정하였습니다.
			System.out.println();
		}
		
	}

}
