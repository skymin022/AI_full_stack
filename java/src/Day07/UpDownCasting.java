package Day07;

class Person {
	String name;
	int age = 20;
	
	void work() {
		System.out.println("일읍합니다.");
	}
	
}


class Student extends Person {
	String major;
	int age = 10;
	
	void work() {
		System.out.println("공부합니다.");
	}
	
}

public class UpDownCasting {
	
	public static void main(String[] args) {
		Person person = new Student();		// 업 캐스팅
//		System.out.println(person.major);	// 자식 변수 접근 불가
		System.out.println(person.age);
		person.work();
		
		Student student = (Student) person;		// 다운 캐스팅
		// 에러 Studnet student2 = new Person();
		// *업캐스팅을 전제하지 않으면 에러가 발생
		
		
		System.out.println(student.age);
		student.work();
		
	}
	
	
	
}
