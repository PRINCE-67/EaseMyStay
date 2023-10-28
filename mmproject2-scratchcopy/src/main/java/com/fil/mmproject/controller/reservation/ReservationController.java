package com.fil.mmproject.controller.reservation;

import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fil.mmproject.models.Hotel;
import com.fil.mmproject.models.Reservation;
import com.fil.mmproject.repositories.HotelRepo;
import com.fil.mmproject.repositories.ReservationRepo;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

private ReservationRepo reservationRepo;
	
	@GetMapping("/getAllReservations")
	@ResponseBody
	public Object getReservations(Pageable pageable) {
		return reservationRepo.findAll(pageable);
	}
	
	@PostMapping("/addReservation")
	@ResponseBody
	public String addReservation(@RequestBody Reservation reservation) {

		Reservation reservation1 = new Reservation();
		reservation1.setAdmin(reservation.getAdmin());
		reservation1.setBookingStatus(reservation.getBookingStatus());
		reservation1.setCheckInDate(reservation.getCheckInDate());
		reservation1.setCheckOutDate(reservation.getCheckOutDate());

		reservationRepo.saveAndFlush(reservation1);

		return "reservation added!";
	}
	
	@DeleteMapping("/deleteReservation/{reservationId}")
	@ResponseBody
	public String deleteHotel(@PathVariable("reservationId") Long reservationId) {
		
		reservationRepo.deleteById(reservationId);
		return "Successfully reservation deleted!";
	}
	
}
