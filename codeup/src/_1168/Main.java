package _1168;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 나이변수
		int age;
		
		// 정수 2개 입력 받음
		String N1 = sc.next();
		int N2 = sc.nextInt();
		
		
		// N1 문자열에서 0,1 번 문자 뽑기
		String str = N1.substring(0,2);
		
		
		// 문자열 -> 숫자로 변경하기 
		int FN = Integer.parseInt(str);
		
		
		// N2 에서 1,2 는 1900 / 3,4, 는 2000 으로 판단
		if (N2 == 1 || N2 == 2) {
			int age1 = (100-FN+13) ;
			age =age1;
			
		} else {
			int age1 = 12-FN+1;
			age = age1;
		}
		
		System.out.println(age);
		sc.close();
	}
	
}
