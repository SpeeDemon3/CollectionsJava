package _06;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class Race {

	private String description;
	
	Hashtable<Team, Integer> teams = new Hashtable<Team, Integer>();

	public Race(String description) {
		this.description = description;
	}
	
	public void run() {
		
		Integer count = 0;
		
		Enumeration<Team> list = teams.keys();
		
		ArrayList<Car> cars = new ArrayList<Car>();
		
		while (list.hasMoreElements()) {
			
			Team key = list.nextElement();
			Integer distance = teams.get(key);
		
			cars.addAll(key.getCars());
						
		}
		
		for (Car c : cars) {
						
			count += c.run();
			
		}
		
		
	}
	
	public void addTeams(Team team) {
		
		teams.put(team, 0);
		
	}
	
	public String description() {
		return this.description;
	}
	
	public String showTeams() {
		
		StringBuilder sb = new StringBuilder();
		
		Enumeration<Team> list = teams.keys();
		
		while (list.hasMoreElements()) {
			
			Team key = list.nextElement();
			Integer distance = teams.get(key);
						
			sb.append(key.toString() + " - " + distance + "\n");
			
			System.out.println(sb.toString());
			
		}
		
		return sb.toString();
		
	}

	@Override
	public String toString() {
		return "Race [description=" + description + ", teams=" + teams + "]";
	}
	
	
	
}
