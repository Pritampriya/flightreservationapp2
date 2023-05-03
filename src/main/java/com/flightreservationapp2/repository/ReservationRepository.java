package com.flightreservationapp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightreservationapp2.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
