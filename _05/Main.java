package _05;

public class Main {

	public static void main(String[] args) {

		Book dragonBall = new Book("Goku VS Piccolo", "123", 30);
		Book dragonBallZ = new Book("Goku VS Freezer", "123", 35);
		Book onePiece = new Book("Luffy", "333", 20);
		
		Library animes = new Library("Animes");
		
		animes.addBook(dragonBall);
		animes.addBook(dragonBallZ);
		animes.addBook(onePiece);

		animes.searchBook("123");
		
		System.out.println("___________________________________");
		
		System.out.println(animes.showTitles());
		
		animes.removeBook(dragonBall);
		
		System.out.println("___________________________________");
		
		System.out.println(animes.showTitles());
		
		System.out.println("___________________________________");

		
		User antonio = new User("Antonio", "333");
		User patricia = new User("Patricia", "444");
		User arya = new User("Arya", "222");
		
		Checkout rentsBook = new Checkout();
		
		boolean existsBook = animes.searchBook("333");
		
		if (existsBook) {
			rentsBook.add(antonio, onePiece);
			System.out.println("rented book correctly");
		} else {
			System.out.println("This book does not exits!!!");
		}
		
		Book rent = rentsBook.getCheckoutByUser(antonio);
		System.out.println(rent.toString());
		
		
	}

}
