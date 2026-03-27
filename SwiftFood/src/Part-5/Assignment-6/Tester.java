package com.infy;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter Resturant Name");
		String restaurantName = scn.nextLine();
		System.out.println("Enter Rating: ");
		float rating=scn.nextFloat();
		System.out.println("Enter Contact of Resturant");
		long restaurantContact=scn.nextLong();
		scn.nextLine();
		System.out.println("Enter Address");
		String restaurantAddress = scn.nextLine();
		Restaurant r1 = new Restaurant(restaurantName, restaurantContact, restaurantAddress, rating);
		
		
		r1.displayResturantDetails();
		scn.close();

	}

}
