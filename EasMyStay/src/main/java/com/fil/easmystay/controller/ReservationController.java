package com.fil.easmystay.controller;

import com.fil.easmystay.models.Reservation;
import com.fil.easmystay.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/reservations")
public class ReservationController {

	@Autowired
	private ReservationService reservationService;

	@PostMapping("/createReservation")
	public Reservation createReservation(@RequestBody Reservation reservation) {
		return reservationService.createReservation(reservation);
	}

	@GetMapping("/{reservationId}")
	public Reservation getReservationById(@PathVariable long reservationId) {
		Reservation reservation = reservationService.getReservationById(reservationId);
		if (reservation == null) {

		}
		return reservation;
	}

	@GetMapping("/getAllReservations")
	public List<Reservation> getAllReservations() {
		return reservationService.getAllReservations();
	}

	@PutMapping("/{reservationId}")
	public Reservation updateReservation(@PathVariable long reservationId, @RequestBody Reservation reservation) {
		Reservation updatedReservation = reservationService.updateReservation(reservationId, reservation);
		if (updatedReservation == null) {

		}
		return updatedReservation;
	}

	@DeleteMapping("/{reservationId}")
	public void deleteReservationId(long id) {
		reservationService.deleteReservation(id);
	}
}