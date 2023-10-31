package com.fil.easmystay.service;

import com.fil.easmystay.models.Reservation;
import java.util.List;

public interface ReservationService {

	Reservation createReservation(Reservation reservation);

	Reservation getReservationById(long reservationId);

	List<Reservation> getAllReservations();

	Reservation updateReservation(long reservationId, Reservation updatedReservation);

	void deleteReservation(long reservationId);
}
