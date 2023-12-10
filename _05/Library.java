package _05;

import java.util.HashSet;

public class Library {

	private String name;
	HashSet<Book> books;
	
	public Library(String name) {
		this.name = name;
		books = new HashSet<Book>();
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void removeBook(Book book) {
		books.remove(book);
	}
	
	public boolean searchBook(String isbn ) {
		
		boolean result = false;
		
		for (Book book : books) {
			
			if (book.getIsbn().equals(isbn)) {
				result = true;
				System.out.println("Book exists ;-)");
			}
			
		}
		
		return result;
		
	}
	
	public String showTitles() {
		
		StringBuilder sb = new StringBuilder();
		
		for (Book book : books) {
			sb.append("\t-" + book.getTitle() + "\n");
		}
		
		return sb.toString();
		
	}
	
}
