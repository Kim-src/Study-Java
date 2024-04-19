package sample04;

// 기본적인 switch 조건문 학습을 위한 객체입니다.
public class SwitchTest01 {
	
	public static void main(String[] args) {
		
		// if 조건문보다 switch 조건문이 덜 사용됩니다.
		// 그런데 switch 조건문은 간략한 조건을 작성할 때 사용할 수 있습니다.
		// if 조건문은 조건에 대한 내용이 장황하여도 괜찮습니다.
		// switch 조건문은 수식을 설정할 때 사용됩니다.
		
		// rand 변수에 random() 함수식을 삽입하였습니다.
		// 함수로 산출된 값은 int 형태로 형 변환(type casting) 설정하였습니다.
		// rand 변수에는 최솟값을 50으로 설정하였으며 최댓값을 100으로 설정하였습니다.
		// 최솟값 50, 최댓값 100을 설정하기 위해 아래와 같은 수식을 작성하였습니다.
		// random() 함수는 0~1 사이의 소수를 반환합니다.
		// 최솟값은 random() 함수의 최종 결과값에 더하려는 값입니다.
		// 최댓값은 random() 함수의 결과값에 곱하려는 값에 최솟값을 더하고 1을 제한 값입니다.
		int rand = (int)(Math.random() * 51) + 50;
		
		// switch 조건문은 함수식 내부에서 계산된 값을 케이스에 따라 반환합니다.
		// switch 함수식 내부에는 답을 작성해야 됩니다.
		// case에는 switch 함수식으로 인해 계산되는 결과값을 작성해야 됩니다.
		// switch 함수식으로 rand 변수를 10으로 나눴을 때의 몫(int)을 결과값으로 얻도록 설정하였습니다.
		switch(rand / 10) {
		
		// switch 조건문의 결과가 10일 때의 case를 설정하였습니다.
		case 10 :
			//System.out.println("점수 = " + rand + ", 등급 = A");
			//break;
			
		// switch 조건문의 결과가 9일 때의 case를 설정하였습니다.
		// break
		case 9 :
			System.out.println("점수 = " + rand + ", 등급 = A");
//			break;
		case 8 : 
			System.out.println("점수 = " + rand + ", 등급 = B");
//			break;
		case 7 : 
			System.out.println("점수 = " + rand + ", 등급 = C");
//			break;
		case 6 :
			System.out.println("점수 = " + rand + ", 등급 = D");
//			break;
			
		// switch 조건문의 결과가 6 미만일 때의 case를 설정하였습니다.
		// 
		default :
			System.out.println("점수 = " + rand + ", 등급 = F");
		}
	}

}
