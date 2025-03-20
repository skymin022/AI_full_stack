package _1171;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[6];
		
		// 학년
		int grade = sc.nextInt();
		arr[0] = grade;
		
		// 반
		int classs = sc.nextInt();
		if (classs < 10) {
			arr[1] = 0;
			arr[2] = classs;
		} else {
			arr[1] =1;
			arr[2] = classs%10;
		}
		
		int num = sc.nextInt();
		if(num >= 100) {
			arr[3] =1;
			arr[4] = (num-100)/10 ;
			arr[5] = (num%100)%10;
		}else if(100> num && num >=10) {
			arr[3] =0; 
			arr[4] = num/10;
			arr[5] = num%10;
		} else {
			arr[3] = 0;
			arr[4] = 0;
			arr[5] = num;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		

		
		
		sc.close();
	}
	
}
