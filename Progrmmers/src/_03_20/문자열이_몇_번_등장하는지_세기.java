package _03_20;

import java.util.Scanner;

public class 문자열이_몇_번_등장하는지_세기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String myString = sc.next();
		String pat = sc.next();
		int answer =1;
		
		
		char[] str1 = myString.toCharArray();
		char[] str2 = pat.toCharArray();
		
		
		for (int i = 0; i < str2.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				if (str1[i] == str2[j]) {
					
				}
			}
		}
		
		
		
		
		sc.close();
	}
	
}
