package com.flightreservationapp2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightreservationapp2.controller.Usercontroller.Flight;
import com.flightreservationapp2.dto.ReservationRequest;
import com.flightreservationapp2.entity.Passenger;
import com.flightreservationapp2.entity.Reservation;
import com.flightreservationapp2.repository.FlightRepository;
import com.flightreservationapp2.repository.PassengerRepository;
import com.flightreservationapp2.repository.ReservationRepository;
@Service
public class ReservationServiceimpl implements ReservationService {
@Autowired
private PassengerRepository passengerRepo;

@Autowired
private FlightRepository FlightRepo;

@Autowired
private ReservationRepository reservationRepo;

	@Override
	public Reservation bookFlight(ReservationRequest request) {

		
		
		
		Passenger passenger=new Passenger();
		passenger.setFirstName(request.getFirstName());
		passenger.setLasttName(request.getLasttName());
		passenger.setMiddleName(request.getMiddleName());
		passenger.setEmail(request.getEmail());
		passenger.setPhone(request.getPhone());
		passengerRepo.save(passenger);
		
		long flightId = request.getFlightId();
		Optional<Passenger> findById = passengerRepo.findById(flightId);
		Passenger passenger2 = findById.get();
		
		Reservation reservation=new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(passenger);
		reservation.setCheckrdin(false);
		reservation.setNumberofBags(0);
		
		reservationRepo.save(reservation);
		return  reservation;
		
	}

}
