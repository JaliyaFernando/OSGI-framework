package com.vehicleinteriorupgrade;

public class NeroAde extends MainColor {
	private double price;
	private String manufacturer = "Lam Paints";

	
	@Override
	protected double getPrice(String type) {
		
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("AVENTADOR SVJ COUPE")){
			price = 220000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR SVJ ROADSTER")){
    		price = 230000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S ROADSTER")){
    		price = 190000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S COUPE")){
    		price = 180000.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO SPYDER")){
    		price = 175000.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO")){
    		price = 160000.00;
    	} else if(type.equalsIgnoreCase("HURACUN COUPE")){
    		price = 150000.00;
    	} else if(type.equalsIgnoreCase("HURACUN SPYDER")){
    		price = 150000.00;
    	} else if(type.equalsIgnoreCase("HURACUN PERFOMANTE COUPE SPYDER")){
    		price = 202000.00;
    	} else if(type.equalsIgnoreCase("URUS")) {
    		price = 295000.00;
		} else {
    		return 00.00;
    	}
		return price;
		
	}

	

	@Override
	public String displayDetails(String type) {
		// TODO Auto-generated method stub
		return "MainColor Type  :  NeroAde \t\t"
				+ "Manufacture  :  "+manufacturer+"  Cost : "+getPrice(type);
	}
}
