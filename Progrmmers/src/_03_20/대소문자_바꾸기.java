package _03_20;

import java.util.Scanner;

public class 대소문자_바꾸기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력
		String A = sc.nextLine();
		// 문자열 배열로 저장
		char[] arr = A.toCharArray();
		
		// 대문자 -> 소문자
		for (int i = 0; i < arr.length; i++) {
			
			// 대문자인지 확인 
			boolean check = Character.isUpperCase(arr[i]);
			// 대문자이면 소문자로 변경
			if(check == true) {
				arr[i] = Character.toLowerCase(arr[i]);
			} else {
				arr[i] = Character.toUpperCase(arr[i]);
				
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}