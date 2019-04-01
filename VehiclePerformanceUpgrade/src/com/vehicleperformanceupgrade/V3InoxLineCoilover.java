package com.vehicleperformanceupgrade;

public class V3InoxLineCoilover extends Suspensions {

	private double price;
	private String manufacturer = "KW Suspensions";

	
	@Override
	protected double getPrice(String type) {
		
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("AVENTADOR SVJ COUPE")){
			price = 320200.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR SVJ ROADSTER")){
    		price = 320300.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S ROADSTER")){
    		price = 310900.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S COUPE")){
    		price = 310800.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO SPYDER")){
    		price = 310750.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO")){
    		price = 310600.00;
    	} else if(type.equalsIgnoreCase("HURACUN COUPE")){
    		price = 310500.00;
    	} else if(type.equalsIgnoreCase("HURACUN SPYDER")){
    		price = 310500.00;
    	} else if(type.equalsIgnoreCase("HURACUN PERFOMANTE COUPE SPYDER")){
    		price = 320200.00;
    	} else if(type.equalsIgnoreCase("URUS")) {
    		price = 320950.00;
		} else {
    		return 00.00;
    	}
		return price;
		
	}

	

	@Override
	public String displayDetails(String type) {
		// TODO Auto-generated method stub
		return "Suspensions Type  :  V3 InoxLine Coilover Lowering Kit\t"
				+ "Manufacture  :  "+manufacturer+"  Cost : "+getPrice(type);
	}
}