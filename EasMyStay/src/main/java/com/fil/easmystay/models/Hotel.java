package com.fil.easmystay.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Hotel {

	@Id
	private long hotelId;
	private String hotelName;

	@OneToOne
	private Owner owner;
	private float rating;

	@ManyToOne
	private Customer customer;

	@OneToOne
	private Admin admin;

	@OneToMany(mappedBy = "hotel")
	private List<Room> rooms;

	@OneToOne
	private HotelInformation hotelInfo;

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

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public List<Room> rooms() {
		return rooms;
	}

	public void setNumOfRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public Hotel(long hotelId, String hotelName, Owner owner, float rating, Customer customer, Admin admin,
			List<Room> rooms) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.owner = owner;
		this.rating = rating;
		this.customer = customer;
		this.admin = admin;
		this.rooms = rooms;
	}

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", owner=" + owner + ", rating=" + rating
				+ ", customer=" + customer + ", admin=" + admin + ", rooms=" + rooms + "]";
	}

	
}