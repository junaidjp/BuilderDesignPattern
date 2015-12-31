package com.willcode4coffee.builderpattern;

public interface ReservationBuilder {
	
	  //Itinerary   getItinerary();
	
	
	public Reservation createReservation(String reservationType);
	
	public  Payments acceptPayment(String reservationType);
	

}
