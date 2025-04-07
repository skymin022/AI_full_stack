package Ex02;

import java.util.ArrayList;
import java.util.List;

public class Library {

	public static void main(String[] args) {
		
		// 컬렉션 
		List<Book> bookList = new ArrayList<Book>();
		
		// 객체 생성 및 컬랙션에 추가
		bookList.add(new Book("123123", "이게자바냐", "김자바", "자바 김자바", 33000));
		bookList.add(new Book("112112", "정보처리기사", "김조은", "국가기술자격", 45000));
		bookList.add(new Book("001001", "실무DB", "박디비", "디비디비딥", 60000));
		
		// 출력
		System.out.println("########## 조은 스터디 도서관 ##########");
		for (Book book : bookList) {
			System.out.println(book);
		}
		
	}
}
