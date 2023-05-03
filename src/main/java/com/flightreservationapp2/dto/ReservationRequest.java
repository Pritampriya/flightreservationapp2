 package com.flightreservationapp2.dto;

public class ReservationRequest {
private long flightId;
private String firstName;
private String lasttName;
private String middleName;
private String email;
private String phone;
private String CardNumber;
private String CardHolderName;
private String expirationDate;
private String CvvCode;
public long getFlightId() {
	return flightId;
}
public void setFlightId(long flightId) {
	this.flightId = flightId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLasttName() {
	return lasttName;
}
public void setLasttName(String lasttName) {
	this.lasttName = lasttName;
}
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getCardNumber() {
	return CardNumber;
}
public void setCardNumber(String cardNumber) {
	CardNumber = cardNumber;
}
public String getCardHolderName() {
	return CardHolderName;
}
public void setCardHolderName(String cardHolderName) {
	CardHolderName = cardHolderName;
}
public String getExpirationDate() {
	return expirationDate;
}
public void setExpirationDate(String expirationDate) {
	this.expirationDate = expirationDate;
}
public String getCvvCode() {
	return CvvCode;
}
public void setCvvCode(String cvvCode) {
	CvvCode = cvvCode;
}

}
