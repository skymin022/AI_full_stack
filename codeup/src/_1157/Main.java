package _1157;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		
		if (60 >= a && a >50) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
	}
	
}