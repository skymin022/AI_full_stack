package Day07.Ex03_ClassCating;

public class DownCasting {

	public static void main(String[] args) {
		
		// 다운 캐스팅(강제 형 변환)
		// * 전제조건 : 업캐스팅
		// - 다운 캐스팅은 업 캐스팅된 부모 객체를 자식 객체로 변횐하는 것
		// - 업 캐스팅 : (부모) <- (자식)
		// - 다운 캐스팅 : (자식) <- (부모)
		
		// 업 캐스팅 시도
		Person person = new Studnet("김조은", 20, 1, "컴공");
		System.out.println(person);
		System.out.println(person.work());
		
		// 다운 캐스팅
		Studnet studnet = (Studnet) person;
		System.out.println(studnet);
		System.out.println(studnet.work());
		System.out.println("grade : " + studnet.grade);
		System.out.println("major : " + studnet.major);
		
	}
	
	
}
