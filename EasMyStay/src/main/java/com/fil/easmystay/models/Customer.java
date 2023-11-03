package com.fil.easmystay.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fil.easmystay.repository.AdminRepo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerId;
	@Column(nullable = false)
	private String customerName;
	@Column(nullable = false)
	private long customerPhoneNum;
	@Column
	private String customerEmail;

	private String customerPassword;
	@ManyToOne
	@JoinColumn
	private Admin admin;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Reservation> reservations;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
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

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public List<Reservation> getReservation() {
		return reservations;
	}

	public void setReservation(List<Reservation> reservation) {
		this.reservations = reservation;
	}

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public Customer(long customerId, String customerName, long customerPhoneNum, String customerEmail,
			String customerPassword, Admin admin, List<Reservation> reservations, List<Hotel> hotels) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPhoneNum = customerPhoneNum;
		this.customerEmail = customerEmail;
		this.customerPassword = customerPassword;
		this.admin = admin;
		this.reservations = reservations;
		this.hotels = hotels;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPhoneNum="
				+ customerPhoneNum + ", customerEmail=" + customerEmail + ", customerPassword=" + customerPassword
				+ ", admin=" + admin + ", reservations=" + reservations + ", hotels=" + hotels + "]";
	}


}
