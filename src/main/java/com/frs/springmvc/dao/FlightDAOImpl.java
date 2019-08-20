package com.frs.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.frs.springmvc.model.Flight;


@Repository("flightDao")
public class FlightDAOImpl extends AbstractDao<Integer, Flight> implements FlightDAO{

	@Override
	public void addFlight(Flight flight) {
		persist(flight);
		
	}

	@SuppressWarnings("unchecked")
	public List<Flight> findAllFlights() {
		Criteria criteria = createEntityCriteria();
		return (List<Flight>) criteria.list();
		
	}

	@Override
	public void deleteFlightById(String fid) {
		Query query = getSession().createSQLQuery("delete from Flight where flightid = :fid");
		query.setString("fid", fid);
		query.executeUpdate();
		
	}

	@Override
	public Flight findById(int id) {
		return getByKey(id);
	}

	@Override
	public Flight findFlightByFid(String fid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("flightId", fid));
		return (Flight) criteria.uniqueResult();
	}

}
