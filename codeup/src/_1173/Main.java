package _1173;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int result;
		
		if (min <30 & hour > 0){
			hour -= 1;
			result = 60 - (30- min);
		} else if (min < 30 && hour == 0) {
			hour = 23;
			result = 60 - (30- min);
		} 
		
		
		else {
			result = min - 30;
		}
		
		System.out.print(hour + " " + result);
		
		
		sc.close();
	}
	
}
