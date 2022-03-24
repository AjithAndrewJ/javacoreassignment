package com.testing.juitilminiproject;

public class Address {
	private String city;
	private String pinCode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public Address(String city, String pinCode) {
		super();
		this.city = city;
		this.pinCode = pinCode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
}
