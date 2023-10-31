package com.fil.easmystay.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class HotelInformation {
	
	private String contactNumber;
	@Id
	private String hotelEmail;
	private String hotelAddress;
	
	@OneToOne
	private Hotel hotel;

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	public String getHotelEmail() {
		return hotelEmail;
	}

	public void setHotelEmail(String hotelEmail) {
		this.hotelEmail = hotelEmail;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public HotelInformation(String contactNumber, String hotelEmail, String hotelAddress, Hotel hotel) {
		super();
		this.contactNumber = contactNumber;
		this.hotelEmail = hotelEmail;
		this.hotelAddress = hotelAddress;
		this.hotel = hotel;
	}

	public HotelInformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "HotelInformation [contactNumber=" + contactNumber + ", hotelEmail=" + hotelEmail + ", hotelAddress="
				+ hotelAddress + ", hotel=" + hotel + "]";
	}
	
}
