package com.fil.mmproject.models;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long hotelId;

	private String hotelName;

	private float rating;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	private Customer customer;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "hotel")
	@JsonIgnore
	private List<Room> rooms;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	private Admin admin;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	private Owner owner;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	private Availability availible;

	private String contactNumber;
	
	private String hotelEmail;
	
	private String hotelAddress;

	@Override
	public int hashCode() {
		return Objects.hash(admin, availible, contactNumber, customer, hotelAddress, hotelEmail, hotelId, hotelName,
				owner, rating, rooms);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		return Objects.equals(admin, other.admin) && Objects.equals(availible, other.availible)
				&& Objects.equals(contactNumber, other.contactNumber) && Objects.equals(customer, other.customer)
				&& Objects.equals(hotelAddress, other.hotelAddress) && Objects.equals(hotelEmail, other.hotelEmail)
				&& hotelId == other.hotelId && Objects.equals(hotelName, other.hotelName)
				&& Objects.equals(owner, other.owner)
				&& Float.floatToIntBits(rating) == Float.floatToIntBits(other.rating)
				&& Objects.equals(rooms, other.rooms);
	}
	
	
	

}