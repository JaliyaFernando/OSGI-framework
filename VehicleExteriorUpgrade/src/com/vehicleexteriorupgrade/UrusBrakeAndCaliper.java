package com.vehicleexteriorupgrade;

import java.util.Scanner;

public class UrusBrakeAndCaliper extends BrakeAndCaliper{
	Scanner input = new Scanner(System.in); 
	String model = "URUS";
	@Override
	String getBrakeAndCaliperDetails() {
		System.out.println("     ***** Select Your Brake and Caliper *****     ");
		System.out.println("(1)SILVER CALIPER");
		System.out.println("(2)BLACK CALIPER");
		System.out.println("(3)YELLOW CALIPER");
		System.out.println("(4)GREEN CALIPER");
		System.out.println("(5)ORANGE CALIPER");
		System.out.println("(6)RED CALIPER");
		System.out.println("----------------------------------------------");

		System.out.print("Input your Color Number:");
		int color = input.nextInt();
		
		if(color == 1) {
			return "SILVER CALIPER";
		}else if(color == 2) {
			return "BLACK CALIPER";
		}else if(color == 3) {
			return "YELLOW CALIPER";
		}else if(color == 4) {
			return "GREEN CALIPER";
		}else if(color == 5) {
			return "ORANGE CALIPER";
		}else if(color == 6) {
			return "RED CALIPER";
		}else {
			return "error";
		}
	}

	@Override
	double getBrakeAndCalipertPrice(String type) {
		double cost;
		if(type.equalsIgnoreCase("SILVER CALIPER")) {
			cost = 12500.00;
		}else if(type.equalsIgnoreCase("BLACK CALIPER")) {
			cost = 32500.00;
		}else if(type.equalsIgnoreCase("YELLOW CALIPER")) {
			cost = 72500.00;
		}else if(type.equalsIgnoreCase("GREEN CALIPER")) {
			cost = 12500.00;
		}else if(type.equalsIgnoreCase("ORANGE CALIPER")) {
			cost = 22500.00;
		}else if(type.equalsIgnoreCase("RED CALIPER")) {
			cost = 42500.00;
		}else {
			return 00.00;
		}
		return cost;
	}

}
