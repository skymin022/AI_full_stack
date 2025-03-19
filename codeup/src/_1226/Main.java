package _1226;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr1 = new int[6];
		int num1 = 0;
		int[] arr2 = new int[6];
		int count =0;
		int num2 =0;
		// 당첨번호 
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		// 보너스 번호
		num1 = sc.nextInt();
		// 내 번호
		for (int j = 0; j < arr1.length; j++) {
			arr2[j] = sc.nextInt();
		}
			
		// 당첨번호 확인
		for (int a = 0; a < arr1.length; a++) {
			for (int b = 0; b < arr2.length; b++) {
				if (arr1[a]==arr2[b]) {
					count++;
				}
			}
		}
		// 보너스 번호를 맞췄을 때
		for (int c = 0; c < arr1.length; c++) {
			if (num1==arr2[c]) {
				num2= 1;
			
			} 	
			
		}
		
		if (num2 == 1 && count == 5) {
			System.out.println("2");
		}
		if (count==5) {
			System.out.println("3");
		}
		
		
		
		
		
		// 당첨 번호 , 내번호 일치 확인 
		switch (count) {
		case 6 : System.out.println("1"); break;
		case 4 : System.out.println("4"); break;
		case 3 : System.out.println("5"); break;
		case 2 : System.out.println("0"); break;
		case 1 : System.out.println("0"); break;
		case 0 : System.out.println("0"); break;

		}
		
	
	
	sc.close();
	}
	
	
}
