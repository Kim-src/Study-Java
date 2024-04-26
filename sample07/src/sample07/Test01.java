package sample07;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {

	    // 정수 데이터를 10개 참조할 수 있는 배열을 생성하였습니다.
	    int[] arr = new int[10];

	    // arr 배열의 각 인덱스 당 1 ~ 100까지의 정수 중 하나를 참조하게 하였습니다.
	    for(int i = 0; i < arr.length; i++) {
	        int rand = (int)(Math.random() * 100) + 1;
	        arr[i] = rand;
	    }

	    // arr 배열이 참조하고 있는 데이터를 출력하였습니다.
	    // Arrays는 java의 util에서 정의된 class입니다.
	    // Arrays.toString은 한 배열에 할당된 전체 데이터를 출력하기 위해 사용되었습니다.
	    System.out.println("arr 배열 배열 = " + Arrays.toString(arr));
	    // arr 배열의 주소를 출력하였습니다.
	    System.out.println("arr 배열 주소 = " + arr);
	    
	    // 최댓값 및 최솟값 산출을 위한 max 및 min 변수를 생성하였습니다.
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    
	    // for 반복문을 이용하여 max 및 min 변수가 arr 배열이 참조하는 데이터를 치환하게 설정하였습니다.
	    // for 반복문이 i 정수가 arr 배열의 크기(10)만큼 반복되도록 설정하였습니다.
	    for(int i = 0; i < arr.length; i++) {
	    	// max 변수의 초기값은 Java에서 정의한 Integer class의 최솟값이며 -21억 정도입니다.
	    	// (int)0x80000000
	    	// max의 초기값이 arr[0] 인덱스가 참조하는 데이터보다 작을 경우 arr[0] 인덱스가 참조하는 데이터를 max 변수가 참조하도록 설정하였습니다.
	    	if (max < arr[i]) {
	    		// arr 배열 내 데이터의 최댓값은 정수 i가 0부터 9까지 10회 반복하는 과정에서 arr 배열에 할당된 데이터 중 최종적으로 max 변수에 할당된 데이터입니다.
	    		max = arr[i];
	    	}
	    	// min 변수의 초기값은 Java에서 정의한 Integer class의 최댓값이며 21억 정도입니다.
	    	// (int)0x7fffffff
	    	// min의 초기값이 arr[0] 인덱스가 참조하는 데이터보다 클 경우 arr[0] 인덱스가 참조하는 데이터를 min 변수가 참조하도록 설정하였습니다.
	    	if (min > arr[i]) {
	    		// arr 배열 내 데이터의 최솟값은 정수 i가 0부터 9까지 10회 반복하는 과정에서 arr 배열에 할당된 데이터 중 최종적으로 min 변수에 할당된 데이터입니다.
	    		min = arr[i];
	    	}
	    }
	    
	    System.out.println("arr 배열의 최댓값 = " + max + ", arr 배열의 최솟값 = " + min);

	}
	
}
