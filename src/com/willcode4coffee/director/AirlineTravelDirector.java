package com.willcode4coffee.director;

import com.willcode4coffee.builderpattern.Payments;
import com.willcode4coffee.builderpattern.Reservation;
import com.willcode4coffee.builderpattern.TravelReservationBuilder;

public class AirlineTravelDirector {
	
	public static void main(String args[]) { 
		
		
		TravelDirector travelDirector = new TravelDirector();
		Reservation reservation = travelDirector.constructReservation("airline");
		System.out.println("**From the Builder   construct a Airline Reservation Object ** "); 
		System.out.println("                           ");
		System.out.println(reservation.thingsTodo());
		System.out.println("                           ");
		System.out.println("**From the Builder   construct a Airline Payments Accepted Object ** "); 
		System.out.println("                           ");
		 Payments payments = travelDirector.acceptPayments("airline");
		 System.out.println(payments.paymentTypes());
		
	}

}
