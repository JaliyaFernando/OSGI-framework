package com.vehiclebodyupgrade;

public class RacingBodyKit extends BodyKit{
	private double price;
	private String manufacturer = "AVT Carbon";

	
	@Override
	protected double getPrice(String type) {
		
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("AVENTADOR SVJ COUPE")){
			price = 2700000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR SVJ ROADSTER")){
    		price = 2500000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S ROADSTER")){
    		price = 2000000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S COUPE")){
    		price = 1900000.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO SPYDER")){
    		price = 1700000.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO")){
    		price = 1600000.00;
    	} else if(type.equalsIgnoreCase("HURACUN COUPE")){
    		price = 1550000.00;
    	} else if(type.equalsIgnoreCase("HURACUN SPYDER")){
    		price = 1550000.00;
    	} else if(type.equalsIgnoreCase("HURACUN PERFOMANTE COUPE SPYDER")){
    		price = 2000000.00;
    	} else if(type.equalsIgnoreCase("URUS")) {
    		price = 3000000.00;
		} else {
    		return 00.00;
    	}
		return price;
		
	}

	

	@Override
	public String displayDetails(String type) {
		// TODO Auto-generated method stub
		return "Upgrade Body Type 2 - Fully Carbon Racing body kit \t"
				+ "Manufacture :"+manufacturer+"  Cost : "+getPrice(type);
	}

	

}
