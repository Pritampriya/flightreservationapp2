package com.flightreservationapp2.service;



import com.flightreservationapp2.dto.ReservationRequest;
import com.flightreservationapp2.entity.Reservation;

public interface ReservationService {
	Reservation bookFlight (ReservationRequest request) ;

}
