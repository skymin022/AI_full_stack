package ClassRoom_homework._03_20_java_Mission;

import java.util.Scanner;

public class _Odd {

    public static void main(String[] args) {
        // 정수 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int odds, even;
        
        
        // 홀수 짝수 개수 지정
        if (N%2 == 0) {
        	odds = N/2;
        	even = N/2;
		} else {
			odds = N/2;
			even = N/2 + 1;
		}
			
		// 홀수 짝수 배열 생성
        int[] arrOdds = new int[odds];
        int[] arrEven = new int[even];
        
       
        // 초기 설정 
        int countOdds =1;
        int countEven =2;
        
        
        // 정수가 홀수인 경우 짝수인 경우 구분
        if (N%2== 0) {
        	// 홀수
        	for (int i = 0; i < arrEven.length; i++) {
        		arrOdds[i] = countOdds;
        		countOdds += 2;
        		
        	}
        	
        }
        //홀수 출력
        for (int i = 0; i < arrEven.length; i++) {
			System.out.print(arrOdds[i] + " ");
		}
        
        // 짝수
        for (int i = 0; i < arrEven.length; i++) {
        	arrEven[i] = countEven;
        	countEven += 2;
        }
        
        //짝수 출력
        for (int i = 0; i < arrEven.length; i++) {
			System.out.print(arrEven[i] + " ");
		}

        
    }
}
