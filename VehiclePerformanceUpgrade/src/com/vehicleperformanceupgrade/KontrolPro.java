package com.vehicleperformanceupgrade;

public class KontrolPro extends Suspensions {

	private double price;
	private String manufacturer = "KSport";

	
	@Override
	protected double getPrice(String type) {
		
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("AVENTADOR SVJ COUPE")){
			price = 380200.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR SVJ ROADSTER")){
    		price = 380300.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S ROADSTER")){
    		price = 370900.00;
    	} else if(type.equalsIgnoreCase("AVENTADOR S COUPE")){
    		price = 370800.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO SPYDER")){
    		price = 370750.00;
    	} else if(type.equalsIgnoreCase("HURACUN EVO")){
    		price = 370600.00;
    	} else if(type.equalsIgnoreCase("HURACUN COUPE")){
    		price = 360500.00;
    	} else if(type.equalsIgnoreCase("HURACUN SPYDER")){
    		price = 350500.00;
    	} else if(type.equalsIgnoreCase("HURACUN PERFOMANTE COUPE SPYDER")){
    		price = 350200.00;
    	} else if(type.equalsIgnoreCase("URUS")) {
    		price = 390950.00;
		} else {
    		return 00.00;
    	}
		return price;
		
	}

	

	@Override
	public String displayDetails(String type) {
		// TODO Auto-generated method stub
		return "Suspensions Type  :  KSport® - Kontrol Pro™ Coilover Kit\t"
				+ "Manufacture  :  "+manufacturer+"  Cost : "+getPrice(type);
	}
}
