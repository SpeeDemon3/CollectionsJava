package _04;
/**
 * Class that represents a car
 */
public class Car {

	private String plate, model, color;

	public Car(String plate, String model, String color) {
		this.plate = plate;
		this.model = model;
		this.color = color;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [plate=" + plate + ", model=" + model + ", color=" + color + "]";
	}
	
	
	
}
