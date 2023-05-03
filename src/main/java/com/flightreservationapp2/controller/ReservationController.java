package com.flightreservationapp2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flightreservationapp2.dto.ReservationRequest;
import com.flightreservationapp2.entity.Reservation;
import com.flightreservationapp2.service.ReservationService;

@Controller
public class ReservationController {
	@Autowired
	 private ReservationService reservationService;
	
	@RequestMapping("/ConfirmReservation")
	public String ConfirmReservation(ReservationRequest request,ModelMap modelMap) {
		
		Reservation bookFlightId= reservationService.bookFlight(request);
		modelMap.addAttribute("bookFlightId", bookFlightId);
		//System.out.println(reservation);
		
		
		return"confirmReservation";
	}
}
