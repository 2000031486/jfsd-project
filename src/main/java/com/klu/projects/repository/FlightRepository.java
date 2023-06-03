package com.klu.projects.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klu.projects.model.Flight;
@Repository
public interface FlightRepository extends CrudRepository<Flight, Integer> {

}
