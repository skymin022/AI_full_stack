package _1165;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Car = 170;
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if (num1 > Car && num2 > Car && num3 > Car) {
			System.out.println("PASS");
		}else {
			System.out.println("CRASH");
		}
	}
	
}
