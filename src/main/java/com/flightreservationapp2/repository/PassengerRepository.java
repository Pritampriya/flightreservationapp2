package com.flightreservationapp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightreservationapp2.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}