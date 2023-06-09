package com.flightreservationapp2.entity;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.Entity;

@Entity
public class Flight extends AbstractEntity {
	
	private String flightNumber;
	private String OperatingAirline;
	private String departureCity;
	private String arrivalCity;
	private Date dateofDeparture;
	private Timestamp estimatedDepartureTime;
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOperatingAirline() {
		return OperatingAirline;
	}
	public void setOperatingAirline(String operatingAirline) {
		OperatingAirline = operatingAirline;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public Date getDateofDeparture() {
		return dateofDeparture;
	}
	public void setDateofDeparture(Date dateofDeparture) {
		this.dateofDeparture = dateofDeparture;
	}
	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}
	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
}
