package _06;

import java.util.HashSet;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {

		Car car1 = new Car("1111AAA", "Seat Leon Cupra", 42_000.33F);
		Car car2 = new Car("2222BBB", "Audi TT Quatro", 55_000.4F);
		Car car3 = new Car("3333CCC", "Tesla Model 3", 60_000);
		Car car4 = new Car("4444DDD", "Renault Megane GT", 33_330.22F);
		Car car5 = new Car("5555EEE", "Mercedes 500 AMG", 100_000.99F);
		Car car6 = new Car("6666FFF", "Nissan GTR", 99_000.55F);
		
		HashSet<Car> teamSpeedCars = new HashSet<Car>();
		teamSpeedCars.add(car1);
		teamSpeedCars.add(car2);
		teamSpeedCars.add(car3);
		
		Vector<Integer> numberCarsSpeed = new Vector<Integer>();
		
		HashSet<Car> teamCorollaCars = new HashSet<Car>();
		teamSpeedCars.add(car4);
		teamSpeedCars.add(car5);
		teamSpeedCars.add(car6);
		
		Vector<Integer> numberCarsCorolla = new Vector<Integer>();
		
		Country spain = new Country("SP", "Spain", "Madrid");
		Country usa = new Country("USA", "United State", "New York");
		
				
		Team speedDemon = new Team("Speed Demon 3 Team", spain, numberCarsSpeed, teamSpeedCars); 
		Team areCorolla = new Team("Are Corolla Team", usa, numberCarsCorolla, teamCorollaCars);
		
		Race gp = new Race("GP Spain");
		gp.addTeams(speedDemon);
		gp.addTeams(areCorolla);
		
		
		gp.run();
		
		System.out.println(gp.showTeams());
		
	}

}
