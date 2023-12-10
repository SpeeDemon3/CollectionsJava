package _05;

public class Book {

	private String title, isbn;
	private int price;
	
		
	public Book(String isbn) {
		super();
		this.isbn = isbn;
	}

	public Book(String title, String isbn, int price) {
		this.title = title;
		this.isbn = isbn;
		this.price = price;
	}

	public String getTitle() {
		return this.title;
	}

	public String getIsbn() {
		return this.isbn;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + ", price=" + price + "]";
	}
	
	
}
