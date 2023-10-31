package com.fil.easmystay.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long transactionId;

	@OneToOne
	private Reservation reservations;

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public Payment(long transactionId) {
		super();
		this.transactionId = transactionId;
	}

	public Reservation getReservation() {
		return reservations;
	}

	public void setReservation(Reservation reservation) {
		this.reservations = reservation;
	}

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Payment [transactionId=" + transactionId + "]";
	}

}