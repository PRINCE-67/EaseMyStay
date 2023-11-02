package com.fil.easmystay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fil.easmystay.models.Hotel;
import com.fil.easmystay.service.HotelService;

@RestController
@RequestMapping("/Hotels")
public class HotelController {

	private final HotelService hotelService;

	public HotelController(HotelService hotelService) {
		this.hotelService = hotelService;
	}

	@PostMapping("/createHotel")
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
		Hotel createdHotel = hotelService.createHotel(hotel);
		return new ResponseEntity<>(createdHotel, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Hotel>> getHotels() {
		List<Hotel> hotels = hotelService.getHotels();
		return new ResponseEntity<>(hotels, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Hotel> getHotelById(@PathVariable long id) {
		Hotel hotel = hotelService.getHotelById(id);
		if (hotel != null) {
			return new ResponseEntity<>(hotel, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<Hotel> updateHotel(@PathVariable long id, @RequestBody Hotel hotel) {
		hotel.setHotelId(id);
		Hotel updatedHotel = hotelService.updateHotel(hotel);
		if (updatedHotel != null) {
			return new ResponseEntity<>(updatedHotel, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteHotel(@PathVariable long id) {
		hotelService.deleteHotelById(id);
		return new ResponseEntity<>("Hotel with ID " + id + " got deleted", HttpStatus.OK);
	}
}
