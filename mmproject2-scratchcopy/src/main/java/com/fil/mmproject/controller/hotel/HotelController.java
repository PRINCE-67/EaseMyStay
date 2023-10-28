package com.fil.mmproject.controller.hotel;

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
import com.fil.mmproject.repositories.HotelRepo;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	private HotelRepo hotelRepo;
	
	@GetMapping("/getAllHotels")
	@ResponseBody
	public Object getHotels(Pageable pageable) {
		return hotelRepo.findAll(pageable);
	}
	
	@PostMapping("/addHotel")
	@ResponseBody
	public String addHotel(@RequestBody Hotel hotel) {

		Hotel hotel1 = new Hotel();
		hotel1.setHotelName(hotel.getHotelName());
		hotel1.setOwner(hotel.getOwner());
		hotel1.setHotelInfo(hotel.getHotelInfo());
		hotel1.setRating(hotel.getRating());
		hotel1.setCustomer(hotel.getCustomer());
		hotel1.setAdmin(hotel.getAdmin());
		hotel1.setHotelId(hotel.getHotelId());
		hotel1.setRoom(hotel.getRoom());

		hotelRepo.saveAndFlush(hotel1);

		return "Hotel added";
	}
	
	@DeleteMapping("/deleteHotel/{hotelId}")
	@ResponseBody
	public String deleteHotel(@PathVariable("hotelId") Long hotelId) {
		
		hotelRepo.deleteById(hotelId);
		return "Successfully deleted!";
	}
	
}
