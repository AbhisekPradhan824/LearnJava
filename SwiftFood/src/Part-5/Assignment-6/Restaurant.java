package com.infy;

public class Restaurant {
	public String restaurantName;
	public long restaurantContact;
	public String restaurantAddress;
	public float rating;
	
	Restaurant(String restaurantName, long restaurantContact, String restaurantAddress, float rating){
		this.restaurantName=restaurantName;
		this.restaurantContact=restaurantContact;
		this.restaurantAddress= restaurantAddress;
		this.rating= rating;
	}
	
	public void displayResturantDetails() {
		System.out.println("Resturant Details\n******************\n");
		System.out.println("Resturant Name : "+ this.restaurantName + "\nResturant Rating : "+ this.rating + "\nResturant Contact : "+this.restaurantContact + "\nResturant Address : "+ this.restaurantAddress);
	}

}
