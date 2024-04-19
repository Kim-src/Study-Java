package sample05;

public class DoubleLoopTest01 {

	public static void main(String[] args) {

		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.print(j + "X" + i + "=" + (i * j) + "\t");
			}
			
			// 구구단 한 행이 종료되면 줄바꿈
			System.out.println();
		}
		
		
	}

}
