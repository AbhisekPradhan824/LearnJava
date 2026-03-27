package com.infy;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		Resturant r1 = new Resturant();
		
		System.out.println("Enter Resturant Name");
		r1.resturantName = scn.nextLine();
		System.out.println("Enter Rating: ");
		r1.rating=scn.nextFloat();
		System.out.println("Enter Contact of Resturant");
		r1.resturantContact=scn.nextLong();
		scn.nextLine();
		System.out.println("Enter Address");
		r1.resturantAddress = scn.nextLine();
		
		r1.displayResturantDetails();
		scn.close();

	}

}
