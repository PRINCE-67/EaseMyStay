package com.fil.mmproject.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Admin { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminId;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "admin")
	private Hotel hotel;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "admin")
	private Owner owner;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "admin")
	private Customer customer;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "admin")
    private Reservation reservation;
    
    
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
    
	public Admin(int adminId, Hotel hotel, Owner owner, Customer customer, Reservation reservation) {
		super();
		this.adminId = adminId;
		this.hotel = hotel;
		this.owner = owner;
		this.customer = customer;
		this.reservation = reservation;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", hotel=" + hotel + ", owner=" + owner + ", customer=" + customer
				+ ", reservation=" + reservation + "]";
	}
	
	
	

}
