package Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CarInfoUpdate {

	public static void main(String[] args) {
		
		// Array를 이용하여 데이터를 일괄적으로 관리하였습니다.
		CarDTO[] carList = new CarDTO[1];
		// 입력을 통해 Car 데이터가 저장될 수 있도록 설정하였습니다.
		Scanner scan = new Scanner(System.in);
		// 예외 처리를 위해 carPrice 변수를 0으로 초기화하였습니다.
		int carPrice = 0;
		
		// 순차적인 데이터 저장을 위해 반복문을 설정하였습니다.
		for(int i = 0; i < carList.length; i++) {
			// 값은 Scanner 입력을 통해 할당시켰습니다.
			// 값이 없는 경우 공백을 입력받을 수 있도록 trim 메서드를 사용하였습니다.
			// 참고로 nextInt에는 trim 메서드를 이용할 수 없습니다.
			System.out.println((i+1) + "번째 자동차 정보를 입력하세요.");			
			System.out.print("자동차 모델명(없으면 공백 입력) = ");
			// 공백을 포함한 라인 전체를 입력으로 받기 위해 nextLine 메서드를 사용하였습니다.
			String carName = scan.nextLine().trim();
			System.out.print("자동차 제조사(없으면 공백 입력) = ");
			// 공백을 포함한 라인 전체를 입력으로 받기 위해 nextLine 메서드를 사용하였습니다.
			String carCompany = scan.nextLine().trim();
			System.out.print("자동차 판매가(없으면 0 입력) = ");
			// nextInt 메서드에 정수가 아닌 다른 값이 입력되었을 경우를 위해 try-catch block을 설정하였습니다.
			// nextInt 메서드를 실행시킨 뒤 예상되는 에러가 발생되면 carPrice 변수에 0을 할당시켰습니다.
			try {
				carPrice = scan.nextInt();
				// 입력 버퍼를 비우기 위해 개행 문자('\n' 등)를 제거하였습니다.
				scan.nextLine();
			} catch(InputMismatchException e) {
				carPrice = 0;
				// 입력 버퍼를 비우기 위해 개행 문자('\n' 등)를 제거하였습니다.
				scan.nextLine();
			}
			
			// 조건문에 따라 값이 제대로 입력된 데이터만 필드(변수)에 할당되게 설정하였습니다.
			// isEmpty 메서드를 이용하여 필드가 비어있는지 확인하였습니다.
			// 생성자를 이용하여 carList 배열에 저장될 데이터를 초기화하였습니다.
			// CarDTO의 오버로딩 정의 시와 다르게 경우의 수에 맞게 조건문을 작성하였습니다.
			// 데이터를 입력받지 못하는 경우 null 값을 할당시켰습니다.
			// 참고로 int의 경우 null 값을 받지 못합니다.
			if(!carName.isEmpty() && !carCompany.isEmpty() && carPrice != 0) {
				carList[i] = new CarDTO(carName, carCompany, carPrice);
			} else if(!carName.isEmpty() && !carCompany.isEmpty()) {
				carList[i] = new CarDTO(carName, carCompany);
			} else if(!carName.isEmpty() && carPrice != 0) {
				carList[i] = new CarDTO(carName, null, carPrice);
			} else if(!carCompany.isEmpty() && carPrice != 0) {
				carList[i] = new CarDTO(null, carCompany, carPrice);
			} else if(!carName.isEmpty()) {
				carList[i] = new CarDTO(carName, null);
			} else if(!carCompany.isEmpty()) {
				carList[i] = new CarDTO(null, carCompany);
			} else if(carPrice != 0) {
				carList[i] = new CarDTO(null, null, carPrice);
			} else if(carName.isEmpty() && carCompany.isEmpty() && carPrice == 0) {
				carList[i] = new CarDTO(null, null, 0);
			}
		}
		
		// Scanner 클래스는 리소스가 해제되기 전 또는 프로그램 종료 전까지 계속 실행됩니다.
		// 따라서 close 메서드를 이용하여 리소스를 해제시키고 리소스 누수를 방지하였습니다.
		scan.close();
		System.out.println();
		
		// 보유중인 자동차 정보를 향상된 for 반복문으로 출력하였습니다.
		// 향상된 for 반복문은 carList의 전체 요소에 순차적으로 접근합니다.
		// carInfo()의 경우 CarDTO에서 자동차 정보를 출력하도록 정의한 상태입니다.
		System.out.println("* 보유중인 자동차 정보");
		for(CarDTO car : carList) {
			car.carInfo();
		}
				
	}	
	
}
