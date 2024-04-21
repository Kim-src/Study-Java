package sample05;

public class SumTest01 {

	public static void main(String[] args) {

		// 함수식을 5회 반복하도록 설정하였습니다.
	    for(int i = 0; i < 5; i++) {
	    	// i보다 1 큰 횟수만큼 반복하고 종료되도록 설정하였습니다. 
	    	for(int j = 4; j > i; j--) {
	    		// 함수 처리가 종료되면 반복한 횟수만큼 공백을 출력하도록 설정하였습니다.
	    		System.out.print(" ");
	    	}
	    	// k와 동일한 숫자만큼 반복하고 종료되도록 설정하였습니다.
	    	for(int k = 0; k < i + 1; k++) {
	    		// 함수 처리가 종료되면 반복한 횟수만큼 별 기호를 출력하도록 설정하였습니다.
	    		System.out.print("*");
	    	}
	    	// 내부 반복문이 종료되면 다음 행에 출력문이 출력되도록 설정하였습니다.
	    	System.out.println();
	    }

	}

}
