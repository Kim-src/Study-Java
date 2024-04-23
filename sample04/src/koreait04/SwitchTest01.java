package koreait04;

public class SwitchTest01 {

	public static void main(String[] args) {
	
		int rand = (int)(Math.random() *  51 ) + 50;
		
		
		switch(rand / 10) {
		case 10 :
		case 9 :
			System.out.println("점수:" + rand +", 등급 : A");
			break;
		case 8 :
			System.out.println("점수:" + rand +", 등급 : B");
			break;
		case 7 :
			System.out.println("점수:" + rand +", 등급 : C");
			break;
		case 6 :
			System.out.println("점수:" + rand +", 등급 : D");
			break;
		default :
			System.out.println("점수:" + rand +", 등급 : F");
		}
		
	}

}
