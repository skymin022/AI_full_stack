package _03_20;

import java.util.Scanner;

public class 문자열_뒤집기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int s = sc.nextInt();
		int e = sc.nextInt();
		
		char[] arr = str.toCharArray();
		
		
		
		for (int i = 0; i < e-s; i++) {
			for (int j = s; j < e-i; j++) {
				char temp;
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		
		}
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//		}
		
		sc.close();
		
//		String newstr = new String(arr);
		String newstr = new String();
		
		for (int i = 0; i < arr.length; i++) {
			newstr += arr[i];
		}
		
		
		
		
		System.out.println(newstr);
		
	} 
	
}
