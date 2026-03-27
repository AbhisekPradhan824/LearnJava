package com.infy;

public class Tester5 {

	public static void main(String[] args) {
		Order order1=new Order();
		System.out.println("Status of order 1: "+ order1.getStatus());
		
		Order order2 = new Order(1001, "Garlic Shrimp");
		System.out.println("Status of order 1: "+ order2.getStatus());
		System.out.println("Id of order 2: "+order2.getOrderId());
		System.out.println("Items ordered in order 2: "+order2.getOrderedFoods());
		

	}

}
