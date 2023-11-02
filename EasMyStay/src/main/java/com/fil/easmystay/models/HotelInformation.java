package com.fil.easmystay.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class HotelInformation {

	private String contactNumber;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String hotelEmail;
	private String hotelAddress;

	@OneToOne(cascade = CascadeType.ALL)
	private Hotel hotel;
}
