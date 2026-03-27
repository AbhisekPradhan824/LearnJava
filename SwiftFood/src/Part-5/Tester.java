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
		o1.orderId=101;
		o1.orderedFoods="Spinach Alfredo Pasta";
		o1.status="Ordered";
		 System.out.println("Order Details\nOrder Id: " + o1.orderId +"\nOrdered Food: "+ o1.orderedFoods +"\nOrder Status: "+o1.status+"\nTotal Price: "+o1.calculateTotalPrice(30));
		
	}

}
