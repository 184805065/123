package factory;
import car.Car;
import car.BMW;
public class BMWFactory implements Factory{
	public Car produceCar() {
		return new BMW();
	}
}
