package ec.edu.itsqmet.singleton;

import ec.edu.itsqmet.repository.ICountriesRepository;

public class CountrySingleton {
	
	private static CountrySingleton instance;
	private static long totalContries;
	private CountrySingleton() {	
	}
	
	public static CountrySingleton getInstance() {
		if (instance == null) {
			instance = new CountrySingleton();
			System.out.println("creando instancia");
		}
		return instance;
	}
	
	public static long getTotalContries(ICountriesRepository contryRepository) {
		if (totalContries == 0) {
			totalContries = contryRepository.count();
		}
		return totalContries;
	}

}
