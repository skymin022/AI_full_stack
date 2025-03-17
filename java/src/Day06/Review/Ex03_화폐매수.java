package Day06.Review;

import java.util.Iterator;
import java.util.Scanner;

/*
 * 우리학원에서 고건우님께서 거액의 예산을 주고
 * 전자렌지를 구매하라고 지시하였다.
 * 이 때 전자렌지 구매비는 다음과 같이 현금으로 지급한다.
 * 구매비 			: 	657862
 * 50000 			: 	13개
 * 10000			: 	0개
 * 5000				: 	1개
 * 1000				: 	2개
 * 500				: 	1개
 * 50				: 	1개
 * 10				: 	1개
 * 5				: 	0개
 * 1				: 	2개
 * 위와 같이 입력하면,
 * 큰 화폐 단위부터 계산하여, 
 * 화폐단위별로 화폐매수를 출력하는 프로그램을 작성하시오.
 * 
 */
public class Ex03_화폐매수 {

	public static void main(String[] args) {
		/*
		 * 순서도
		 * 1. 필요한 변수 선언
		 * 		- (입력금액), (화폐매수), (화폐단위)
		 * 2. 구매비 입력
		 * 3. 화폐매수 계산
		 * 		3-1. 화폐매수 계산
		 * 			(화폐매수) = (입력금액) / (화폐단위)
		 * 		3-2. 잔액 계산
		 * 			657862 - (50000 * 13) = 7862
		 * 			i). (잔액) = (입력금액) - (화폐단위 * 화폐매수)
		 *			657862 % 50000 = 7862 
		 * 			ii). (잔액) = (입력금액) - (화폐단위 * 화폐매수)
		 * 		3-3 화폐 단위 변환
		 * 			i. 배열(화매 단위)
		 * 			ii. /5 /2 를 연산을 반복
		 * 			50000 / 5 = 10000
		 * 			10000 / 2 - 5000
		 * 			5000 / 5 = 1000
		 * 			1000 / 2 = 500
		 * 			
		 * 4. 3번 반복 
		 *  - 화폐단위가 1원이 될때까지
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		// 입력 금액
		System.out.print("구매비 : ");
		int N = sc.nextInt();
		
		// 화폐 매수
		int MoneyCount[] = new int[10];
		
		// 남은 잔여금
		int rest = 0;
		
		// 화폐 단위 
		int MoneyStand[] = {50000,10000,5000,1000,500,100,50,10,5,1};
		
		// 반복 계산을 위해서 처음에 초기화 
		rest = N;
		
		// 반복
		for (int i = 0; i < MoneyStand.length; i++) {
			// 화폐 매수 계산
			MoneyCount[i] = rest/MoneyStand[i];
			// 화폐 잔액reset
			rest = N%MoneyStand[i];
			
		}
		
		for (int i = 0; i < MoneyStand.length; i++) {
			System.out.println(MoneyCount[i]);
		}
		
		for (int i = 0; i < MoneyStand.length; i++) {
			System.out.println(MoneyStand[i] + " : " + MoneyCount[i]);
		}
		
		// 방법2
		

		
		
	}
}







