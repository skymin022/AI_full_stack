package Day03;

import java.util.Scanner;

public class Ex04_Nested2 {

	public static void main(String[] args) {
		// 정보처리기사 합격 기준
		// *응시자격 	: 대학교 4학년
		// * 점수		: 60점 이상
		Scanner sc = new Scanner(System.in);
		System.out.print("학년 : ");
		int year = sc.nextInt();
		int score1 = 60;
		
		
		if (year != 4) {
			System.out.println("응시 자격이 없습니다");
			
		} else if ( score1 >= 60) {
			System.out.print("점수 :");
			int score2 = sc.nextInt();
			score1 = score2;
			System.out.println("합격!");
		} else {
			System.out.println("불합격!");
		}
		
		

		
		
		
		
		// 합격!
		// 불합격!
		// 응시자격이 없습니다.
	
		// 권장되지 않는 사용 방법
//		if ( year == 4) {
//			if (score >= 60) {
//				System.out.println("합격!");
//			}
//			else if (score < 60) {
//				System.out.println("불합격!");
//			} 
//			
//			System.out.println("응시자격이 없습니다.");
//		}
		
		
// if 문 중첩하지 않고 조건을 작성할 수 있다. 
//		// 4학년 
//		if (year == 4) {
//			// 60점 이상
//			if (score > 60) {
//				System.out.println("합격!");
//			}
//			else {
//				System.err.println("불합격!");
//			}
//		} else {
//			System.out.println("응시 자격이 없습니다. ");
//		}
//		
		
		
//		// if 문 중첩하지 않기
//		if (year == 4 && score >= 60) {
//			System.out.println("합격!");
//		} else if (year == 4) {
//			System.out.println("불합격");	
//		} 
//		 else {
//			System.out.println("응시 자격 없음");
//		}
		
		//방법 2 

		
		
		
		
		sc.close();
	}
}
