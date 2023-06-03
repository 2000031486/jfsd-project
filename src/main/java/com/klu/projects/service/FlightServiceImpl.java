package com.klu.projects.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.projects.model.Flight;

import com.klu.projects.repository.FlightRepository;
@Service
public class FlightServiceImpl implements FlightService{
    @Autowired 
    private FlightRepository flightRepository;
	
	public List<Flight> viewallflights() {
		// TODO Auto-generated method stub
		return (List<Flight>) flightRepository.findAll();
	}

	@Override
	public Flight addflight(Flight flight) {
		return flightRepository.save(flight);
		
	}



}
