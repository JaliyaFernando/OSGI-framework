package com.vehicleinteriorupgrade;

public class MultifunctionAlacantaraLeather extends SteeringWheel {

	private double price;
	private String manufacturer = "Lamoi Interior Designers";

	
	@Override
	protected double getPrice(String type) {
		
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("AVENTADOR SVJ COUPE")){
			price = 282000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR SVJ ROADSTER")){
    		price = 283000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S ROADSTER")){
    		price = 189000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S COUPE")){
    		price = 188000.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO SPYDER")){
    		price = 187500.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO")){
    		price = 186000.00;
    	} else if(type.equalsIgnoreCase("HURACUN COUPE")){
    		price = 185000.00;
    	} else if(type.equalsIgnoreCase("HURACUN SPYDER")){
    		price = 185000.00;
    	} else if(type.equalsIgnoreCase("HURACUN PERFOMANTE COUPE SPYDER")){
    		price = 280200.00;
    	} else if(type.equalsIgnoreCase("URUS")) {
    		price = 279500.00;
		} else {
    		return 00.00;
    	}
		return price;
		
	}

	

	@Override
	public String displayDetails(String type) {
		// TODO Auto-generated method stub
		return "SteeringWheel Type  :  Multifunction (Alacantara with smooth Leather) \t"
				+ "Manufacture  :  "+manufacturer+"  Cost : "+getPrice(type);
	}
}
