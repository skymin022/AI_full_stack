package Day05.Ex02_생성자;

import java.util.Iterator;

// 학생
// - 변수 	: 이름, 나이, 학번, 전공
// - 메소드 	: 공부하기, 성적 평균 구하기 
public class Student {

	// 변수 
	String name;
	int age;
	String StdNo;
	String major;
	
// -------------------------------------------------------------
	// 생성자
	// 단축키 :	alt + shift + s -> o
	// TODO : 기본 생성자
//	public Student() {
//		this.name = "이름없음";
//		this.age =0;
//		this.StdNo = "00000000";
//		this.major = "전공없음";		
//	}
	
/*
 */
	public Student() {
		this("이름없음", 0);
		name = "이름없음";
		age =0;
		StdNo = "00000000";
		major = "전공없음";	
	}
	
	public Student(String name, int age) {
		this(name, age, "00000000", "전공없음");
//		name = "이름없음";
//		age =0;
//		StdNo = "00000000";
//		major = "전공없음";		
	}
	

	
//	// 이름, 나이로만 제작
//	public Student(String name, int age) {
//		this.name = name;
//		this.age = age;
//		StdNo = "00000000";
//		major = "전공없음";
//	}



	// TODO : 매개변수가 있는 생성자
	public Student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.StdNo = stdNo;
		this.major = major;
	}
// ---------------------------------------------------------------	
	
	// 메소드 
	// * 접근지정자 반환타입 메소드면(매개변수) {}
	// - 공부하기
	// * void : 반환타입 없음 (return 생략가능)
	// - void 로 지정해도 return을 메소드를 종료시키는 용도로 사용할 수 있다.
	public void study(String subject) {
		System.out.println( subject + "(을/를) 공부합니다.");
	}
	
	
	
	

	// - 성적 평균 구하기 2개
	public double getAberage(int score1, int score2) {
		// TODO : 평균을 구하여 반환해보세요
		double avg = (double)(score1 + score2)/2;
		return avg;
	}
	
	// - 성적 평균 구하기 3개 
	public double getAberage(int score1, int score2, int score3) {
		// TODO : 평균을 구하여 반환해보세요
		double avg = (double)(score1 + score2 + score3)/3;
		return avg;
	}
	
	// - 성적 평균 구하기 배열
	public double getAberage(int[] scores) {
		// TODO : 평균을 구하여 반환해보세요
		double avg = 0.0;
		int sum =0;
//		for (int i = 0; i < score1.length; i++) {
//			sum += score1;
//		}
		
		for (int score : scores) {
			sum += score;
			
		}
		avg = (double) sum/scores.length;
		
		return avg;
	}
	
}
