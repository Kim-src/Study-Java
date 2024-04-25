package lecture06;

public class Quiz01 {
	public static void main(String[] args) {
	
		for(int i = 0; i < 7; i ++) {
			for(int k = (7-i) ; k  > 0  ;k--) {
				System.out.print(" ");
			}
			//i값에 따라 하번씩 반복이 증가하도록 함 
			for(int j = 0;  j < (2*i+1); j++) {
				// j가 반복할 때 별찍기
				System.out.print("*");
			}
			//j포문끝나고 줄바꿈
			System.out.println();
		}
		
		
	
		for(int i = 0; i < 7; i ++) {
			for(int j= 0 ; j < (i+7); j++) {
				if(j < 6 -i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
