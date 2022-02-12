package com.mouritech.springboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.springboot.entity.Flight;


@Repository
public interface FlightRepository extends JpaRepository<Flight, Long>{

	List<Flight> findByLocation_locationId(Long locationId);
	Optional<Flight> findByFlightIdAndLocation_LocationId(String flightId, Long locationId);
	

}