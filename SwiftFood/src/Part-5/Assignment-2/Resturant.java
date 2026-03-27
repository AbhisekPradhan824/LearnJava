package com.infy;

public class Resturant {
	public String resturantName;
	public long resturantContact;
	public String resturantAddress;
	public float rating;
	
	public void displayResturantDetails() {
		System.out.println("Resturant Details\n******************\n");
		System.out.println("Resturant Name : "+ this.resturantName + "\nResturant Rating : "+ this.rating + "\nResturant Contact : "+this.resturantContact + "\nResturant Address : "+ this.resturantAddress);
	}

}
