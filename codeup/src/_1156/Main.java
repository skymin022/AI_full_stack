package _1156;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
		Scanner sc = new Scanner(System.in);
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		
		System.out.print(num1 % 2 == 0 ? "짝수":"홀수");
		System.out.print("+");
		System.out.print(num2 % 2 == 0 ? "짝수":"홀수");
		System.out.print("=");
		System.out.print((num1 + num2)%2==0 ? "짝수":"홀수");

		
		
	sc.close();	
	}
	
}