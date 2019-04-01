package com.vehicleperformanceupgrade;

public class LamboPerformance extends Brakes {

	private double price;
	private String manufacturer = "LAMBORGHINI Performance";

	
	@Override
	protected double getPrice(String type) {
		
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("AVENTADOR SVJ COUPE")){
			price = 420200.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR SVJ ROADSTER")){
    		price = 420300.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S ROADSTER")){
    		price = 410900.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S COUPE")){
    		price = 410800.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO SPYDER")){
    		price = 410750.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO")){
    		price = 410600.00;
    	} else if(type.equalsIgnoreCase("HURACUN COUPE")){
    		price = 410500.00;
    	} else if(type.equalsIgnoreCase("HURACUN SPYDER")){
    		price = 410500.00;
    	} else if(type.equalsIgnoreCase("HURACUN PERFOMANTE COUPE SPYDER")){
    		price = 420200.00;
    	} else if(type.equalsIgnoreCase("URUS")) {
    		price = 420950.00;
		} else {
    		return 00.00;
    	}
		return price;
		
	}

	

	@Override
	public String displayDetails(String type) {
		// TODO Auto-generated method stub
		return "Brakes Type  :  Performance LAMBORGHINI OEM 470615105P \t"
				+ "Manufacture  :  "+manufacturer+"  Cost : "+getPrice(type);
	}
}
