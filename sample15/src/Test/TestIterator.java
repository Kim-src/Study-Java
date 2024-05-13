package Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
	
	public static void main(String[] args) {
		
		List<Integer> number = new ArrayList<>();
		
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		number.add(6);
		number.add(7);
		number.add(8);
		number.add(9);
		number.add(10);
		
		Iterator<Integer> iterateNumber = number.iterator();
		
		while(iterateNumber.hasNext()) {
			int someValue = iterateNumber.next();
			System.out.println(someValue);
			System.out.println(number);
			
			if(someValue > 5) {
				iterateNumber.remove();
			}
		}
		
		System.out.println();
		
		System.out.println("Result of Iterator Test = " + number);
		
	}

}
