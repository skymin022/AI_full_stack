package _1163;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		int N3 = sc.nextInt();
		
		System.out.print((N1 + N2 + N3)/100 %2 ==0 ? "대박" : "그럭저럭");
		
	}
}
