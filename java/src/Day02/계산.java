package Day02;

import java.util.Scanner;

public class 계산 {

	public static void main(String[] args) {
		
		System.out.println("간이 계산기");
		System.out.println("1번. 덧셈");
		System.out.println("2번. 뺄셈");
		System.out.println("3번. 곱셈");
		System.out.println("4번. 나눗셈");
		
		
		System.out.print("수행할 모드 선택하기 : ");
		Scanner sc = new Scanner(System.in);
		
		int mode = sc.nextInt();
		
		if (mode == 1) {
			System.out.print("숫자 2개를 입력하시오. : ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
		
			System.out.printf("%d + %d = %d", num1,num2,num1 + num2);
		}	
		
		else if (mode == 2) {
				System.out.print("숫자 2개를 입력하시오. : ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();	
				
			System.out.printf("%d - %d = %d", num1,num2,num1 - num2);
			}
		
		else if (mode ==3) {
			System.out.print("숫자 2개를 입력하시오. : ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();	
			
			System.out.printf("%d * %d = %d", num1,num2,num1 * num2);
		}
		
		else {
			System.out.print("숫자 2개를 입력하시오. : ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			System.out.printf("%d / %d = %d", num1,num2,num1 / num2);
		}
		
		


		sc.close();
	}
}
