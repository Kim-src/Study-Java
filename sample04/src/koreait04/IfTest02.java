package koreait04;

public class IfTest02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rand = (int)(Math.random() * 60 ) + 1;
		
		if (rand >= 35) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
	}

}
