package com.fil.mmproject.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerId;
	
	private String customerName;
	
	private long  customerPhoneNum;
	
	private String customerEmail;
	
	@OneToMany(fetch = FetchType.LAZY ,cascade = CascadeType.ALL, mappedBy = "customer")
	@JsonIgnore
	private List<Reservation> reservation;
	
	@OneToMany(fetch = FetchType.LAZY ,cascade = CascadeType.ALL ,mappedBy = "customer")
	@JsonIgnore
	private List<Hotel> hotels;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getCustomerPhoneNum() {
		return customerPhoneNum;
	}

	public void setCustomerPhoneNum(long customerPhoneNum) {
		this.customerPhoneNum = customerPhoneNum;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public List<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(List<Reservation> reservation) {
		this.reservation = reservation;
	}

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}

	
	public Customer(long customerId, String customerName, long customerPhoneNum, String customerEmail,
			List<Reservation> reservation, List<Hotel> hotels) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPhoneNum = customerPhoneNum;
		this.customerEmail = customerEmail;
		this.reservation = reservation;
		this.hotels = hotels;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPhoneNum="
				+ customerPhoneNum + ", customerEmail=" + customerEmail + ", reservation=" + reservation + ", hotels="
				+ hotels + ", admin=" + "]";
	}
	
	
	
	

}
