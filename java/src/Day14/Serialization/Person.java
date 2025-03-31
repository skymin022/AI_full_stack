package Day14.Serialization;

import java.io.Serializable;

/*
 * 직렬화 
 * * Serializable 인터페이스를 구현해야 직렬화 객체를 정의할 수 있다.
 * 
 */
public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String name;
	private int age;
	// 변수 추가 시 직렬화, 역직렬화의 버전이 변경됨
	
	
	// 생성자
	public Person() {
	}
	

	// 매개변수 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
