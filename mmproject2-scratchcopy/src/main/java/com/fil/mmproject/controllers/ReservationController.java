package com.fil.mmproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fil.mmproject.models.Reservation;
import com.fil.mmproject.services.ReservationService;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

	@Autowired
	private ReservationService reservationService;

	@GetMapping("/home")
	public String home() {
		System.out.println("Hi! Just an update. The One Piece is real.");
		return "Hello World!";
	}
	
	@PostMapping("/creatingReservation")
	public Reservation createReservation(@RequestBody Reservation reservation) {
		return reservationService.createReservation(reservation);
	}

	@GetMapping("/getReservation/{reservationId}")
	public Reservation getReservationById(@PathVariable Long reservationId) {
		Reservation reservation = reservationService.getReservationById(reservationId);
		if (reservation == null) {

		}
		return reservation;
	}

	@GetMapping("/allReservationsMade")
	public List<Reservation> getAllReservations() {
		return reservationService.getAllReservations();
	}

	@PutMapping("/updateReservation/{reservationId}")
	public Reservation updateReservation(@PathVariable Long reservationId, @RequestBody Reservation reservation) {
		Reservation updatedReservation = reservationService.updateReservation(reservationId, reservation);
		if (updatedReservation == null) {

		}
		return updatedReservation;
	}

	@DeleteMapping("/deleteReservation/{reservationId}")
	public void deleteReservation(@PathVariable Long reservationId) {
		reservationService.deleteReservation(reservationId);
	}
}