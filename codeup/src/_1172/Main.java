package _1172;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수 3개 입력 받을 배열 생성
		int[] arr = new int[3];
		
		// 정수 3개 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		
//		for (int i = 0; i < arr.length-1; i++) {
//			if ( arr[i] > arr[i+1]) {
//				int temp;
//				temp = arr[i];
//				arr[i] = arr[i+1];
//				arr[i+1] = temp;
//			}
//		}
		
		
		
//		// 정수 비교
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		
		// 배열 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}
	
}
