package _1167;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 세개 숫자 베열 생성
		int arr[] = new int[3];
		
		// 세개 숫자 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 오름차순 제작
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				// 0번째 VS 1번째 비교
				if (arr[j] > arr[j+1]) {
					// 0번째가 높으면 1번째에 저장
					int temp = 0;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		
		// 출력
		System.out.println(arr[1]);
		
		sc.close();
	}
	
}
