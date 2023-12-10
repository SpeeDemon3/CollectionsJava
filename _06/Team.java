package _06;

import java.util.HashSet;
import java.util.Random;
import java.util.Vector;

public class Team {

	private String name;
	private Country country;
	
	Vector<Integer> driverNumbers = new Vector<Integer>();
	HashSet<Car> cars = new HashSet<Car>();
	
	public Team(String name, Country country, Vector<Integer> driverNumbers, HashSet<Car> cars) {
		this.name = name;
		this.country = country;
		this.driverNumbers = driverNumbers;
		this.cars = cars;
		
		generateDriverNumbers();
		
	}

	private void generateDriverNumbers() {

		Random random = new Random();
		
		int randomNumber = random.nextInt(20);
		
		for (int i = 0; i < 3; i++) {
			
			driverNumbers.add(randomNumber);
			
		}
		
	}
	
	public void addCar(Car car) {
		cars.add(car);
	}
	
	public String showCars() {
		
		StringBuilder sb = new StringBuilder();
		
		for (Car car : cars) {
			System.out.println(car.toString());
			
			sb.append(car.toString() + "\n");
			
		}
		
		return sb.toString();
		
	}
	
	public Country getCountry() {
		return this.country;
	}
	
	public HashSet<Car> getCars() {
		return this.cars;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + ", country=" + country + ", driverNumbers=" + driverNumbers + ", cars=" + cars
				+ "]";
	}
	
	
	
}
