package com.willcode4coffee.director;

import com.willcode4coffee.builderpattern.Payments;
import com.willcode4coffee.builderpattern.Reservation;
import com.willcode4coffee.builderpattern.TravelReservationBuilder;

public class TravelDirector {
	
	
	
	public Reservation constructReservation(String reservationType) { 
		TravelReservationBuilder builder = new TravelReservationBuilder();
		Reservation reservation = builder.createReservation(reservationType);
		return reservation;
	}

	

	public Payments acceptPayments(String reservationType) { 
		
		TravelReservationBuilder builder = new TravelReservationBuilder();
		Payments reservationPayments = builder.acceptPayment(reservationType);
		return reservationPayments;
	}
	
}
