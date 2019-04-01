package com.vehicleinteriorupgrade;

public class AlcantaraLeatherSteering extends SteeringWheel {

	private double price;
	private String manufacturer = "Lamoi Interior Designers";

	
	@Override
	protected double getPrice(String type) {
		
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("AVENTADOR SVJ COUPE")){
			price = 192000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR SVJ ROADSTER")){
    		price = 183000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S ROADSTER")){
    		price = 179000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S COUPE")){
    		price = 168000.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO SPYDER")){
    		price = 157500.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO")){
    		price = 146000.00;
    	} else if(type.equalsIgnoreCase("HURACUN COUPE")){
    		price = 125000.00;
    	} else if(type.equalsIgnoreCase("HURACUN SPYDER")){
    		price = 125000.00;
    	} else if(type.equalsIgnoreCase("HURACUN PERFOMANTE COUPE SPYDER")){
    		price = 130200.00;
    	} else if(type.equalsIgnoreCase("URUS")) {
    		price = 189500.00;
		} else {
    		return 00.00;
    	}
		return price;
		
	}

	

	@Override
	public String displayDetails(String type) {
		// TODO Auto-generated method stub
		return "SteeringWheel Type  :  Alacantara with smooth Leather \t\t\t"
				+ "Manufacture  :  "+manufacturer+"  Cost : "+getPrice(type);
	}
}
