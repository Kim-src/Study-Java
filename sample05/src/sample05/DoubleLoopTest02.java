package sample05;

public class DoubleLoopTest02 {

	public static void main(String[] args) {

		for(int a = 4; a > 0; a--) {
			
			System.out.print(" ");
			
			for(int i = 0; i < 5; i++) {
			
				for(int j = 0; j < (i + 1); j++) {
					
					System.out.print("*");
					
				}
			
				System.out.println();
				
			}
		}
	}
}
