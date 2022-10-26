package com.anket.oops.level2;

public class Address {
	public Address(String line1, String city, String zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}

	private String line1;
	private String city;
	private String zip;
	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", city=" + city + ", zip=" + zip + "]";
	}
	

}
