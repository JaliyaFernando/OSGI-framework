package com.vehicleinteriorupgrade;

public class BluAmon extends MainColor {
	private double price;
	private String manufacturer = "Lam Paints";

	
	@Override
	protected double getPrice(String type) {
		
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("AVENTADOR SVJ COUPE")){
			price = 220000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR SVJ ROADSTER")){
    		price = 210000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S ROADSTER")){
    		price = 200000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S COUPE")){
    		price = 180000.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO SPYDER")){
    		price = 160000.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO")){
    		price = 150000.00;
    	} else if(type.equalsIgnoreCase("HURACUN COUPE")){
    		price = 145000.00;
    	} else if(type.equalsIgnoreCase("HURACUN SPYDER")){
    		price = 135000.00;
    	} else if(type.equalsIgnoreCase("HURACUN PERFOMANTE COUPE SPYDER")){
    		price = 150000.00;
    	} else if(type.equalsIgnoreCase("URUS")) {
    		price = 280000.00;
		} else {
    		return 00.00;
    	}
		return price;
		
	}

	

	@Override
	public String displayDetails(String type) {
		// TODO Auto-generated method stub
		return "MainColor Type  :  BluAmon \t\t"
				+ "Manufacture  :  "+manufacturer+"  Cost : "+getPrice(type);
	}
}
