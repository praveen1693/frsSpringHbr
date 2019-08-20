package com.frs.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frs.springmvc.dao.FlightDAO;
import com.frs.springmvc.dao.UserDAO;
import com.frs.springmvc.model.Flight;
import com.frs.springmvc.model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO dao;
	
	@Autowired
	private FlightDAO dao1;
	
	@Override
	public void saveUser(User user) {
		dao.saveUser(user);
		
	}

	@Override
	public void addFlight(Flight flight) {
		dao1.addFlight(flight);
		
	}

	@Override
	public List<Flight> findAllFlights() {
		return dao1.findAllFlights();
	}

	@Override
	public void deleteFlightById(String fid) {
		dao1.deleteFlightById(fid);
		
	}

	@Override
	public Flight findById(int id) {
		return dao1.findById(id);
	}

	@Override
	public void updateFlight(Flight flight) {
		Flight entity = dao1.findFlightByFid(flight.getFlightId());
		System.out.println("SELECTED FLIGHT ID " + flight.getFlightId());
		if(entity!=null){
			entity.setFlightName(flight.getFlightName());
			entity.setSeatingCap(flight.getSeatingCap());
			entity.setReserveCap(flight.getReserveCap());
			entity.setFlightId(flight.getFlightId());
		}
	}

	@Override
	public Flight findFlightByFid(String fid) {
		return dao1.findFlightByFid(fid);
	}

	
}
