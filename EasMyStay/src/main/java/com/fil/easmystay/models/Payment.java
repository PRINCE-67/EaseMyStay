package com.fil.easmystay.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Payment {
	
	@Id
	private long transactionId;
	
	
	@OneToOne
	private Reservation reservation;

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
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
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