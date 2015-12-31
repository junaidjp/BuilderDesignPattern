package com.willcode4coffee.builderpattern;

/**
 * 
 * @author junaidpasha
 *
 */
public class TravelReservationBuilder  implements ReservationBuilder {

	
	public Reservation createReservation(String reservationType) {
		
		Reservation reservation = null;
		if (reservationType.equalsIgnoreCase("airline")) {
			reservation = new AirlineReservation();
		} else if (reservationType.equalsIgnoreCase("bus")) {
			reservation = new BusReservation();
		} else if (reservationType.equalsIgnoreCase("train")) {
			reservation = new TrainReservation();
		}

		return reservation;
	}
	
	
	
	public Payments acceptPayment(String reservationType) {
	
		Payments reservationPayments = null;
		if (reservationType.equalsIgnoreCase("airline")) {
			reservationPayments = new AirlineTicketPayment();
		} else if (reservationType.equalsIgnoreCase("bus")) {
			reservationPayments = new BusTicketPayments();
		} else if (reservationType.equalsIgnoreCase("train")) {
			reservationPayments = new TrainTicketPayment();
		}

		return reservationPayments;
	}

}
