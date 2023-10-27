package com.fil.easmystay.models;

import java.util.List;

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
public class Reservation {

	@Id
	private long reservationId;
	private String bookingStatus;
	private String checkInDate;
	private String checkOutDate;

	@OneToMany(mappedBy = "reservation")
	private List<Room> rooms;

	@ManyToOne
	private Customer customer;

	@OneToOne
	private Payment payment;

	@OneToOne
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
			List<Room> rooms, Customer customer, Payment payment, Admin admin) {
		super();
		this.reservationId = reservationId;
		this.bookingStatus = bookingStatus;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.rooms = rooms;
		this.customer = customer;
		this.payment = payment;
		this.admin = admin;
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
				+ ", payment=" + payment + ", admin=" + admin + "]";
	}
}