package _02;

import java.util.Random;
import java.util.Vector;
/**
 * class that represents a French deck
 */
public class Deck {
	
	private Vector<Card> cards = new Vector<Card>();
    String[] suitsOfTheDeck = {"Corazones", "Diamantes", "Tréboles", "Picas"};
    String[] cardsOfTheDeck = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jota", "Reina", "Rey", "As"};
	
	public Deck() {
		loadDeck();
	}

	/**
	 * method to add cards to the vector from 2 arrays
	 */
	private void loadDeck() {
		
		int count = 0;
		
		for (int i = 0; i < suitsOfTheDeck.length; i++) {
			for (int j = 0; j < cardsOfTheDeck.length; j++) {
				Card card = new Card(suitsOfTheDeck[i], cardsOfTheDeck[j], count++);
				cards.addElement(card);
				
			}
			
		}
		
		
	}
	
	/**
	 * method of shuffling cards
	 */
	public Vector<Card> shuffle() {
		
		Vector<Card> cardsPlayer = new Vector<Card>();
		
		for (int i = 0; i < 13; i++) {
			
			// Create a Random object
			Random random = new Random();
			
			// Get a random index
			int randomIndex = random.nextInt(cards.size());
			
			// Access the corresponding value in the vector
			Card valueIndex = cards.get(randomIndex);
			
			cardsPlayer.add(valueIndex);
			
		}
		
		return cardsPlayer;	
		
	}
	
	/**
	 * method to display a player's cards on the console
	 * @param vector -> collections of cards
	 */
	public void showCards(Vector<Card> vector) {
		
		for (Card card: vector) {
			System.out.println("\t" + card);
		}
		
	}
	
	
}
