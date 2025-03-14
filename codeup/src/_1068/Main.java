package _1068;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String grade = sc.next();
		
		switch (grade) {
		case "A": System.out.println("best!!!"); break;
		case "B": System.out.println("good!!"); break;
		case "C": System.out.println("run!"); break;
		case "D": System.out.println("slowy~"); break;
		default: System.out.println("what?");
			break;
		}
		
	
	}
	
}