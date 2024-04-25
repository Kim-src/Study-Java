package sample05;

public class StarTest03 {

	public static void main(String[] args) {

		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < i + 4; j++) {
				
				if(j < 3 - i) {
					System.out.print(" ");
				} else if(j < i - 3) {
					System.out.print(" ");
				} else if(i + j > 9) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
	}

}
