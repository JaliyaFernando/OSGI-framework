package com.vehicleinteriorupgrade;

public class AlacantaraSteering extends SteeringWheel {

	private double price;
	private String manufacturer = "Lamoi Interior Designers";

	
	@Override
	protected double getPrice(String type) {
		
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("AVENTADOR SVJ COUPE")){
			price = 182000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR SVJ ROADSTER")){
    		price = 173000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S ROADSTER")){
    		price = 159000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S COUPE")){
    		price = 148000.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO SPYDER")){
    		price = 137500.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO")){
    		price = 126000.00;
    	} else if(type.equalsIgnoreCase("HURACUN COUPE")){
    		price = 115000.00;
    	} else if(type.equalsIgnoreCase("HURACUN SPYDER")){
    		price = 105000.00;
    	} else if(type.equalsIgnoreCase("HURACUN PERFOMANTE COUPE SPYDER")){
    		price = 120200.00;
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
		return "SteeringWheel Type  :  Alcantara \t\t\t\t\t"
				+ "Manufacture  :  "+manufacturer+"  Cost : "+getPrice(type);
	}
}
