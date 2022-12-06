package ec.edu.itsqmet;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.itsqmet.builder.Person;
import ec.edu.itsqmet.builder.SeniorityLevel;
import ec.edu.itsqmet.factory.Car;
import ec.edu.itsqmet.factory.CarFactory;
import ec.edu.itsqmet.factory.CarType;
import ec.edu.itsqmet.repository.ICountriesRepository;
import ec.edu.itsqmet.singleton.CountrySingleton;

@SpringBootTest
class SingletonApplicationTests {
	
	int count=0;
	
	@Autowired
	private ICountriesRepository countryRepository;

	//@Test
	void contextLoads() {
		//countryRepository.count();
		
		
		//assertEquals(3, countryRepository.count());
		
		for (int i=0; i <= 499; i++) {
			System.out.println(CountrySingleton.getTotalContries(countryRepository));
			count++;
			System.out.print(count + " ");
		}
		//System.out.println("instancia 1" + CountrySingleton.getInstance());
		//System.out.println(CountrySingleton.getTotalContries(countryRepository));
		//CountrySingleton.getInstance();
		
	}
	
	//@Test
	void testingFactory() {
		//Car car = new Car(); no se puede instanciar las clases abstractas
		//en los métodos estáticos no se necesita instanciar para poder utilizarlo
		//CarFactory cf = new CarFactory();
//		Car ns80 = CarFactory.newCar("Nissan");
//		ns80.setYear(1980);
//		System.out.println("Nissan de "+ns80.getYear()+" " + ns80.maxSpeed());
//		
//		Car ty91 = CarFactory.newCar("Toyota");
//		ty91.setYear(1991);
//		System.out.println("Nissan de "+ty91.getYear()+" " + ty91.maxSpeed());
		
		Car ns80 = CarFactory.newCar(CarType.NISSAN);
		ns80.setYear(1980);
		System.out.println("Nissan de "+ns80.getYear()+" " + ns80.maxSpeed());
		
	}
	
	@Test
	void testingBuilder () {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");   
		String date = "07/02/1990";   
		//convert String to LocalDate   
		LocalDate localDate = LocalDate.parse(date, formatter);
		Person person = new Person("Joao", "Jaramillo", "Ciudad Jardin", "0999126808", localDate, 93.5, SeniorityLevel.SENIOR);
	}

}