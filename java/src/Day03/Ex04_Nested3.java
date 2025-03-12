package Day03;

import java.util.Scanner;

public class Ex04_Nested3 {

	public static void main(String[] args) {
		// 정보처리기사 합격 기준
		// *응시자격 	: 대학교 4학년
		// * 점수		: 60점 이상
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학년 :");
		int 학년 = sc.nextInt();
		
		if (학년 != 4) {
			System.out.println("응시 자격 X");
			return;				//프로그램을 종료 
		} 
		System.out.print("점수 : ");
		int 점수 = sc.nextInt();
		if (점수 >= 60) {
			System.out.println("합격");
		} else  {
			System.out.println("불합격");
		}
			
			
		
			
		
		sc.close();
	}
}
