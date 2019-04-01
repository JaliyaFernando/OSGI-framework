package com.vehicleperformanceupgrade;

public class Wilwood extends Brakes {

	private double price;
	private String manufacturer = "Wilwood Pvt Ltd";

	
	@Override
	protected double getPrice(String type) {
		
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("AVENTADOR SVJ COUPE")){
			price = 220200.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR SVJ ROADSTER")){
    		price = 220300.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S ROADSTER")){
    		price = 210900.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S COUPE")){
    		price = 210800.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO SPYDER")){
    		price = 210750.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO")){
    		price = 210600.00;
    	} else if(type.equalsIgnoreCase("HURACUN COUPE")){
    		price = 210500.00;
    	} else if(type.equalsIgnoreCase("HURACUN SPYDER")){
    		price = 210500.00;
    	} else if(type.equalsIgnoreCase("HURACUN PERFOMANTE COUPE SPYDER")){
    		price = 220200.00;
    	} else if(type.equalsIgnoreCase("URUS")) {
    		price = 220950.00;
		} else {
    		return 00.00;
    	}
		return price;
		
	}

	

	@Override
	public String displayDetails(String type) {
		// TODO Auto-generated method stub
		return "Brakes Type  :  Midget GP320 Caliper Brake Kit\t\t"
				+ "Manufacture  :  "+manufacturer+"  Cost : "+getPrice(type);
	}
}
