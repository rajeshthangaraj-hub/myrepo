package week1.day3;

public class Bike extends Car{

	public static void main(String[] args) {
		/*
		 * -Create another class as Bike
-Call the methods of Car class in BikeClass by creating object for Car class and Bike Class
Hint Create two objects for the two classes
	 */
		
		Car objCar = new Car();
		Bike objBike = new Bike();
		
		objCar.applyBreak();
		objBike.soundHorn();
		
		

	}

}
