/*
 * Mary wants to model her favorite game, car racing. Create a class named SpeedCar with the following fields: type:

name: String, represents the name of the car
gasCapacity: double, represents the gas tank capacity of the car in gallons
gasEfficiency: double, represents the gas efficiency of the car in miles per gallons
Additionally, create a static field, numCars, that keeps track of the number of speedCar objects being created.

Add the following constructors

no argument
copy
custom made with the parameters for name, gasCapacity and gasEfficiency
Add a method named maxDistance with the following header:

Public double maxDistance()

that returns the result of calculating the maximum distance the car can be driven with a full gas tank. 
(Hint: Use gasCapacity and gasEfficiency for this calculation.)

Create a class TestSpeedCar with a main method that creates  instances of SpeedCar objects.

Print the number of SpeedCar created and the average maximum distance of the three SpeedCars.
 * 
 * 
 */
public class TestSpeedCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating 3 SpeedCars object.
		SpeedCar SpCar = new SpeedCar("Mario", 10, 15);
		SpeedCar SpCar1 = new SpeedCar("peach", 11, 14);
		SpeedCar SpCar2 = new SpeedCar("Carrito", 9, 16);
		
		// get the number of instances created from the class
		double numberSpeedCar = SpCar.getNumCar();
		
		// determine the average of the maximum distance
		double averageMax =(SpCar.maxDistance()+SpCar1.maxDistance()+SpCar2.maxDistance())/numberSpeedCar;
		
		/* display the number of instance created and the average of distance */
		System.out.printf("The number of speed car created is %,.2f,\n"
				+ " and the average maximum distance of the three SpeeCar is: %,.2f",numberSpeedCar, averageMax );
		

	}

}
