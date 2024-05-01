package co.it.exam;

import java.util.Arrays;
import java.util.Scanner;

public class StdMain {
	
	public static void main(String[] args) {
		
		Student[] stArr = new Student[2];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < stArr.length; i++) {
			Student st = new Student();
			System.out.print((i+1) + "번째 학생 이름 = ");
			st.setMyName(scan.next());
			System.out.print((i+1) + "번째 학생 국어점수 = ");
			st.setKor(scan.nextInt());
			System.out.print((i+1) + "번째 학생 수학점수 = ");
			st.setMath(scan.nextInt());
			System.out.print((i+1) + "번째 학생 영어점수 = ");
			st.setEng(scan.nextInt());
			
			stArr[i] = st;
			
			System.out.println();
		}
		
		scan.close();
		
		System.out.println(Arrays.toString(stArr));
		
		for(Student st : stArr) {
			st.getInfo();
		}
		
	}

}
