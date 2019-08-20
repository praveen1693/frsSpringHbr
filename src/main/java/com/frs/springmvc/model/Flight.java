package com.frs.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="FLIGHT")
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty
	@Column(name = "FLIGHTID", unique=true, nullable = false)
	private String flightId;
	
	@Size(min=3, max=20)
	@Column(name = "FLIGHTNAME", nullable = false)
	private String flightName;
	
	@Min(1)
	@Column(name = "SEATINGCAP", nullable = false)
	private int seatingCap;
	
	@Min(1)
	@Column(name = "RESERVECAP", nullable = false)
	private int reserveCap;

	@Override
	public String toString() {
		return "Flight [id=" + id + ", flightId=" + flightId + ", flightName=" + flightName + ", seatingCap="
				+ seatingCap + ", reserveCap=" + reserveCap + "]";
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public int getSeatingCap() {
		return seatingCap;
	}

	public int getId() {
		return id;
	}

	public void setSeatingCap(int seatingCap) {
		this.seatingCap = seatingCap;
	}

	public int getReserveCap() {
		return reserveCap;
	}

	public void setReserveCap(int reserveCap) {
		this.reserveCap = reserveCap;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
