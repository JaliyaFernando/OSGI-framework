package com.vehicleinteriorupgrade;

public class RossaAlala extends MainColor {
	private double price;
	private String manufacturer = "Lam Paints";

	
	@Override
	protected double getPrice(String type) {
		
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("AVENTADOR SVJ COUPE")){
			price = 270000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR SVJ ROADSTER")){
    		price = 250000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S ROADSTER")){
    		price = 200000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S COUPE")){
    		price = 190000.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO SPYDER")){
    		price = 170000.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO")){
    		price = 160000.00;
    	} else if(type.equalsIgnoreCase("HURACUN COUPE")){
    		price = 155000.00;
    	} else if(type.equalsIgnoreCase("HURACUN SPYDER")){
    		price = 155000.00;
    	} else if(type.equalsIgnoreCase("HURACUN PERFOMANTE COUPE SPYDER")){
    		price = 200000.00;
    	} else if(type.equalsIgnoreCase("URUS")) {
    		price = 300000.00;
		} else {
    		return 00.00;
    	}
		return price;
		
	}

	

	@Override
	public String displayDetails(String type) {
		// TODO Auto-generated method stub
		return "MainColor Type  :  RossaAlala \t"
				+ "Manufacture  :  "+manufacturer+"  Cost : "+getPrice(type);
	}
}
