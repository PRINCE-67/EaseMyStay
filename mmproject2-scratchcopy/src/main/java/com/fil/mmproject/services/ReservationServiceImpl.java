package com.fil.mmproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fil.mmproject.models.Reservation;
import com.fil.mmproject.repositories.ReservationRepo;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private ReservationRepo reservationRepo;

	@Override
	public Reservation createReservation(Reservation reservation) {
		return reservationRepo.save(reservation);
	}

	@Override
	public Reservation getReservationById(Long reservationId) {
		return reservationRepo.findById(reservationId).orElse(null);
	}

	@Override
	public List<Reservation> getAllReservations() {
		return reservationRepo.findAll();
	}

	@Override
	public Reservation updateReservation(Long reservationId, Reservation updatedReservation) {
		Reservation existingReservation = reservationRepo.findById(reservationId).orElse(null);
		if (existingReservation != null) {
			existingReservation.setBookingStatus(updatedReservation.getBookingStatus());

			return reservationRepo.save(existingReservation);
		}
		return null;
	}

	@Override
	public void deleteReservation(Long reservationId) {
		reservationRepo.deleteById(reservationId);
	}
}
