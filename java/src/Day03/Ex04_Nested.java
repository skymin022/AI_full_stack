package Day03;

import java.util.Scanner;

public class Ex04_Nested {

	public static void main(String[] args) {
		// 정보처리기사 합격 기준
		// *응시자격 	: 대학교 4학년
		// * 점수		: 60점 이상
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학년 : ");
		int year = sc.nextInt();
		System.out.print("점수 :");
		int score = sc.nextInt();
		
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
		
		
// if문 중첩 권장 x
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
		
//		//방법 2 
//		if (year != 4) {
//			System.out.println("응시 자격이 없습니다");
//		} else if ( score >= 60) {
//			System.out.println("합격!");
//		} else {
//			System.out.println("불합격!");
//		}
//		
//		
		
//		//방법 3 
//		if (year == 4 && score >= 60) {
//			System.out.println("합격");
//		} else if (year == 4) {
//			System.out.println("불합격");
//		} else {
//			System.out.println("응시 자격 X");
//		}
			
//		// 방법 4
//		if (year != 4) {
//			System.out.println("응시자격 X");
//		} else if (score >=60) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
		
		System.out.println();
		
		// 방법 5 (응시자격이 안되면 점수 입력 안받는 방법)
		// 응시 자격이 있는 경웅에만 점수 입력 받기
		
		System.out.println("학년 : ");
		int 학년 = sc.nextInt();
		
		if (학년 != 4) {
			System.out.println("응시 자격 X");
		} else {
			System.out.println("점수 : ");
			int 점수 = sc.nextInt();
			if (점수 >=60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		}
		
		
		
		
		
		
		
		
		sc.close();
	}
}
