package _05;

public class User {

	private String name, libraryCard;

	public User(String name, String libraryCard) {
		this.name = name;
		this.libraryCard = libraryCard;
	}
	
	public String getLibraryCard() {
		return this.libraryCard;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", libraryCard=" + libraryCard + "]";
	}
	
	
}
