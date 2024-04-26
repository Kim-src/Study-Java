package sample06;

public class Test02 {
	
	public static void main(String[] args) {
		
		// 3개의 데이터를 갖는 배열을 생성하였습니다.
		int[] arr = new int[3];
		
		// arr 배열의 주소를 출력하였습니다.
		System.out.println("컴퓨터 메모리에 저장된 배열의 주소 = " + System.identityHashCode(arr));
		
		// arr 배열에 3개의 정수를 할당하였습니다.
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		// 데이터를 참조하는 arr 배열의 주소를 출력하였습니다.
		System.out.println("컴퓨터 메모리에 저장된 배열의 주소 = " + System.identityHashCode(arr));
		// arr 배열의 각 인덱스가 참조하는 데이터의 주소를 출력하였습니다.
		System.out.println("arr[0] 주소 = " + System.identityHashCode(arr[0]));
		System.out.println("arr[1] 주소 = " + System.identityHashCode(arr[1]));
		System.out.println("arr[2] 주소 = " + System.identityHashCode(arr[2]));
		// arr 배열의 각 인덱스가 참조하는 각 데이터의 주소를 출력하였습니다.
		System.out.println("정수 10의 주소 = " + System.identityHashCode(10));
		System.out.println("정수 20의 주소 = " + System.identityHashCode(20));
		System.out.println("정수 30의 주소 = " + System.identityHashCode(30));

	}

}
