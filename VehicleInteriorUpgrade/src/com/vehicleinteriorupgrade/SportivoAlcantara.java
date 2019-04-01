package com.vehicleinteriorupgrade;

public class SportivoAlcantara extends SpecialTrim {

	private double price;
	private String manufacturer = "Lamoi Interior Designers";

	
	@Override
	protected double getPrice(String type) {
		
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("AVENTADOR SVJ COUPE")){
			price = 222000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR SVJ ROADSTER")){
    		price = 223000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S ROADSTER")){
    		price = 129000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S COUPE")){
    		price = 128000.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO SPYDER")){
    		price = 127500.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO")){
    		price = 126000.00;
    	} else if(type.equalsIgnoreCase("HURACUN COUPE")){
    		price = 125000.00;
    	} else if(type.equalsIgnoreCase("HURACUN SPYDER")){
    		price = 125000.00;
    	} else if(type.equalsIgnoreCase("HURACUN PERFOMANTE COUPE SPYDER")){
    		price = 220200.00;
    	} else if(type.equalsIgnoreCase("URUS")) {
    		price = 229500.00;
		} else {
    		return 00.00;
    	}
		return price;
		
	}

	

	@Override
	public String displayDetails(String type) {
		// TODO Auto-generated method stub
		return "Special Trim Type  :  SportivoAlcantara \t"
				+ "Manufacture  :  "+manufacturer+"  Cost : "+getPrice(type);
	}
}
