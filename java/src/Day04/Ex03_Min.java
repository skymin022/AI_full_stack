package Day04;

import java.util.Scanner;

public class Ex03_Min {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//2. 
		int arr[] = new int[N];
		
		//3.
		// i : 0 1 2 3 4
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//4. 
		// Integer.MAN_VALUE : 21억 : int의 최솟깂
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) 
			if (min > arr[i]) {
				//5.
				min = arr[i];
		}
		//6.
		System.out.println(min);
		sc.close();
		
	}
}

