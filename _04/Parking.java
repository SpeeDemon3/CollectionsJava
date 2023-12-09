package _04;

import java.util.Enumeration;
import java.util.Hashtable;
/**
 * Class that represents a car parking
 */
public class Parking {

	private String name;
	private int capacity;
	Hashtable<String, Car> places;
	
	public Parking (String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
		places = new Hashtable<String, Car>();
	}
	
	public void addCar(Car c) {
		// Check if the parking lot is full by comparing the current size with the maximum capacity
		if (places.size() == this.capacity) {
			
			System.out.println("The parking lot is full!!!");
			
		} else {
			// Add the car to the parking lot using the license plate number as a key
			places.put(c.getPlate(), c);

		}
		
	}
	
	/**
	 * Method to find a car by its license plate
	 * @param plate
	 * @return object Car
	 */
	public Car searchCar(String plate) {
		// Get an enumeration of the keys
		Enumeration<String> list = places.keys();
		
		// Iterate through the keys
		while(list.hasMoreElements()) {
		
			// Get the current key
			String key = list.nextElement();
			
			// Get the value associated with the key (a Car object)
			Car value = places.get(key);
			
			// Compare the provided license plate number with the license plate number of the current car
			if (plate == value.getPlate()) {
				// If the plates match, print information about the vehicle and return it
				System.out.println("Vehicle found:\n" + value.toString());
				
				return value;
				
			}
			
		}
		
		return null;
	
	}
	
	/**
	 * Method to eliminate a car by its license plate
	 * @param plate
	 */
	public void removeCar(String plate) {
		
		Enumeration<String> list = places.keys();

		while(list.hasMoreElements()) {
			
			String key = list.nextElement();
			
			Car value = places.get(key);
			// Compare the provided license plate number with the license plate number of the current car
			if (plate == value.getPlate()) {
				// If the plates match, remove the car from the parking lot
				places.remove(key);
				
			}
			
		}
		
	}
	
	/**
	 * Method to show all the cars in the parking lot
	 */
	public void showAll() {
		
		Enumeration<String> list = places.keys();
		
		while(list.hasMoreElements()) {
			
			String key = list.nextElement();
			
			Car value = places.get(key);
			
			System.out.println(value);
			
		}
		
	}
	
	
}
