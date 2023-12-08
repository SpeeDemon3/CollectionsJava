package _02;
/**
 * @author Antonio Ruiz Benito -> SpeedDemoN
 */
public class Main {

	public static void main(String[] args) {

		Deck deck = new Deck();
		
		System.out.println("-------------------------------");
		
		System.out.println("\nPlayer Cards:");
		
		deck.showCards(deck.shuffle());
		
	}

}
