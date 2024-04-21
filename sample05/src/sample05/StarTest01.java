package sample05;

public class StarTest01 {

	public static void main(String[] args) {

		// 정수 i가 0부터 4까지 오름차순으로 반복되도록 설정하였습니다.
	    for(int i = 0; i < 5; i++) {
	    	// 정수 j가 4부터 1까지 내림차순으로 반복되도록 설정하였습니다.
	    	for(int j = 4; j > i; j--) {
	    		// 함수식 반복이 1회 종료될 때마다 정수값만큼 공백을 출력하도록 설정하였습니다.
	    		System.out.print(" ");
	    	}
	    	// 정수 k가 0부터 4까지 오름차순으로 반복되도록 설정하였습니다.
	    	for(int k = 0; k < i + 1; k++) {
	    		// 함수식 반복이 1회 종료될 때마다 반복된 횟수만큼 별 기호를 출력하도록 설정하였습니다.
	    		System.out.print("*");
	    	}
	    	// 내부 반복문이 종료되면 다음 행부터 출력문이 출력되도록 설정하였습니다.
	    	System.out.println();
	    }

	}

}
