package _04;
/**
 * @author Antonio Ruiz Benito -> SpeedDemoN
 * Program main class
 */
public class Main {

	public static void main(String[] args) {

		Parking parking = new Parking("ARE", 3);
		
		Car audi = new Car("1111DDD", "tt", "black");
		Car seat = new Car("3333CDC", "leon", "white");
		Car mercedes = new Car("2222MMM", "cls", "dark blue");
		Car jeep = new Car("0000PPP", "renegade", "green");
		Car opel = new Car("2134ÑÑÑ", "corsa", "pink");
		Car volvo = new Car("5555LLL", "c30", "orange");

		
		parking.addCar(audi);
		parking.addCar(seat);
		parking.addCar(mercedes);
		parking.addCar(opel);
		parking.addCar(volvo);
		parking.addCar(jeep);
		
		parking.showAll();
		
		System.out.println("--------------------------------------");
		
		parking.searchCar("3333CDC");
		
		System.out.println("--------------------------------------");
		
		parking.removeCar("3333CDC");
		
		parking.showAll();
		
	}

}
