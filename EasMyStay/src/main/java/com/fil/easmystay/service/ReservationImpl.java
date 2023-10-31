package com.fil.easmystay.service;

import com.fil.easmystay.models.Reservation;
import com.fil.easmystay.repository.ReservationRepo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationImpl implements ReservationService {

	private ReservationRepo reservationRepo;

	@Override
	public Reservation createReservation(Reservation reservation) {
		return reservationRepo.save(reservation);
	}

	@Override
	public Reservation getReservationById(long reservationId) {
		return reservationRepo.findById(reservationId).orElse(null);
	}

	@Override
	public List<Reservation> getAllReservations() {
		return reservationRepo.findAll();
	}

	@Override
	public Reservation updateReservation(long reservationId, Reservation updatedReservation) {
		Reservation existingReservation = reservationRepo.findById(reservationId).orElse(null);
		if (existingReservation != null) {
			existingReservation.setBookingStatus(updatedReservation.getBookingStatus());

			return reservationRepo.save(existingReservation);
		}
		return null;
	}

	@Override
	public void deleteReservation(long reservationId) {
		// TODO Auto-generated method stub
		reservationRepo.deleteById(reservationId);

	}

}