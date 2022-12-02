package ec.edu.itsqmet.factory;

public class CarFactory {
	
	public static Car newCar(CarType carType) {
		if (carType.compareTo(NISSAN)) {
			return new Nissan();
		} 
		if (toyota.equals("Toyota")) {
			return new Toyota();
		}
		if (honda.equals("Honda")) {
			return new Honda();
		}
		return null;
	}

}
