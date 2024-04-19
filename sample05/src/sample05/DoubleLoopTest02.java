package sample05;

public class DoubleLoopTest02 {

	public static void main(String[] args) {
			
		for(int a = 0; a < 5; a++) {
		
//			for(int b = 0; b < (a + 1); b++) {
//				
			for(int b = 4; b > a; b--) {
				System.out.print("공백");
			}
		
			System.out.println();
			
		}
	}
}
