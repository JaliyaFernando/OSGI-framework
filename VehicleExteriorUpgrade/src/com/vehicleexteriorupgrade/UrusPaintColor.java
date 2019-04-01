package com.vehicleexteriorupgrade;

import java.util.Scanner;

public class UrusPaintColor extends Paint{
	Scanner input = new Scanner(System.in); 
	String model = "URUS";
	
	@Override
	String getPaintDetails() {
		System.out.println("     ***** Select Your Rim *****     ");
		System.out.println("--------------------SOLID----------------------");
		System.out.println("(1)Nero Noctis");
		System.out.println("(2)Giallo Auge");
		System.out.println("(3)Bianco Monocerus");
		System.out.println("--------------------METALLIC-------------------");
		System.out.println("(4)Nero Helene");
		System.out.println("(5)Blu Astraeus");
		System.out.println("(6)Bianco Icarus");
		System.out.println("(7)Grigio Lynx");
		System.out.println("(8)Blu Eleos");
		System.out.println("(9)Grigio Nimbus");
		System.out.println("(10)Rosso Mars");
		System.out.println("(11)Rosso Anteros");
		System.out.println("----------------------------------------------");

		System.out.print("Input your Rim Number:");
		int color = input.nextInt();
		
		if(color == 1) {
			return "Nero Noctis";
		}else if(color == 2) {
			return "Giallo Auge";
		}else if(color == 3) {
			return "Bianco Monocerus";
		}else if(color == 4) {
			return "Nero Helene";
		}else if(color == 5) {
			return "Blu Astraeus";
		}else if(color == 6) {
			return "Bianco Icarus";
		}else if(color == 7) {
			return "Grigio Lynx";
		}else if(color == 8 ){
			return "Blu Eleos";
		}else if(color == 9) {
			return "Grigio Nimbus";
		}else if(color == 10) {
			return "Rosso Mars";
		}else if(color == 11 ){
			return "Rosso Anteros";
		}else {
			return "error";
		}
		
		
	}
	@Override
	double getPaintPrice(String paintColor) {
		double paintPrice;
		if(paintColor.equalsIgnoreCase("Nero Noctis")) {
			paintPrice = 10000.00;
		}else if(paintColor.equalsIgnoreCase("Giallo Auge")) {
			paintPrice = 10000.00;
		}else if(paintColor.equalsIgnoreCase("Bianco Monocerus")) {
			paintPrice = 20000.00;
		}else if(paintColor.equalsIgnoreCase("Nero Helene")) {
			paintPrice = 80000.00;
		}else if(paintColor.equalsIgnoreCase("Blu Astraeus")) {
			paintPrice = 60000.00;
		}else if(paintColor.equalsIgnoreCase("Bianco Icarus")) {
			paintPrice = 50000.00;
		}else if(paintColor.equalsIgnoreCase("Grigio Lynx")) {
			paintPrice = 90000.00;
		}else if(paintColor.equalsIgnoreCase("Blu Eleos")){
			paintPrice = 350000.00;
		}else if(paintColor.equalsIgnoreCase("Grigio Nimbus")) {
			paintPrice = 10000.00;
		}else if(paintColor.equalsIgnoreCase("Rosso Mars")) {
			paintPrice = 25000.00;
		}else if(paintColor.equalsIgnoreCase("Rosso Anteros")){
			paintPrice = 10330.00;
		}else {
			paintPrice = 00.00;
		}
		return paintPrice;
	}
	
	
	
	

}
