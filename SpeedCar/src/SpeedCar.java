/*
 * Mary wants to model her favorite game, car racing. Create a class named SpeedCar with the following fields: type:

name: String, represents the name of the car
gasCapacity: double, represents the gas tank capacity of the car in gallons
gasEfficiency: double, represents the gas efficiency of the car in miles per gallons
Additionally, create a static field, numCars, that keeps track of the number of speedCar objects being created.

Add the following constructors:

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

public class SpeedCar {

	private String name;
	private double gasCapacity;
	private double gasEfficiency;
	private static double numCar;
	
	
	// constructor.
	public SpeedCar(String name_, double gas_Capacity, double gas_Efficiency) {
		name = name_;
		gasCapacity = gas_Capacity;
		gasEfficiency = gas_Efficiency;
		numCar++;
	}
	
	// create method to get the number of object created
	public double getNumCar() {
		return numCar;
	}
	
	//calculating the maximum distance the car can be driven with a full gas tank
	public double maxDistance() {
		double max_Distance =0;
		
		max_Distance = gasCapacity * gasEfficiency;
		return max_Distance;
	}
}
