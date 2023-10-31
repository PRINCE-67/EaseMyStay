package com.fil.easmystay.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class HotelSearch {

	@Id
    private String state;
    private String suburb;
    private String postcode;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getSuburb() {
		return suburb;
	}
	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public HotelSearch(String state, String suburb, String postcode) {
		super();
		this.state = state;
		this.suburb = suburb;
		this.postcode = postcode;
	}
	public HotelSearch() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "HotelSearch [state=" + state + ", suburb=" + suburb + ", postcode=" + postcode + "]";
	}

    

}