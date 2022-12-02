package ec.edu.itsqmet.factory;

public class CarFactory {
	
	public static Car newCar(String carType) {
		if (carType.equals("Nissan")) {
			return new Nissan();
		} 
		if (carType.equals("Toyota")) {
			return new Toyota();
		}
		if (carType.equals("Honda")) {
			return new Honda();
		}
		return null;
	}

}
