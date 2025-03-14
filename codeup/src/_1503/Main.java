package _1503;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[][] = new int[N][N];
		
		int num =1;
					
		// 역방향
		for (int i = 0; i < arr.length; i++) {
			if (i%2==0) {
				for (int j = N-1; j >=0; j--) {
					arr[i][j] = num++;
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
				
			} else {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ") ;
				}
				System.out.println();

			
			}
		}
		
		
				
		
	sc.close();	
	}
	
}