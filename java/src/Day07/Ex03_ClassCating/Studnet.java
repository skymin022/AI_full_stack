package Day07.Ex03_ClassCating;

public class Studnet extends Person{

	int grade;
	String major;
	
	public Studnet() {
		
	}

	public Studnet(String name, int age, int grade, String major) {
		super(name,age);
		this.grade = grade;
		this.major = major;
	}

	
	@Override
	public String work() {
		return "공부를 합니다";
	}

	//getter, setter
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	// toString
	@Override
	public String toString() {
		return "Studnet [grade=" + grade + ", major=" + major + "]";
	}
	
	
	
	
	
}
