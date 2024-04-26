package sample07;

public class Test03 {

	public static void main(String[] args) {
		
		// int 1~5를 참조하는 arr 배열을 생성하였습니다.
		int[] arr = {1,2,3,4,5};
		
		// 반복한다는 뜻의 iterate의 명사형을 변수명으로 사용하였습니다.
		// 배열에 시작부터 끝까지 순회하는 향상된 for 반복문을 생성하였습니다.
		// arr 배열의 요소를 iterator 변수(반복문의 변수)에 할당시켰습니다.
		for(int iterator : arr) {
			// 정의된 iterator 변수를 이용하여 배열 요소를 출력하였습니다.
			System.out.print(iterator + "\t");
		}
		
	}
	
}
