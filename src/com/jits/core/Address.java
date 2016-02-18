package com.jits.core;

import java.io.Serializable;

class Address implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String firstName;
	private String street;
	private String city;
	private String state;
	private String Zip;
	
	Address(String firstName,  String street, String city, String state, String zip) {
		super();
		this.firstName = firstName;
		
		this.street = street;
		this.city = city;
		this.state = state;
		Zip = zip;
	}
	
	Address(){
		
	}
	@Override
	public String toString() {
		return "" + firstName +" "+  street +  city
				+" "+  state +" "+  Zip;
	}
		
		
		
	public String getFirstName() {
		return firstName;
	}
	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getStreet() {
		return street;
	}
	private void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	private void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state.toUpperCase();
	}
	private void setState(String state) {
		this.state = state.toUpperCase();
	}
	public String getZip() {
		return Zip;
	}
	private void setZip(String zip) {
		Zip = zip;
	}
	

	
	
}
