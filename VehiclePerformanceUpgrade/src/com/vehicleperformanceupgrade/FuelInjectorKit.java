package com.vehicleperformanceupgrade;

public class FuelInjectorKit extends FuelInjectors {

	private double price;
	private String manufacturer = "Injector Dynamics";

	
	@Override
	protected double getPrice(String type) {
		
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("AVENTADOR SVJ COUPE")){
			price = 1320200.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR SVJ ROADSTER")){
    		price = 130300.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S ROADSTER")){
    		price = 130900.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S COUPE")){
    		price = 130800.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO SPYDER")){
    		price = 130750.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO")){
    		price = 130600.00;
    	} else if(type.equalsIgnoreCase("HURACUN COUPE")){
    		price = 130500.00;
    	} else if(type.equalsIgnoreCase("HURACUN SPYDER")){
    		price = 130500.00;
    	} else if(type.equalsIgnoreCase("HURACUN PERFOMANTE COUPE SPYDER")){
    		price = 130200.00;
    	} else if(type.equalsIgnoreCase("URUS")) {
    		price = 130950.00;
		} else {
    		return 00.00;
    	}
		return price;
		
	}	

	@Override
	public String displayDetails(String type) {
		// TODO Auto-generated method stub
		return "FuelInjectors Type  :  Injector Dynamics® - ID1300 Fuel Injector Kit\t"
				+ "Manufacture  :  "+manufacturer+"  Cost : "+getPrice(type);
	}
}
