package com.fil.easmystay.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
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
	@JoinColumn
	private Hotel hotel;

	@ManyToOne
	@JoinColumn
	private Reservation reservation;

	public long getRoomId() {
		return roomId;
	}

	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public Room(long roomId, double price, String roomType, int roomNum, Hotel hotel) {
		super();
		this.roomId = roomId;
		this.price = price;
		this.roomType = roomType;
		this.roomNum = roomNum;
		this.hotel = hotel;
	}

	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", price=" + price + ", roomType=" + roomType + ", roomNum=" + roomNum
				+ ", hotel=" + hotel + "]";
	}

}