package _1166;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if (N%400 ==0) {
			System.out.println("Leap");
		} else if (N%4 == 0 && N%100 != 0) {
			System.out.println("Leap");
		} else {
			System.out.println("Normal");
		}
		
		sc.close();
	}
	
}
