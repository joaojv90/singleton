package ec.edu.itsqmet.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "countries")
public class CountriesDTO {

	@Id
	private Integer id;
	private String name, description, code;
	
}
