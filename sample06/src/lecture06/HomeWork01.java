package lecture06;

public class HomeWork01 {
	public static void main(String[] args) {
		
		/*
		 *       *
		 *      **
		 *     ***
		 *    ****   
		 *   ***** 
		 */
		
		//5번 반복하는 for문
		for(int i = 0; i < 5; i ++) {
			for(int k = (5-i) ; k  > 0  ;k--) {
				System.out.print(" ");
			}
			//i값에 따라 하번씩 반복이 증가하도록 함 
			for(int j = 0;  j < (i+1); j++) {
				// j가 반복할 때 별찍기
				System.out.print("*");
			}
			//j포문끝나고 줄바꿈
			System.out.println();
		}
		
		
		for(int i = 0; i < 5; i ++) {
			for(int j = 0; j < 5; j ++) {
				
				if(j < 4-i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}

	}

}
