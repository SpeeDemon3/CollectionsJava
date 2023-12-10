package _05;

import java.util.Hashtable;
import java.util.Map;

public class Checkout {

	Hashtable<String, Book> checkouts;
	
	public Checkout() {
		checkouts = new Hashtable<String, Book>();
	}
	
	public void add(User user, Book book) {
		
		checkouts.put(user.getLibraryCard(), book);
		
	}
	
	public Book getCheckoutByUser(User user) {
		
		for (String key : checkouts.keySet()) {
			
			Book value = checkouts.get(key);
			
			if (key.equals(user.getLibraryCard())) {
				
				return value;
				
			}
			
		}
		
		return null;
		
	}

	
}
