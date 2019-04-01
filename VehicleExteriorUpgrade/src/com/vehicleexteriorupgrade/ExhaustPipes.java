package com.vehicleexteriorupgrade;

import java.util.Scanner;

public class ExhaustPipes {
	Scanner input = new Scanner(System.in); 

	String getExhaustPipes() {
		System.out.println("     ***** Select Your Pipes Exterior *****     ");
		System.out.println("------------------------------------------");
		System.out.println("         Type 1 - SATIN");
		System.out.println("         Type 2 - BRIGHT");
		System.out.println("         Type 3 - BLACK MATT");
		System.out.println("------------------------------------------");
		System.out.print("Input your Type Number:");
		int color = input.nextInt();
		
		if(color == 1) {
			return "SATIN";
		}else if(color == 2) {
			return "BRIGHT";
		}else if(color == 3) {
			return "BLACK MATT";
		}else {
			return "error";
		}
	}
	
	double getBrakeAndCalipertPrice(String carType,String type) {
		double cost;
		if(type.equalsIgnoreCase("SATIN")) {
			cost = 12500.00;
		}else if(type.equalsIgnoreCase("BRIGHT")) {
			cost = 32500.00;
		}else if(type.equalsIgnoreCase("BLACK MATT")) {
			cost = 20500.00;
		}else {
			return 00.00;
		}
		
		String a = carType.substring(0,4);
		
	      if(a.equalsIgnoreCase("AVEN")){
	         cost = cost + 10000; ;
	         
	      } else if(a.equalsIgnoreCase("HURA")){
	    	  cost = cost + 20000; ;
	         
	      } else if(a.equalsIgnoreCase("URUS")){
	    	  cost = cost + 30000; ;
	      }
		return cost;
	}
	
	String getSelectedTailpipesDetails(String carType, String type) {

		return "Exhaust Tailpipes :"+type+" \t"
				+ "  Cost : "+getBrakeAndCalipertPrice(carType,type);
		
		
	}
}
