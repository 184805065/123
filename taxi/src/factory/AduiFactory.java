package factory;
import car.Car;
import car.Audi;
public class AduiFactory implements Factory{
	public Car produceCar() {
		return new Audi();
	}
}
