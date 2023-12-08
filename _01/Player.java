package _01;
/**
 * Class to represent a player on a team
 */
public class Player {
	
	// attributes
	private String name;
	private String position;
	int number;
	
	// constructor
	public Player(String name, String position, int number) {
		this.name = name;
		this.position = position;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", position=" + position + ", number=" + number + "]";
	}
	
	

}
