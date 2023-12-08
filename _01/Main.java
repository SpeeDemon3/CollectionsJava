package _01;
/**
 * @author Antonio Ruiz Benito -> SpeedDemoN
 * program main class
 */
public class Main {

	public static void main(String[] args) {

		Team team = new Team("Real Madrid", 2023, 10_000_000.33);
		
		Player zidane = new Player("Zidane", "Forward", 5);
		Player cr7 = new Player("C.Ronaldo", "Forward", 7);
		Player benzema = new Player("Benzema", "Forward", 9);
				
		team.addPlayer(zidane);
		team.addPlayer(cr7);
		team.addPlayer(benzema);
		
		System.out.println(team.showPlayers());
		System.out.println(zidane.toString());
		System.out.println(cr7.toString());
		System.out.println(benzema.toString());


	}

}
