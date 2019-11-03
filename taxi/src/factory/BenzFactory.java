package factory;

import car.Car;
import car.Benz;

public class BenzFactory implements Factory{
	public Car produceCar() {
		return new Benz();
	}
}