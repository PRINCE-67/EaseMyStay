package com.fil.mmproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fil.mmproject.models.Hotel;
import com.fil.mmproject.repositories.HotelRepo;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepo hotelRepo;
	
	public Hotel createHotel(Hotel hotel) {
		return hotelRepo.save(hotel);
	}

	public List<Hotel> getHotels() {
		return hotelRepo.findAll();
	}

	public Hotel getHotelById(long id) {
		return hotelRepo.findById(id).orElse(null);
	}

	public Hotel updateHotel(Hotel hotel) {
		Optional<Hotel> optionalHotel = hotelRepo.findById(hotel.getHotelId());
		Hotel new_hotel = null;
		if (optionalHotel.isPresent()) {
			new_hotel.setContactNumber(hotel.getContactNumber());
			new_hotel.setCustomer(hotel.getCustomer());
			new_hotel.setHotelAddress(hotel.getHotelAddress());
			new_hotel.setHotelEmail(hotel.getHotelEmail());
			new_hotel.setHotelId(hotel.getHotelId());
			new_hotel.setHotelName(hotel.getHotelName());
			new_hotel.setRating(hotel.getRating());
			new_hotel.setRooms(hotel.getRooms());
			
			hotelRepo.save(new_hotel);
		} else {
			return new Hotel();
		}
		return new_hotel;
	}

	public String deleteHotelById(long id) {
		hotelRepo.deleteById(id);
		return "Hotel got deleted";
	}

}
