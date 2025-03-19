package _1508;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] arr = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
		}
		
//		//TODO
//		// 계산
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				
			}
		}
		
		
		
		
		
		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
		
		
		
		

		
		
	sc.close();	
	}
	
}