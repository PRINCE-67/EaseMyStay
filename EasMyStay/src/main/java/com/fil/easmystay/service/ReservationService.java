package com.fil.easmystay.service;

import com.fil.easmystay.models.Reservation;
import java.util.List;

public interface ReservationService {

	public Reservation createReservation(Reservation reservation);

	public Reservation getReservationById(long reservationId);

	public List<Reservation> getAllReservations();

	public Reservation updateReservation(long reservationId, Reservation updatedReservation);

	public void deleteReservation(long reservationId);
}
