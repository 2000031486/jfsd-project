package com.klu.projects.service;

import java.util.List;

import com.klu.projects.model.Flight;


public interface FlightService {
	public List<Flight> viewallflights();

	public Flight addflight(Flight flight);

	
}
