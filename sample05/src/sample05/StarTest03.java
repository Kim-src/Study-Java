package sample05;

public class StarTest03 {

	public static void main(String[] args) {

		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				
				if(j < i + 3 || j > i + 3) {
					System.out.print("a");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
