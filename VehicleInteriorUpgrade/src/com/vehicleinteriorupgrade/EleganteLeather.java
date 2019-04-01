package com.vehicleinteriorupgrade;

public class EleganteLeather extends SpecialTrim {

	private double price;
	private String manufacturer = "Lamoi Interior Designers";

	
	@Override
	protected double getPrice(String type) {
		
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("AVENTADOR SVJ COUPE")){
			price = 200000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR SVJ ROADSTER")){
    		price = 200000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S ROADSTER")){
    		price = 19000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S COUPE")){
    		price = 100000.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO SPYDER")){
    		price = 100500.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO")){
    		price = 100000.00;
    	} else if(type.equalsIgnoreCase("HURACUN COUPE")){
    		price = 100000.00;
    	} else if(type.equalsIgnoreCase("HURACUN SPYDER")){
    		price = 100000.00;
    	} else if(type.equalsIgnoreCase("HURACUN PERFOMANTE COUPE SPYDER")){
    		price = 200200.00;
    	} else if(type.equalsIgnoreCase("URUS")) {
    		price = 200500.00;
		} else {
    		return 00.00;
    	}
		return price;
		
	}

	

	@Override
	public String displayDetails(String type) {
		// TODO Auto-generated method stub
		return "Special Trim Type  :  EleganteLeather \t\t"
				+ "Manufacture  :  "+manufacturer+"  Cost : "+getPrice(type);
	}
}
