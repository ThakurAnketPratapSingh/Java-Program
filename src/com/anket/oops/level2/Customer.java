package com.anket.oops.level2;

public class Customer {
	
	public Customer(String name, Address homeAddress) {
		super();
		this.name = name;
		this.homeAddress = homeAddress;
	}
	
	private String name;
	private Address homeAddress;
	private Address workAddress;
	
	public Address getHomeAddress() {
		return homeAddress;
	}
	
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	public Address getWorkAddress() {
		return workAddress;
	}
	
	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", homeAddress=" + homeAddress + ", workAddress=" + workAddress + "]";
	}
	
}
