package _1169;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 나이변수
		int age = sc.nextInt();
		int year, N1;
		
		
		if(age > 13) {
			N1 = 1;
			year = 100 - age+13;
		}else {
			N1 = 3;
			year = 13 - age;			
		}
		
		System.out.print(year + " " + N1);
		
		sc.close();
	}
	
}
