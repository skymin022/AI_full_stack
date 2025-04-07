package Ex03;

import java.io.File;
import java.io.FileNotFoundException;
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
		
		LinkedList<Student> linkedList = new LinkedList<Student>();
		
		for (Student student : linkedList) {
			System.out.println(student);
		}
		
	
	}
	
}
