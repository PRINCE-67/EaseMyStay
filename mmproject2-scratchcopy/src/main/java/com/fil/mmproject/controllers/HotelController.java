package com.fil.mmproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fil.mmproject.models.Hotel;
import com.fil.mmproject.services.HotelServiceImpl;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	private HotelServiceImpl hotelService;

	@GetMapping("/home")
	public String home() {
		System.out.println("Hi! Just an update. The One Piece is real.");
		return "Hello World!";
	}

	@GetMapping("/getHotels")
	public List<Hotel> getHotels() {
		return (List<Hotel>)hotelService.getHotels();
	}

	@GetMapping("/getHotel/{hotelId}")
	public Hotel getHotelById(@PathVariable long hotelId) {
		return hotelService.getHotelById(hotelId);
	}

	@PostMapping("/addHotel")
	public Hotel addHotel(@RequestBody Hotel hotel) {
		return hotelService.createHotel(hotel);
	}

	@PutMapping("/updateHotel")
	public Hotel updateHotel(@RequestBody Hotel hotel) {
		return hotelService.updateHotel(hotel);
	}

	@DeleteMapping("/deleteHotel/{hotelId}")
	public String deleteHotel(@PathVariable long hotelId) {
		return hotelService.deleteHotelById(hotelId);
	}

}
