package com.fil.easmystay.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class HotelInformation {
	
	private String contactNumber;
	@Id
	private String hotelEmail;
	private String hotelAddress;
	
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getHotelEmail() {
		return hotelEmail;
	}
	public void setHotelEmail(String hotelEmail) {
		this.hotelEmail = hotelEmail;
	}
	public String getHotelAddress() {
		return hotelAddress;
	}
	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}
	public HotelInformation(String contactNumber, String hotelEmail, String hotelAddress) {
		super();
		this.contactNumber = contactNumber;
		this.hotelEmail = hotelEmail;
		this.hotelAddress = hotelAddress;
	}
	public HotelInformation() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "HotelInformation [contactNumber=" + contactNumber + ", hotelEmail=" + hotelEmail + ", hotelAddress="
				+ hotelAddress + "]";
	}
	
	

}
