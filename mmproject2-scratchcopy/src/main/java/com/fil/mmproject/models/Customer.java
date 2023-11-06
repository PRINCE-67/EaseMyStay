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
import jakarta.persistence.JoinColumn;
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
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerId;
	
	private String customerName;
	
	private long  customerPhoneNum;
	
	private String customerEmail;
	
	@OneToMany(fetch = FetchType.LAZY ,cascade = CascadeType.ALL, mappedBy = "customer")
	@JsonIgnore
	private List<Reservation> reservation;
	
	@OneToMany(fetch = FetchType.LAZY ,cascade = CascadeType.ALL ,mappedBy = "customer")
	@JsonIgnore
	private List<Hotel> hotels;
	
	@OneToOne(fetch = FetchType.LAZY ,cascade = CascadeType.ALL )
	@JsonIgnore
	private Admin admin;

	@Override
	public int hashCode() {
		return Objects.hash(admin, customerEmail, customerId, customerName, customerPhoneNum, hotels, reservation);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(admin, other.admin) && Objects.equals(customerEmail, other.customerEmail)
				&& customerId == other.customerId && Objects.equals(customerName, other.customerName)
				&& customerPhoneNum == other.customerPhoneNum && Objects.equals(hotels, other.hotels)
				&& Objects.equals(reservation, other.reservation);
	}
	
	
	

}
