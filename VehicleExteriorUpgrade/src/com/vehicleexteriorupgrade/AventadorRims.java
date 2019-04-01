package com.vehicleexteriorupgrade;

import java.util.Scanner;

public class AventadorRims extends Rim{
	Scanner input = new Scanner(System.in); 
	String model = "AVENTADOR";
	@Override
	String getRimDetails() {
		System.out.println("     ***** Select Your Rim *****     ");
		System.out.println("--------------------NIREO FORGED 20\"21\"----------------------");
		System.out.println("(1)NIREO FORGED TITANIUM MATT");
		
		System.out.println("--------------------LEIRION FORGED 20\"21\"--------------------");
		System.out.println("(2)LEIRION FORGED SHINY BLACK");
		System.out.println("(3)LEIRION FORGED BRONZE");
		System.out.println("--------------------CENTRAL LOCK-------------------------------");
		System.out.println("(4)CENTRAL LOCK IN BLACK");
		System.out.println("(5)CENTRAL LOCK IN RED");
		System.out.println("---------------------------------------------------------------");

		System.out.print("Input your Rim Number:");
		int color = input.nextInt();
		
		if(color == 1) {
			return "NIREO FORGED TITANIUM MATT";
		}else if(color == 2) {
			return "LEIRION FORGED SHINY BLACK";
		}else if(color == 3) {
			return "LEIRION FORGED BRONZE";
		}else if(color == 4) {
			return "CENTRAL LOCK IN BLACK";
		}else if(color == 5) {
			return "CENTRAL LOCK IN RED";
		}else {
			return "error";
		}
		
	}

	@Override
	double getRimtPrice(String rimType) {
		double paintPrice;
		if(rimType.equalsIgnoreCase("NIREO FORGED TITANIUM MATT")) {
			paintPrice = 130000.00;
		}else if(rimType.equalsIgnoreCase("LEIRION FORGED SHINY BLACK")) {
			paintPrice = 106000.00;
		}else if(rimType.equalsIgnoreCase("LEIRION FORGED BRONZE")) {
			paintPrice = 207000.00;
		}else if(rimType.equalsIgnoreCase("CENTRAL LOCK IN BLACK")) {
			paintPrice = 806000.00;
		}else if(rimType.equalsIgnoreCase("CENTRAL LOCK IN RED")) {
			paintPrice = 603000.00;
		}else {
			paintPrice = 00.00;
		}
		return paintPrice;
	}

}
