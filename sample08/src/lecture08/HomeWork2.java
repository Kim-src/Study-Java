package lecture08;

public class HomeWork2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int line = 9;
		int half = line / 2;
		int space = 0; // 공백 시작점
		int step = 0 ; // 한라인에서 이동할 전체 칸수 
		
		
		for(int i = 0; i < line ; i++) {
			
			if(i <= half) {
				step = line + i;
				space = (line -1) -i;
			}else {
				//중앙을 지나면 기존 값에서 공백은 하나증가, 별은 하나 감소
				space++;
				step--;
			}
			
			//step 은 j 의 조건 값 
			for(int j = 0 ; j < step ; j++) {
				//space 보다 작을 때는 공백
				if(j < space) {
					System.out.print(" ");
				}else {
					//space보다 작지 않으면 별찍는다.
					System.out.print("*");
				}
			}
			//줄바꿈 
			System.out.println();
		}
 
	}

}
