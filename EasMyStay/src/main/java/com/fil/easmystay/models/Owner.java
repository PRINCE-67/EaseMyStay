package com.fil.easmystay.models;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Owner {

	@Id
	private long ownerId;
	@Column
	private String ownerName;
	@Column
	private String ownerEmail;
	@OneToOne
	private Hotel hotel;
}