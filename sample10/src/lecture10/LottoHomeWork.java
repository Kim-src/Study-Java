package lecture10;

import java.util.Arrays;
import java.util.Scanner;

public class LottoHomeWork {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//로또 시스템 
		int[] balls = new int[45];
		int[] lotto = new int[6]; // 추출된 로또번호
		int bonusNum = 0; // 추출된 보너스 번호 
		
		//1 ~ 45개의 번호를 순차적으로 배열에 넣는다. 
		for(int i = 0; i < balls.length ; i ++) {
			balls[i] =  (i+1);
		}
		
		
		int count = 0; // 꺼낸 번호의 개수
		
		while(count < 7) {
			//뽑을 공의 위치를 랜덤함수를 이용하여 정한다(0 ~ 44 사이 랜덤)
			int index = (int)(Math.random() * 45);

			if(balls[index] == 0) {
				//이번 반복 끝
				continue;
			}
			
			 if(count < 6) {
				 lotto[count] = balls[index];
			 }else {
				 bonusNum = balls[index];
			 }
			 
			 balls[index] = 0; // 뽑은 위치를 0 으로 값 변경
			 count++; // 카운트 증가 
		}
		
	//	System.out.println("로또 번호 : " + Arrays.toString(lotto) +", 보너스 번호 : " + bonusNum);
	
		//유저 로또 번호 
		int[] user = new int[6];
		Scanner scan = new Scanner(System.in);	
		
		count = 0; // 재활용을 위해서 초기화
		
		while(count < 6) {
			
			System.out.println( (count+1) +"번째 로또 번호 ");
			int ball = scan.nextInt();
			
			if(ball < 1 ||  ball > 45) {
				System.out.println("로또번호는 1 에서 45 사이만 선택가능합니다.");
				continue;
			}
			
			for(int i =0;  i < count; i++) {
				if(user[i] == ball) {
					System.out.println(ball +"은 이미 존재하는 번호");
					ball = 0;
					break;
				}
			}
			
			if(ball != 0) {
				user[count++] = ball;
			}
			
		}
		
		System.out.println("유저 번호 : " + Arrays.toString(user));
		//스캐너 닫기
		scan.close();
		
		//비교
		int[] luckyNums = new int[6]; // 당첨 번호 저장 배열
		boolean isBonus = false; // 보너스 번호 당첨 여부 
		int luckyCount = 0;  // 맞은 번호 개수 
		
		//사용자가 선택한 로또 번호와 시스템의 번호를 비교 한다 
		for(int i = 0; i < user.length; i++) {
			for(int j = 0; j < lotto.length; j++) {  
				if(user[i] == lotto[j]) {
					//동일한 번호가 있다면
					luckyNums[luckyCount++] = user[i];
					//찾았으니 그만 비교
					break;
				}
			}
			
			//보너스 번호를 찾을 때 까지만 비교 
			if(!isBonus) {
				if(user[i] == bonusNum) {
					isBonus = true;
				}
			}
		}
		
		//맞은 로또 번호 출력
		System.out.print("맞은 번호 : ");
		for(int i = 0; i < luckyCount; i++) {
			System.out.print(luckyNums[i] +" ");
		}
		
		
		
		System.out.print(luckyCount== 5 && isBonus ? ", 보너스번호 : " + bonusNum +"\n"   : "\n");
		
		
		if(luckyCount == 6) {
			System.out.println("인생 대박!! 로또 1등!!");
		}else if(luckyCount ==5  && isBonus) {
			System.out.println("대박!! 로또 2등!!");
		}else if(luckyCount ==5) {
			System.out.println("대박!! 로또 3등!!");
		}else if(luckyCount ==4) {
			System.out.println("우와!! 로또 4등!!");
		}else if(luckyCount ==3) {
			System.out.println("로또 5등!!");
		}else {
			System.out.println("아깝습니다..다음기회에!!");
		}
		 

	}

}
