package Ex02;

public class Book {

	private String isbn;
	private String title;
	private String writer;
	private String content;
	private int price;
	
	
	// 기본 생성자
	public Book() {
	}

	// 매개변수 생성자
	public Book(String isbn, String title, String writer, String content, int price) {
		this.isbn = isbn;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 오버로딩
	@Override
	public String toString() {
		return isbn +" | "+ title + " | " + writer + " | " + content + " | "+ price;
	}
	
	
	
}
