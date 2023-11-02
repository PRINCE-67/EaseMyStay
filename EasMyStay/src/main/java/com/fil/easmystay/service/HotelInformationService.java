package com.fil.easmystay.service;

import com.fil.easmystay.models.HotelInformation;

public interface HotelInformationService {

	public HotelInformation createHotelInformation(HotelInformation hotelInformation);

	public HotelInformation getHotelInformationByEmail(String email);

	public HotelInformation updateHotelInformation(HotelInformation hotelInformation);

	public void deleteHotelInformationByEmail(String email);

}
