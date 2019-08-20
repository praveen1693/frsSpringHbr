package com.frs.springmvc.service;

import java.util.List;

import com.frs.springmvc.model.Flight;
import com.frs.springmvc.model.User;

public interface UserService {

	void saveUser(User user);
	
	void addFlight(Flight flight);
	
	List<Flight> findAllFlights();
	
	public void deleteFlightById(String fid);
	
	Flight findById(int id);
	
	void updateFlight(Flight flight);
	
	Flight findFlightByFid(String fid);
}
