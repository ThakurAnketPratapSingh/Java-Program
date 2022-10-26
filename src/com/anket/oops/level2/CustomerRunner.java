package com.anket.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {

		Address homeAddress = new Address("line1", "Lucknow", "226202");
		Customer customer = new Customer("Anket", homeAddress);
		
		Address workAddress = new Address("line1 for work", "Lucknow", "226201");
		customer.setWorkAddress(workAddress);
		
		System.out.println(customer);

	}

}
