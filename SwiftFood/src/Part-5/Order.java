package com.infy;

public class Order {
	public int orderId;
	public String orderedFoods;
	public double totalPrice;
	public String status;
	
	public double calculateTotalPrice(int unitPrice) {
		this.totalPrice = unitPrice*(1+(5/100.0));
		
		return totalPrice;
	}

}
