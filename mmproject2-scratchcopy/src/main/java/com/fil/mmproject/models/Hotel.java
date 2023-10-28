package com.fil.mmproject.models;

import java.util.List;

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

	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Owner owner;
	
	private float rating;

	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Customer customer;

	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Admin admin;

	@OneToMany(fetch = FetchType.LAZY ,cascade = CascadeType.ALL ,mappedBy = "hotel")
	private List<Room> room;

	@OneToOne(fetch = FetchType.LAZY ,cascade = CascadeType.ALL ,mappedBy = "hotel")
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

	

	public List<Room> getRoom() {
		return room;
	}

	public void setRoom(List<Room> room) {
		this.room = room;
	}

	public HotelInformation getHotelInfo() {
		return hotelInfo;
	}

	public void setHotelInfo(HotelInformation hotelInfo) {
		this.hotelInfo = hotelInfo;
	}

	

	public Hotel(long hotelId, String hotelName, Owner owner, float rating, Customer customer, Admin admin,
			List<Room> room, HotelInformation hotelInfo) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.owner = owner;
		this.rating = rating;
		this.customer = customer;
		this.admin = admin;
		this.room = room;
		this.hotelInfo = hotelInfo;
	}

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", owner=" + owner + ", rating=" + rating
				+ ", customer=" + customer + ", admin=" + admin + ", room=" + room + ", hotelInfo=" + hotelInfo + "]";
	}

	

}