package ec.edu.itsqmet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.itsqmet.dto.CountriesDTO;

public interface ICountriesRepository extends JpaRepository<CountriesDTO, Integer>{

}