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
import lombok.Data;

@Entity
@Data
public class Reservation{

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
	@JsonIgnore
	private List<Room> rooms;

	@OneToOne
	private Customer customer;

	@OneToOne
	private Payment payment;
}