package _1069;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		switch (num1) {
		case 12,1,2:
			System.out.println("winter"); break;
		case 3,4,5:
			System.out.println("spring"); break;
		case 6,7,8:
			System.out.println("summer"); break;


		default:
			System.out.println("fall");
			break;
		}	
	
	}
	
}