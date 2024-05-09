package kr.exam.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest01 {
	
	public static void main(String[] args) {
		
		// 리스트 선언
		// Integer 제네릭 사용
		// ~ 자료구조
		// 부모타입으로 자식을 선언하였습니다. List<> 에서 new ArrayList<>
		// 부모타입으로 자식타입을 선언해야 나중에 코드를 변경할 때 하위코드에 영향을 주지 않음(예를들면 ArrayList에서 LinkedList)
		// 예를들어 데이터를 삽입하다보니 '중간 삽입' 또는 '중간 삭제'가 빈번할 경우 자식 타입의 List만 변경해도 괜찮음(통상적으로 부모에서 자식으로 객체 선언)
		List<Integer> list01 = new ArrayList<>();
		
		// 데이터 삽입
		list01.add(1);
		list01.add(2);
		list01.add(3);
		list01.add(4);
		list01.add(5);
		list01.add(6);
		
		// ArrayList는 toString을 오버라이드 하고 있어서 toString 형태로 출력됩니다.
		System.out.println(list01);
		
		// 중간 삽입 add(index, data);
		// [3]에 11 삽입
		list01.add(3, 11);
		
		System.out.println(list01);
		
		// 치환 set(index, data);
		list01.set(4, 12);
		
		System.out.println(list01);
		
		// 삭제 remove(index)
		list01.remove(3);
		
		System.out.println(list01);
		
		// 삭제
		// 해당 객체의 배열 내에서 값을 삭제하는 방법
		Integer a = Integer.valueOf(2);
		System.out.println(list01);
		list01.remove(a);
		System.out.println(list01);
		
		// 전체 데이터 비우기
		// 리스트만 남겨둔 채 내부 데이터를 전부 정리해버림
		// clear를 사용할 경우는 객체를 또 만들기는 싫고 내용만 넣고 싶을 경우임(스마트폰 초기화 방법 종류가 다양하다는 것 생각하면 됨)
		// list01.clear();
		
		// 중복 처리 쉬움?
		// 해당하는 리스트가 특정 데이터를 포함중인지에 대해 true 또는 false로 리턴해줌
		System.out.println(list01.contains(3));
		System.out.println(list01.contains(12));
		System.out.println(list01.contains(31));
		
		// List to Array
		Integer[] arr = list01.toArray(new Integer[list01.size()]);
		
		Integer[] arr02 = {1,2,3,4};
		int[] arr03 = {1,2,3,4};
		
		// Array to List
		// 열거형도 리스트로 만들 수 있음
		List<Integer> list02 = Arrays.asList(arr02);
		List<Integer> list03 = new ArrayList<>(Arrays.asList(1,2,3));
		
		// Integer를 ~로 변경할 수 있지만
		// loop 돌려서 한땀한땀 넣는 것이 더 속 편하다 결론
		
		// 리스트 출력 1 - 기본
		for(int i = 0; i < list01.size(); i++) {
			System.out.println(list01.get(i));
		}
		
		System.out.println("----------");
		
		// 리스트 출력 2 - 향상된 for 문을 이용한 방법
		for(int value : list02) {
			System.out.println(value);
		}
		
		System.out.println("----------");
		
		// 리스트 출력 3 - iterator(커서)
		// iterator를 이용해서 출력(List, Set만 가능)
		// integer를 순회하는 iterator를 사용
		// 향상된 for문이 iterator를 이용해서 만든 것임
		Iterator<Integer> iter = list01.iterator();
				
		while(iter.hasNext()) {
			int val = iter.next();
			System.out.println(val);
		}
		
	}

}
