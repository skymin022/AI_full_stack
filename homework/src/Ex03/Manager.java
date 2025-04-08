package Ex03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Manager {
	
	public static LinkedList<Student> getTxtToList(LinkedList<Student> list) {
		
		try {
			// 파일 
			File file = new File("student.txt");
			
			// 파일 읽어오기
			Scanner sc = new Scanner(file);
			
			// 파일 객체에 저장 
			Student std;
			
			// 파일 리스트 형태로 저장 
			while(sc.hasNextLine()) {
				String stn = sc.nextLine();
				String[] data = stn.split("/");
				int no = Integer.parseInt( data[0] );
				String name = data[1];
				int score = Integer.parseInt( data[2] );
				String className = data[3];
				std = new Student(no, name, score, className);
				list.offer(std);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		// 객체 호출
		LinkedList<Student> studentsList = new LinkedList<Student>();
		
		// 데이터 저장
		studentsList = getTxtToList(studentsList);
		
		
		// 정렬 
		studentsList.stream()
					// 번호 오름차순 
					.sorted(Comparator.comparing( Student::getNo ))
		
					// 성적 내림차순
					.sorted(Comparator.comparing( Student::getScore ).reversed())
					
					
					// 출력
					.forEach( p -> System.out.println(p));
						
		
		
		
		
	
		
	
	}
	
}
