package _1409;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		int N = sc.nextInt();
		
		System.out.println(arr[N-1]);
		
		
		
	sc.close();	
	}
	
}