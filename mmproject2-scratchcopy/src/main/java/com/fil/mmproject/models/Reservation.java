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
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long reservationId;
	private String bookingStatus;
	private String checkInDate;
	private String checkOutDate;

	@OneToMany(fetch = FetchType.LAZY ,cascade = CascadeType.ALL ,mappedBy = "reservation")
	private List<Room> room;

	@ManyToOne(fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
	private Customer customer;

	@OneToOne(fetch = FetchType.LAZY ,cascade = CascadeType.ALL ,mappedBy = "reservation")
	private Payment payment;

	@OneToOne(fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
	private Admin admin;

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

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	

	public List<Room> getRoom() {
		return room;
	}

	public void setRoom(List<Room> room) {
		this.room = room;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Reservation(long reservationId, String bookingStatus, String checkInDate, String checkOutDate,
			List<Room> room, Customer customer, Payment payment, Admin admin) {
		super();
		this.reservationId = reservationId;
		this.bookingStatus = bookingStatus;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.room = room;
		this.customer = customer;
		this.payment = payment;
		this.admin = admin;
	}

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Reservation [reservationId=" + reservationId + ", bookingStatus=" + bookingStatus + ", checkInDate="
				+ checkInDate + ", checkOutDate=" + checkOutDate + ", room=" + room + ", customer=" + customer
				+ ", payment=" + payment + ", admin=" + admin + "]";
	}
	
}