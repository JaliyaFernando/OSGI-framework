package com.vehicleexteriorupgrade;

import java.util.Scanner;

public class UrusRim extends Rim{
	Scanner input = new Scanner(System.in); 
	String model = "URUS";
	@Override
	String getRimDetails() {
		System.out.println("     ***** Select Your Rim *****     ");
		System.out.println("--------------------TAIGETE 23\"----------------------");
		System.out.println("(1)TAIGETE SHINY BLACK");
		System.out.println("(2)TAIGETE DIAMOND FINISHED");

		System.out.println("--------------------NATH 22\"--------------------");
		System.out.println("(3)NATH SILVER");
		System.out.println("(4)NATH TITANIUM MATT");
		System.out.println("(5)NATH DIAMOND FINISHED");
		
		System.out.println("--------------------ASTEROPE 21\"--------------------");
		System.out.println("(6)ASTEROPE SILVER");
		System.out.println("(7)ASTEROPE GRAPHITE GREY");
		
		System.out.println("--------------------ALCIONE 21\"--------------------");
		System.out.println("(8)ALCIONE SILVER");
		System.out.println("(9)ALCIONE TITANIUM MATT");
		System.out.println("(10)ALCIONE SHINY BLACK");
		System.out.println("---------------------------------------------------------------");

		System.out.print("Input your Rim Number:");
		int color = input.nextInt();
		
		if(color == 1) {
			return "TAIGETE SHINY BLACK";
		}else if(color == 2) {
			return "TAIGETE DIAMOND FINISHED";
		}else if(color == 3) {
			return "NATH SILVER";
		}else if(color == 4) {
			return "NATH TITANIUM MATT";
		}else if(color == 5) {
			return "NATH DIAMOND FINISHED";
		}else if(color == 6) {
			return "ASTEROPE SILVER";
		}else if(color == 7) {
			return "ASTEROPE GRAPHITE GREY";
		}else if(color == 8) {
			return "ALCIONE SILVER";
		}else if(color == 9) {
			return "ALCIONE TITANIUM MATT";
		}else if(color == 10) {
			return "ALCIONE SHINY BLACK";
		}else {
			return "error";
		}
	}

	@Override
	double getRimtPrice(String rimType) {
		double paintPrice;
		if(rimType.equalsIgnoreCase("TAIGETE SHINY BLACK")) {
			paintPrice = 436000.00;
		}else if(rimType.equalsIgnoreCase("TAIGETE DIAMOND FINISHED")) {
			paintPrice = 196900.00;
		}else if(rimType.equalsIgnoreCase("NATH SILVER")) {
			paintPrice = 277040.00;
		}else if(rimType.equalsIgnoreCase("NATH TITANIUM MATT")) {
			paintPrice = 606400.00;
		}else if(rimType.equalsIgnoreCase("NATH DIAMOND FINISHED")) {
			paintPrice = 633300.00;
		}else if(rimType.equalsIgnoreCase("ASTEROPE SILVER")) {
			paintPrice = 126700.00;
		}else if(rimType.equalsIgnoreCase("ASTEROPE GRAPHITE GREY")) {
			paintPrice = 353900.00;
		}else if(rimType.equalsIgnoreCase("ALCIONE SILVER")) {
			paintPrice = 753300.00;
		}else if(rimType.equalsIgnoreCase("ALCIONE TITANIUM MATT")) {
			paintPrice = 126700.00;
		}else if(rimType.equalsIgnoreCase("ALCIONE SHINY BLACK")) {
			paintPrice = 653900.00;
		}else {
			paintPrice = 00.00;
		}
		return paintPrice;
	}

}
