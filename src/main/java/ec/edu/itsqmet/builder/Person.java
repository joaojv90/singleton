package ec.edu.itsqmet.builder;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Builder
//@Getter
//@Setter
@Data
public class Person {
	
	private String name, lastName, address, phone;
	private LocalDate birthDate;
	@Getter
	private double weight;
	private SeniorityLevel seniorityLevel;
	
	
//	public Person(String name, String lastName, String address, String phone, LocalDate birthDate, double weight,
//			SeniorityLevel seniorityLevel) {
//		super();
//		this.name = name;
//		this.lastName = lastName;
//		this.address = address;
//		this.phone = phone;
//		this.birthDate = birthDate;
//		this.weight = weight;
//		this.seniorityLevel = seniorityLevel;
//	}
	
//	public Person(String name, String lastName) {
//		super();
//		this.name = name;
//		this.lastName = lastName;		
//	}
	
}
