package com.fil.mmproject.services;

import java.util.List;

import com.fil.mmproject.models.Hotel;

public interface HotelService {

	public Hotel createHotel(Hotel hotel);

	public List<Hotel> getHotels();

	public Hotel getHotelById(long id);

	public Hotel updateHotel(Hotel hotel);

	public String deleteHotelById(long id);
}
