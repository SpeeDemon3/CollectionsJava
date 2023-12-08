package _01;

import java.util.Vector;
/**
 * class that represents a team
 */
public class Team {
	// attributes
	private String name;
	private int foundationYear;
	private double budget;
	private Vector<Player> vector = new Vector<Player>();
	
	public Team(String name, int foundationYear, double budget) {
		this.name = name;
		this.foundationYear = foundationYear;
		this.budget = budget;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFoundationYear() {
		return foundationYear;
	}

	public void setFoundationYear(int foundationYear) {
		this.foundationYear = foundationYear;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public void addPlayer(Player player) {
		vector.add(player);
	}
	
	public String showPlayers() {
		
		return "[name] -> " + this.name + " [foundationYear] -> " + this.foundationYear + " [budget] -> " + this.budget;
		
	}
	
}
