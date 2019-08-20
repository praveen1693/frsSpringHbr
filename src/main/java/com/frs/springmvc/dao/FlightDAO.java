package com.frs.springmvc.dao;

import java.util.List;

import com.frs.springmvc.model.Flight;



public interface FlightDAO {

	void addFlight(Flight flight);
	
	List<Flight> findAllFlights();
	
	void deleteFlightById(String fid);
	
	Flight findById(int id);
	
	Flight findFlightByFid(String fid);
}
