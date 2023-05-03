package com.flightreservationapp2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEntity {
private boolean checkrdin;
private int numberofBags;
@OneToOne
private Passenger passenger;
@OneToOne
private Flight Flight;
public boolean isCheckrdin() {
	return checkrdin;
}
public void setCheckrdin(boolean checkrdin) {
	this.checkrdin = checkrdin;
}
public int getNumberofBags() {
	return numberofBags;
}
public void setNumberofBags(int numberofBags) {
	this.numberofBags = numberofBags;
}
public Passenger getPassenger() {
	return passenger;
}
public void setPassenger(Passenger passenger) {
	this.passenger = passenger;
}
public Flight getFlight() {
	return Flight;
}
public void setFlight(Flight Flight) {
	this.Flight = Flight;
}

}
