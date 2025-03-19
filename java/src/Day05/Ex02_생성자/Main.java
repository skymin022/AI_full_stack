package Day05.Ex02_생성자;

public class Main {

	public static void main(String[] args) {
		// Student 객체 생성
		Student student = new Student();
		student.name = "고건우";
		student.age = 22;
		student.major = "컴공";
		student.StdNo = "20250001";
		
		System.out.println("::::::::::: 학생1 :::::::::::");
		System.out.println("학생1 - 이름 : "+ student.name);
		System.out.println("학생1 - 나이 : "+ student.age);
		System.out.println("학생1 - 전공 : "+ student.major);
		System.out.println("학생1 - 학번 : " +student.StdNo);
		student.study("임베디드 시스템");
		
		System.out.println("학생1 - 중간고사 점수 : " + student.getAberage(100, 90));
		System.out.println();
		
		
		Student student2 = new Student("이준영", 28, "20190001", "체육교육과");
//		student2.name = "이준영";
//		student2.age = 28;
//		student2.major = "체육교육과";
//		student2.StdNo = "20190001";
		
		System.out.println("::::::::::: 학생2 :::::::::::");
		System.out.println("학생2 - 이름 : "+ student2.name);
		System.out.println("학생2 - 나이 : "+ student2.age);
		System.out.println("학생2 - 전공 : "+ student2.major);
		System.out.println("학생2 - 학번 : " +student2.StdNo);
		student2.study("축구");
		
		System.out.println("학생2 - 중간고사 점수 : " + student2.getAberage(100, 90));
		System.out.println();
		
		
		Student student3 = new Student("윤홍민", 25);

		System.out.println("::::::::::: 학생3 :::::::::::");
		System.out.println("학생3 - 이름 : "+ student3.name);
		System.out.println("학생3 - 나이 : "+ student3.age);
		System.out.println("학생3 - 전공 : "+ student3.major);
		System.out.println("학생3 - 학번 : " +student3.StdNo);
		student3.study("축구");
		
		System.out.println("학생3 - 중간고사 점수 : " + student3.getAberage(100, 90));
		System.out.println("학생3 - 기말고사 점수 : " + student3.getAberage(100, 90, 70));
		
		int socres3[] = {100,80,70,65,95};
		System.out.println("학생3 - 기말고사 점수 : " + student3.getAberage(socres3));
		
		System.out.println();
		
		
		
		
	}
	
}
