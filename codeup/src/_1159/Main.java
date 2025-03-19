package _1159;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (50 <= num && num <= 70) {
			System.out.println("win");
		} else if (num%6 == 0) {
			System.out.println("win");
		}else {
			System.out.println("lose");
		}
		
	}
	
}