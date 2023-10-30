package com.fil.mmproject.services;

import java.util.List;

import com.fil.mmproject.models.Reservation;

public interface ReservationService {

	Reservation createReservation(Reservation reservation);

	Reservation getReservationById(Long reservationId);

	List<Reservation> getAllReservations();

	Reservation updateReservation(Long reservationId, Reservation updatedReservation);

	void deleteReservation(Long reservationId);
}