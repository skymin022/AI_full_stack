package Day06.Review;

import java.util.Arrays;
import java.util.Iterator;

public class Ex04_Lotoo {

	// Math.random()	: 0.xxxxx ~ 0.9xxxxx 사이의 난수를 반환하는 메소드
	public static void main(String[] args) {
		double random = Math.random();
		System.out.println(random);
	
		// 1~6 사이의 정수 : 주사위
		// Math.random() * 10 				: 0.xxx ~ 0.9xxx -> 0.xxx ~ 9.xxx
		// (int) (Math.random() *10)		: 0~9
		// (int) (Math.random() *10) + 1	: 1~10
		System.out.println("1~10 :" + ((int) (Math.random() *10) + 1));
	
		// (int) (Math.random() *6) 		: 0~5
		// (int) (Math.random() *6) + 1		: 1~6
		int dice = (int) (Math.random()*6 +1);
		System.out.println("주사위 : " + dice);
	
		// 1~20 사이의 랜덤수
		int N1 = (int) (Math.random()*20 +1);
		System.out.println("1~20 사이의 랜덤 수 : " + N1);
		
		// -20~20 사이의 랜덤수
		int N2 = (int) (Math.random()*41 -20);
		System.out.println("1~20 사이의 랜덤 수 : " + N2);
		
		
		// 1~45 사이의 랜덤수
		int N3 = (int) (Math.random()*50);
		System.out.println("1~45 사이의 랜덤 수 : " + N3);
		
		
		// 1~45 사이의 랜덤 수 6개를 배열에 저장하시오
		int Lotto[] = new int[6];
		
		
		for (int i = 0; i < Lotto.length; i++) {
			Lotto[i] = (int) (Math.random()*45 + 1);
			
			// 중복 수 제거
			// (과제) 오름차순 정렬
			for (int j = i-1; j >=0; j--) {
				if (Lotto[i] == Lotto[j]) {
					i--;
					break; // 가까운 반복문 종료
				}
				
			}
						
		}
		
		// 과제 오름차순 정렬
		for (int i = 0; i < Lotto.length-1 ; i++) {
			for (int j = 0; j < Lotto.length-1 -i; j++) {
				if (Lotto[j] > Lotto[j+1]) {
					int temp = Lotto[j];
					Lotto[j] = Lotto[j+1];
					Lotto[j+1] = temp;
				}
			}
		}

		
		
		
		for (int i : Lotto) {
			System.out.print(i + " ");
		}
		
		System.out.println();
	
		
	}
	
	
}
