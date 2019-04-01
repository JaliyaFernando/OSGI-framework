package com.vehicleinteriorupgrade;

public class FullyElectricalHeatedComfortSetats extends Seats {

	private double price;
	private String manufacturer = "Race Electro";

	
	@Override
	protected double getPrice(String type) {
		
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("AVENTADOR SVJ COUPE")){
			price = 482000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR SVJ ROADSTER")){
    		price = 483000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S ROADSTER")){
    		price = 489000.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S COUPE")){
    		price = 488000.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO SPYDER")){
    		price = 387500.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO")){
    		price = 386000.00;
    	} else if(type.equalsIgnoreCase("HURACUN COUPE")){
    		price = 285000.00;
    	} else if(type.equalsIgnoreCase("HURACUN SPYDER")){
    		price = 285000.00;
    	} else if(type.equalsIgnoreCase("HURACUN PERFOMANTE COUPE SPYDER")){
    		price = 20200.00;
    	} else if(type.equalsIgnoreCase("URUS")) {
    		price = 629500.00;
		} else {
    		return 00.00;
    	}
		return price;
		
	}

	

	@Override
	public String displayDetails(String type) {
		// TODO Auto-generated method stub
		return "Seats Type  :  FullyElectrical with HeatedComfortSetats \t"
				+ "Manufacture  :  "+manufacturer+"  Cost : "+getPrice(type);
	}
}
