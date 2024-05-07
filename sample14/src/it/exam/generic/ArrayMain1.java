package it.exam.generic;

public class ArrayMain1 {
	
	public static void main(String[] args) {
		
		Array arr = new Array();
		
		arr.add(1);
		arr.add("안녕");
		arr.add(3.14);
		
		System.out.println(arr.size());
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		// 이중에서 하나를 찾아야 된다는 단점
		
	}

}
