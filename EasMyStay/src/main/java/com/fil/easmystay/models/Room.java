package com.fil.easmystay.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long roomId;
	@Column
	private double price;
	@Column
	private String roomType;
	@Column
	private int roomNum;

	@ManyToOne
	private Hotel hotel;

	@ManyToOne
	private Reservation reservation;
}