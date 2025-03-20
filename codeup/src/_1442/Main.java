package _1442;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
	
		// 입력받은 정수를 배열에 저장
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		// 배열의 원소 오름차순으로 출력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		
		}	
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}


		
	sc.close();	
	}
	
}


