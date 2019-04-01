package com.vehicleexteriorupgrade;

import java.util.Scanner;

public class HuracanRim extends Rim{

	Scanner input = new Scanner(System.in); 
	String model = "HURACAN";
	@Override
	String getRimDetails() {
		System.out.println("     ***** Select Your Paint Color *****     ");
		System.out.println("--------------------GIANO 20\"----------------------");
		System.out.println("(1)GIANO SILVER");
		System.out.println("(2)GIANO SHINY BLACK");
		System.out.println("(3)GIANO MATT TITANIUM");
		System.out.println("(4)GIANO MATT BLACK");
		System.out.println("--------------------MIMAS FORGED 20\"--------------------");
		System.out.println("(5)MIMAS FORGED SILVER");
		System.out.println("(6)MIMAS FORGED SHINY BLACK");
		System.out.println("(7)MIMAS FORGED MATT TITANIUM");
		System.out.println("---------------------------------------------------------------");

		System.out.print("Input your Color Number:");
		int color = input.nextInt();
		
		if(color == 1) {
			return "GIANO SILVER";
		}else if(color == 2) {
			return "GIANO SHINY BLACK";
		}else if(color == 3) {
			return "GIANO MATT TITANIUM";
		}else if(color == 4) {
			return "GIANO MATT BLACK";
		}else if(color == 5) {
			return "MIMAS FORGED SILVER";
		}else if(color == 6) {
			return "MIMAS FORGED SHINY BLACK";
		}else if(color == 7) {
			return "MIMAS FORGED MATT TITANIUM";
		}else {
			return "error";
		}
		
	}

	@Override
	double getRimtPrice(String rimType) {
		double paintPrice;
		if(rimType.equalsIgnoreCase("GIANO SILVER")) {
			paintPrice = 136000.00;
		}else if(rimType.equalsIgnoreCase("GIANO SHINY BLACK")) {
			paintPrice = 106900.00;
		}else if(rimType.equalsIgnoreCase("GIANO MATT TITANIUM")) {
			paintPrice = 207040.00;
		}else if(rimType.equalsIgnoreCase("GIANO MATT BLACK")) {
			paintPrice = 806400.00;
		}else if(rimType.equalsIgnoreCase("MIMAS FORGED SILVER")) {
			paintPrice = 603300.00;
		}else if(rimType.equalsIgnoreCase("MIMAS FORGED SHINY BLACK")) {
			paintPrice = 806700.00;
		}else if(rimType.equalsIgnoreCase("MIMAS FORGED MATT TITANIUM")) {
			paintPrice = 603900.00;
		}else {
			paintPrice = 00.00;
		}
		return paintPrice;
	}

}
