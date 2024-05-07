package it.exam.generic;

public class GenArrayMain {

	public static void main(String[] args) {
		
		/*
		 * 제네릭은 클래스를 선언할 때 어떤 데이터를 다룰 것인지 지정하게 됩니다.
		 * 제네릭은 <> 기호를 사용하여 작성합니다.
		 * 제네릭에서 표현할 데이터 타입은 일반 데이터 타입이 아닌 클래스 형태의 wrapper 클래스를 이용하여 표기합니다.
		 */
		
		// 제네릭을 사용하는 이유 = 하나의 객체로 데이터를 외부에서 지정받고 하나의 객체로 다양한 데이터를 담을 수 있음
		GenArray<Integer> list = new GenArray<>();
		GenArray<Double> doubleList = new GenArray<>();
		GenArray<String> strList = new GenArray<>();
		
		// 위와 똑같음
//		GenArray<Integer> list = new GenArray<Integer>();
//		GenArray<Double> doubleList = new GenArray<Double>();
//		GenArray<String> strList = new GenArray<String>();
		
		// 제네릭이 뭐예요?
		// 제네릭은 하나의 저장 클래스를 선언하면서 다양한 데이터를 담는 그릇으로 만들 수 있습니다.
		// 그래서 데이터 클래스의 사용 효율성을 높일 수 있습니다.
		list.add(1);
		doubleList.add(3.33);
		strList.add("str");
		
		
	}
	
}
