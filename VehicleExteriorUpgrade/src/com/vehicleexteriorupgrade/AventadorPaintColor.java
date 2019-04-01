package com.vehicleexteriorupgrade;

import java.util.Scanner;

public class AventadorPaintColor extends Paint{
	Scanner input = new Scanner(System.in); 
	String model = "AVENTADOR";
	@Override
	String getPaintDetails() {
		System.out.println("     ***** Select Your Paint Color *****     ");
		System.out.println("--------------------SOLID----------------------");
		System.out.println("(1)Nero Aldebaran");
		System.out.println("(2)Bianco Isi");
		System.out.println("(3)Giallo Spica");
		System.out.println("(4)Giallo Evros");
		System.out.println("(5)Blu Glauco");
		System.out.println("--------------------METALLIC-------------------");
		System.out.println("(6)Nero Pegaso");
		System.out.println("(7)Grigio Antares");
		System.out.println("(8)Grigio Estoque");
		System.out.println("(9)Grigio Lynx");
		System.out.println("--------------------SPECIAL METALLIC-----------");
		System.out.println("(10)Blu Nila");
		System.out.println("(11)Rosso Efesto");
		System.out.println("----------------------------------------------");

		System.out.print("Input your Color Number:");
		int color = input.nextInt();
		
		if(color == 1) {
			return "Nero Aldebaran";
		}else if(color == 2) {
			return "Bianco Isi";
		}else if(color == 3) {
			return "Giallo Spica";
		}else if(color == 4) {
			return "Giallo Evros";
		}else if(color == 5) {
			return "Blu Glauco";
		}else if(color == 6) {
			return "Nero Pegaso";
		}else if(color == 7) {
			return "Grigio Antares";
		}else if(color == 8 ){
			return "Grigio Estoque";
		}else if(color == 9) {
			return "Grigio Lynx";
		}else if(color == 10) {
			return "Blu Nila";
		}else if(color == 11 ){
			return "Rosso Efesto";
		}else {
			return "error";
		}
	}
	@Override
	double getPaintPrice(String paintColor) {
		// TODO Auto-generated method stub
		double paintPrice;
		if(paintColor.equalsIgnoreCase("Nero Aldebaran")) {
			paintPrice = 13000.00;
		}else if(paintColor.equalsIgnoreCase("Bianco Isi")) {
			paintPrice = 10600.00;
		}else if(paintColor.equalsIgnoreCase("Giallo Spica")) {
			paintPrice = 20700.00;
		}else if(paintColor.equalsIgnoreCase("Giallo Evros")) {
			paintPrice = 80600.00;
		}else if(paintColor.equalsIgnoreCase("Blu Glauco")) {
			paintPrice = 60300.00;
		}else if(paintColor.equalsIgnoreCase("Nero Pegaso")) {
			paintPrice = 50400.00;
		}else if(paintColor.equalsIgnoreCase("Grigio Antares")) {
			paintPrice = 90200.00;
		}else if(paintColor.equalsIgnoreCase("Grigio Estoque")){
			paintPrice = 363000.00;
		}else if(paintColor.equalsIgnoreCase("Grigio Lynx")) {
			paintPrice = 10400.00;
		}else if(paintColor.equalsIgnoreCase("Blu Nila")) {
			paintPrice = 25100.00;
		}else if(paintColor.equalsIgnoreCase("Rosso Efesto")){
			paintPrice = 11630.00;
		}else {
			paintPrice = 00.00;
		}
		return paintPrice;
	}

}
