package _03_31;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");
			balance = sc.nextInt();
			
			
			switch (balance) {
			case 1 : System.out.println("예금"); break;
			case 2 : System.out.println("적금"); break;
			case 3 : System.out.println("잔고"); break;
			case 4 : System.out.println(); 
			run = false; break;
			default : System.out.println("잘못된 입력입니다."); break;
			
			}
			
			System.out.println("프로그램 종료");
			sc.close();
			}
		
	}
}
