package com.vehiclebodyupgrade;

public class Wing extends Body {
	private double price;
	private String manufacturer = "AVTW Carbon";

	@Override
	double getPrice(String type) {
		if(type.equalsIgnoreCase("AVENTADOR SVJ COUPE")){
			price = 2703000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR SVJ ROADSTER")){
    		price = 2504000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S ROADSTER")){
    		price = 2001000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S COUPE")){
    		price = 1906000.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO SPYDER")){
    		price = 1770000.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO")){
    		price = 1660000.00;
    	} else if(type.equalsIgnoreCase("HURACUN COUPE")){
    		price = 1530000.00;
    	} else if(type.equalsIgnoreCase("HURACUN SPYDER")){
    		price = 1570000.00;
    	} else if(type.equalsIgnoreCase("HURACUN PERFOMANTE COUPE SPYDER")){
    		price = 2060000.00;
    	} else if(type.equalsIgnoreCase("URUS")) {
    		price = 3090000.00;
		} else {
    		return 00.00;
    	}
		return price;
	}

	@Override
	String displayDetails(String type) {
		return "Upgrade Wing Type 1 - Fully Carbon Rear Wing \t"
				+ "Manufacture :"+manufacturer+" Cost : "+getPrice(type);
	}

}
