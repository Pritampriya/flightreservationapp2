<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>
<h2>Flight Details</h2>
Flight Number:${flight.flightNumber}<br>
Operating Airline:${flight.OperatingAirline}<br>

Departure City:${flight.DepartureCity}<br>
Arrival City:${flight.ArrivalCity}<br>
 Departure Date:${flight.dateofDeparture}<br>
 
 
 <h2>ENter Passenger Details</h2>
 <form action="CompleteReservation" method="post">
 <pre>
      first name<input type="text" name="firstName"/>
      last name<input type="text" name="lasttName"/>
      middle name<input type="text" name="middleName"/>
	  email<input type="text" name="email"/>
	  phone<input type="text" name="phone"/>
	  <input type="hidden" name="flightId" value="${flight.id }"/>
	  <h2>Enter the Payment details</h2>
	  Name On The Card<input type="text" name="NameOfTheCard"/>
	  	  Card Number<input type="text" name="CardNumber"/>
	  	  Expiry Date<input type="text" name="ExpiryDate"/>	  
	  	  Cvv<input type="text" name="Cvv"/>
	  <input type="submit" value="complete reservation"/>
	</pre>
 
 
 
 </form>
 </body>
</html>