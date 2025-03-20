package _1170;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int grade = sc.nextInt();
//		int classs = sc.nextInt();
//		int num = sc.nextInt();
		
		String grade = sc.next();
		String classs = sc.next();
		int num = sc.nextInt();
		
		
		if(num <10 ) {
			System.out.println(grade + classs + "0" + num);
		}else {
			System.out.println(grade + classs + num);
		}
		
		
		sc.close();
	}
	
}
