package com.willcode4coffee.director;

import com.willcode4coffee.builderpattern.Payments;
import com.willcode4coffee.builderpattern.Reservation;
import com.willcode4coffee.builderpattern.TravelReservationBuilder;

public class BusTravelDirector {
	
public static void main(String args[]) { 
		
		
		TravelDirector travelDirector = new TravelDirector();
		Reservation reservation = travelDirector.constructReservation("bus");
		System.out.println("**From the Builder   construct a Bus Reservation Object ** "); 
		System.out.println("                           ");
		System.out.println(reservation.thingsTodo());
		System.out.println("                           ");
		System.out.println("**From the Builder   construct a Bus Payments Accepted Object ** "); 
		System.out.println("                           ");
		 Payments payments = travelDirector.acceptPayments("bus");
		 System.out.println(payments.paymentTypes());
		
	}


}
