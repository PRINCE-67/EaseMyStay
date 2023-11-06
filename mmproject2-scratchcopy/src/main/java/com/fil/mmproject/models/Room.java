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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long roomId;

	private double price;

	private String roomType;

	private int roomNum;

	@ManyToOne(fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
	@JsonIgnore
	private Hotel hotel;

	@ManyToOne(fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
	@JsonIgnore
	private Reservation reservation;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Availability> availible;

	@Override
	public int hashCode() {
		return Objects.hash(availible, hotel, price, reservation, roomId, roomNum, roomType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		return Objects.equals(availible, other.availible) && Objects.equals(hotel, other.hotel)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(reservation, other.reservation) && roomId == other.roomId && roomNum == other.roomNum
				&& Objects.equals(roomType, other.roomType);
	}
	
	

}