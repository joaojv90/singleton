package ec.edu.itsqmet.factory;

public abstract class Car {
	
	private int year;
	
	public int getYear() {
		return year;
	}
	
	public int setYear(int year) {
		return this.year=year;
	}
	
	public String maxSpeed() {
		return "km 0";
	}

}
