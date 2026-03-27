package com.infy;

public class Tester {
	public static void main(String args[]) {
		// Object creation
		Customer customer = new Customer();
		// Assigning values to the instance variables
		customer.customerId = "C101";
		customer.customerName = "Stephen Abram";
		customer.contactNumber = 7856341287L;
		customer.address = "D089, St. Louis Street, Springfield, 62729";
		
		Order o1 = new Order();
		o1.setOrderId(101);
		o1.setOrderedFoods("Spinach Alfredo Pasta");
		o1.setStatus("Ordered");
		 System.out.println("Order Details\nOrder Id: " + o1.getOrderId() +"\nOrdered Food: "+ o1.getOrderedFoods() +"\nOrder Status: "+o1.getStatus()+"\nTotal Price: "+o1.calculateTotalPrice(30));
		
	}

}
