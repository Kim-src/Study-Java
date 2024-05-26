package Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CarInfoScanner {
	
	public static void main(String[] args) {
		
		// Array를 이용하여 데이터를 일괄적으로 관리하였습니다.
		Car[] carList = new Car[5];
		// 입력을 통해 Car 데이터가 저장될 수 있도록 설정하였습니다.
		Scanner scan = new Scanner(System.in);
		
		// 순차적인 데이터 저장을 위해 반복문을 설정하였습니다.
		for(int i = 0; i < carList.length; i++) {
			// public 접근제한자의 Car 클래스를 호출하였습니다.
			// 매 반복문마다 새로운 인스턴스를 생성하였습니다.
			Car car = new Car();
			// 값은 Scanner 입력을 통해 할당시켰습니다.
			System.out.print((i+1) + "번째 자동차 모델명을 입력하세요. = ");
			car.setCarName(scan.next());
			System.out.print((i+1) + "번째 자동차제조사를 입력하세요. = ");
			car.setCarCompany(scan.next());
			System.out.print((i+1) + "번째 자동차 판매가를 입력하세요. = ");
			car.setCarPrice(scan.nextInt());
			
			// 할당된 값은 carList에 일괄적으로 할당시켰습니다.
			// Array 대신 List를 이용하면 데이터 타입이 통일되어야 되기 때문에 이 부분에서 문제가 되었습니다.
			// List를 더 활용해보는 경험이 필요합니다.
			carList[i] = car;
			
		}
		
		scan.close();
		System.out.println();
		
		// 보유중인 자동차 정보를 향상된 for 반복문으로 출력하였습니다.
		// 향상된 for 반복문 사용 시 개별 변수를 다시 선언해야 됩니다.
		// 향상된 for 반복문은 carList의 전체 요소에 순차적으로 접근합니다.
		// carInfo()의 경우 Car 객체에 자동차 정보를 출력하도록 정의한 상태입니다.
		System.out.println("* 보유중인 자동차 정보");
		for(Car car : carList) {
			car.carInfo();
		}
				
	}

}
