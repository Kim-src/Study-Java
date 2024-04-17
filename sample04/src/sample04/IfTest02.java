package sample04;

public class IfTest02 {
	
	public static void main(String[] args) {
		
		int rand = (int)(Math.random() * 60) + 1;
		
		if(rand >= 30) {
			System.out.println("합격");
		} else if(rand >= 20) {
			System.out.println("불합격");
		} else {
			System.out.println("ㅇㅇ");
		}

	}

}
