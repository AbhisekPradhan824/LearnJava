package com.infy;

public class Order {
	private int orderId;
	private String orderedFoods;
	private double totalPrice;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderedFoods() {
		return orderedFoods;
	}
	public void setOrderedFoods(String orderedFoods) {
		this.orderedFoods = orderedFoods;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	private String status;
	 Order(){
		 status="Ordered";
	 }
	 Order(int orderId, String orderedFoods){
		 this();
		 this.orderId = orderId;
		 this.orderedFoods=orderedFoods;
	 }
	
	public double calculateTotalPrice(int unitPrice) {
		this.totalPrice = unitPrice*(1+(5/100.0));
		
		return totalPrice;
	}

}
