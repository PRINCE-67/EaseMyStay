package com.fil.easmystay.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long reservationId;
	@Column
	private String bookingStatus;
	@Column
	private String checkInDate;
	@Column
	private String checkOutDate;

	@OneToMany(mappedBy = "reservation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Room> rooms;

	@ManyToOne
	@JoinColumn
	private Customer customer;

	@OneToOne
	private Payment payment;


	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public long getReservationId() {
		return reservationId;
	}

	public void setReservationId(long reservationId) {
		this.reservationId = reservationId;
	}

	public String getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reservation(long reservationId, String bookingStatus, String checkInDate, String checkOutDate,
			List<Room> rooms, Customer customer, Payment payment) {
		super();
		this.reservationId = reservationId;
		this.bookingStatus = bookingStatus;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.rooms = rooms;
		this.customer = customer;
		this.payment = payment;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "Reservation [reservationId=" + reservationId + ", bookingStatus=" + bookingStatus + ", checkInDate="
				+ checkInDate + ", checkOutDate=" + checkOutDate + ", rooms=" + rooms + ", customer=" + customer
				+ ", payment=" + payment + "]";
	}
}