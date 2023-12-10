package _06;

import java.util.Random;

public class Car {

	private String plate, model;
	private float price;
	
	public Car(String plate, String model, float price) {
		this.plate = plate;
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [plate=" + plate + ", model=" + model + ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			
			Car car = (Car) obj;
			
			if (car.plate.equals(this.plate)) {
				
				return true;
				
			}
		}
		
		return false;
	
	}
	
	@Override
	public int hashCode() {
		return this.plate.hashCode();
	}
	
	public int run() {
		
		Random random = new Random();
		
		int randomNumber = random.nextInt(6);
		
		return randomNumber;
	}
	
}
