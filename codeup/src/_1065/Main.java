package _1065;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		if (num1 > 0) {
			System.out.println("plus");
		} else System.out.println("minus");
		
		if (num1 %2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	
	}
	
}