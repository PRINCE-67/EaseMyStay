package com.fil.mmproject.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long hotelId;

	private String hotelName;

	private float rating;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	private Customer customer;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "hotel")
	@JsonIgnore
	private List<Room> rooms;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	private Admin admin;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	private Owner owner;

	private String contactNumber;
	
	private String hotelEmail;
	
	private String hotelAddress;
	
	

	public long getHotelId() {
		return hotelId;
	}

	public void setHotelId(long hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

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

	

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Hotel(long hotelId, String hotelName, float rating, Customer customer,
			List<Room> rooms, String contactNumber, String hotelEmail, String hotelAddress) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.rating = rating;
		this.customer = customer;
		this.rooms = rooms;
		this.contactNumber = contactNumber;
		this.hotelEmail = hotelEmail;
		this.hotelAddress = hotelAddress;
	}

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", rating=" + rating + ", customer="
				+ customer + ", rooms=" + rooms + ", admin=" + admin + ", owner=" + owner + ", contactNumber="
				+ contactNumber + ", hotelEmail=" + hotelEmail + ", hotelAddress=" + hotelAddress + "]";
	}

	

}