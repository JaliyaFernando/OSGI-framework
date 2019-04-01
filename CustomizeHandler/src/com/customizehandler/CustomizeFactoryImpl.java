package com.customizehandler;

import java.util.Scanner;

public class CustomizeFactoryImpl implements CustomizeFactory{
	int carType;
	Scanner input = new Scanner(System.in); 
	@Override
	public String selectCar() {
		
		System.out.println("     ***** Customize your Lambo *****     ");
		System.out.println("------------------------------------------");
		System.out.println("         Type 1 - Lambogini AVENTADOR");
		System.out.println("         Type 2 - Lambogini HURACAN");
		System.out.println("         Type 3 - Lambogini URUS");
		System.out.println("------------------------------------------");
		
		System.out.print("Please Enter the type : ");
	
	    int type = input.nextInt(); 

	    if(type == 1) {
	    	  
	    	System.out.println("     ***** Select AVENTADOR Type *****     ");
	  		System.out.println("------------------------------------------");
	  		System.out.println("         Type 1 - SVJ COUPE");
	  		System.out.println("         Type 2 - SVJ ROADSTER");
	  		System.out.println("         Type 3 - S ROADSTER");
	  		System.out.println("         Type 4 - S COUPE");
	  		System.out.println("------------------------------------------");
	  		System.out.print("Please Enter the type : ");
	  		carType = input.nextInt();
	  		
	    	if(carType == 1) {
	    		return "AVENTADOR SVJ COUPE";
	    	} else if(carType == 2) {
	    		return "AVENTADOR SVJ ROADSTER";
	    	} else if(carType == 3) {
	    		return "AVENTADOR S ROADSTER";
	    	} else if(carType == 4) {
	    		return "AVENTADOR S COUPE";
	    	} else {
	    		return "error";
	    	}
	    	  

	    }else if(type == 2){
	    	
	    	System.out.println("     ***** Select HURACUN Type *****     ");
	  		System.out.println("------------------------------------------");
	  		System.out.println("         Type 1 - EVO SPYDER");
	  		System.out.println("         Type 2 - EVO");
	  		System.out.println("         Type 3 - COUPE");
	  		System.out.println("         Type 4 - SPYDER");
	  		System.out.println("         Type 5 - PERFOMANTE COUPE SPYDER");
	  		System.out.println("------------------------------------------");
	  		System.out.print("Please Enter the type : ");
	  		carType = input.nextInt();  
	  		
	  		if(carType == 1) {
	    		return "HURACUN EVO SPYDER";
	    	} else if(carType == 2) {
	    		return "HURACUN EVO";
	    	} else if(carType == 3) {
	    		return "HURACUN COUPE";
	    	} else if(carType == 4) {
	    		return "HURACUN SPYDER";
	    	} else if(carType == 5) {
	    		return "HURACUN PERFOMANTE COUPE SPYDER";
	    	} else {
	    		return "error";
	    	}
	  		
	  		
	  		
	  		
	
	    }else if(type == 3){
	    	  return "URUS";
	    }else {
	    	  return "error";
	    }
		
	}



	
}
