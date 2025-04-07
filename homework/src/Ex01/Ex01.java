package Ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1차원 배열 생성 - 오름 차순
		int[] arr = new int[5];
		
		// 1차원 배열 생성 - 내림 차순
		int[] arr2 = new int[5];
		
		
		
		// 5명 성적 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
        // 버블 정렬 - 오름차순
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        // 오름차순 출력
        for (int i = 0; i < arr.length; i++) {
        	System.out.print(arr[i] + " ");
        }
        
        // 버블 정렬 - 내림차순
        for (int i = 0; i < arr.length; i++) {
        	for (int j = 0; j < arr.length - i - 1; j++) {
        		if (arr[j] < arr[j + 1]) {
        			int temp = arr[j];
        			arr[j] = arr[j + 1];
        			arr[j + 1] = temp;
        		}
        	}
        }
		
        System.out.println();
        
        // 내림차순 출력
        for (int i = 0; i < arr.length; i++) {
        	System.out.print(arr[i] + " ");
        }
        
		
		sc.close();
	}
}
