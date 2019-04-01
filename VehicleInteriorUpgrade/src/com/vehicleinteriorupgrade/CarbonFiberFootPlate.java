package com.vehicleinteriorupgrade;

public class CarbonFiberFootPlate extends Floormats {

	private double price;
	private String manufacturer = "Lamoi Interior Designers";

	
	@Override
	protected double getPrice(String type) {
		
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("AVENTADOR SVJ COUPE")){
			price = 22000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR SVJ ROADSTER")){
    		price = 23000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S ROADSTER")){
    		price = 19000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S COUPE")){
    		price = 18000.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO SPYDER")){
    		price = 17500.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO")){
    		price = 16000.00;
    	} else if(type.equalsIgnoreCase("HURACUN COUPE")){
    		price = 15000.00;
    	} else if(type.equalsIgnoreCase("HURACUN SPYDER")){
    		price = 15000.00;
    	} else if(type.equalsIgnoreCase("HURACUN PERFOMANTE COUPE SPYDER")){
    		price = 20200.00;
    	} else if(type.equalsIgnoreCase("URUS")) {
    		price = 29500.00;
		} else {
    		return 00.00;
    	}
		return price;
		
	}

	

	@Override
	public String displayDetails(String type) {
		// TODO Auto-generated method stub
		return "Floormat Type  :  CarbonFiber \t\t"
				+ "Manufacture  :  "+manufacturer+"  Cost : "+getPrice(type);
	}
}
