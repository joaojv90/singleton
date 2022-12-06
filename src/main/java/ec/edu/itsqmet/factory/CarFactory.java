package ec.edu.itsqmet.factory;

public class CarFactory {
	
	public static Car newCar(CarType carType) {
		if (carType.equals(CarType.NISSAN)) {
			return new Nissan();
		} 
		if (carType.equals(CarType.TOYOTA)) {
			return new Toyota();
		}
		if (carType.equals(CarType.HONDA)) {
			return new Honda();
		}
		return null;
	}

}
