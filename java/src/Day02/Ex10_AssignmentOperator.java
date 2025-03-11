package Day02;

import java.util.Scanner;

public class Ex10_AssignmentOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// (바로 엔터) : shift + enter
		
		System.out.print("x : ");
		int x = sc.nextInt();
		
		System.out.print("y : ");
		int y = sc.nextInt();
		
		System.out.print("z : ");
		int z = sc.nextInt();
		
		//평균, 합계
		int sum = x + y + z;
		double avg = sum /3;
		// (double_ = (int) / (int)
		// *int는 정수 자료형으로, 실수의 소수부분을 표현할 수 없더.
		
		// (큰 자료현) + (작은 자료형) = (큰 자료형)
		// - 서로 다른 자료형 연산 시, 결과는 큰 자료형으로 변환된다. 
		
		double realAvg1 = sum /3.0;
		double realAvg2 = (double) sum /3;
		
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		// avg 평균변수가 정수형(int)이라서 소수부분을 표현할 수 없다.
		// 평균을 소수점까지 표현하기 위해서는 실수형(double)로 변환해야한다.
		System.out.println("평균 : " + realAvg1);
		System.out.println("평균 : " + realAvg2);
		sc.close();
		
	}
}
