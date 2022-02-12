package com.mouritech.springboot.entity;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "flight")
@EntityListeners(AuditingEntityListener.class)
public class Flight {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "flight_id",length = 64)
	private String flightId;
	
	@Column(name="flight_status",unique = true )
	private String flightStatus;
	
	@Column(name="flight_fleet")
	private float flightFleet;
	
	@Column(name="flight_arrivalLoc")
	private String flightArrivalLoc;
	
	@Column(name="flight_departureLoc")
	private String flightDepartureLoc;
	
	@Column(name="flight_fare")
	private int flighFare;
	
	@Column(name="flight_totalseats")
	private int flightTotalSeats;
	
	
	@Column(name="flight_remainingseats")
	private int flightRemainingSeats;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="location_id")
	private Location location;
	
	public Flight() {
		super();
	}
	
	public Flight(String flightId, String flightStatus, float flightFleet, String flightArrivalLoc,
			String flightDepartureLoc, int flighFare, int flightTotalSeats, int flightRemainingSeats) {
		super();
		this.flightId = flightId;
		this.flightStatus = flightStatus;
		this.flightFleet = flightFleet;
		this.flightArrivalLoc = flightArrivalLoc;
		this.flightDepartureLoc = flightDepartureLoc;
		this.flighFare = flighFare;
		this.flightTotalSeats = flightTotalSeats;
		this.flightRemainingSeats = flightRemainingSeats;
	}
	
	
	public Flight(Location location) {
		super();
		this.location = location;
	}

	public String getFlightId() {
		return flightId;
	}


	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}


	public String getFlightStatus() {
		return flightStatus;
	}


	public void setFlightStatus(String flightStatus) {
		this.flightStatus = flightStatus;
	}


	public float getFlightFleet() {
		return flightFleet;
	}


	public void setFlightFleet(float flightFleet) {
		this.flightFleet = flightFleet;
	}


	public String getFlightArrivalLoc() {
		return flightArrivalLoc;
	}


	public void setFlightArrivalLoc(String flightArrivalLoc) {
		this.flightArrivalLoc = flightArrivalLoc;
	}


	public String getFlightDepartureLoc() {
		return flightDepartureLoc;
	}


	public void setFlightDepartureLoc(String flightDepartureLoc) {
		this.flightDepartureLoc = flightDepartureLoc;
	}


	public int getFlighFare() {
		return flighFare;
	}


	public void setFlighFare(int flighFare) {
		this.flighFare = flighFare;
	}


	public int getFlightTotalSeats() {
		return flightTotalSeats;
	}


	public void setFlightTotalSeats(int flightTotalSeats) {
		this.flightTotalSeats = flightTotalSeats;
	}


	public int getFlightRemainingSeats() {
		return flightRemainingSeats;
	}


	public void setFlightRemainingSeats(int flightRemainingSeats) {
		this.flightRemainingSeats = flightRemainingSeats;
	}


	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}

	

	
	

}