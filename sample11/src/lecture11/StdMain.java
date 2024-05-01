package lecture11;

import java.util.Scanner;

public class StdMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] stArr = new Student[2];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < stArr.length; i++) {
			//학생 객체 생성
			Student st = new Student();
			System.out.println( (i+1) +"번쨰 학생 이름 : ");
			st.setMyName( scan.next() );
			System.out.println( (i+1) +"번쨰 학생 국어점수 : ");
			st.setKor(scan.nextInt());
			System.out.println( (i+1) +"번쨰 학생 수학점수 : ");
			st.setMath(scan.nextInt());
			System.out.println( (i+1) +"번쨰 학생 영어점수 : ");
			st.setEng(scan.nextInt());
			//배열에 저장
			stArr[i] = st;
			
		}
		//스캐너 닫기
		scan.close();
		
		for(Student st : stArr) {
			st.getInfo();
		}

	}

}
