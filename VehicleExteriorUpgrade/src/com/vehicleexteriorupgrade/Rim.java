package com.vehicleexteriorupgrade;

public abstract class Rim {
	RimFactory rm = new RimFactory();
	
	
	abstract String getRimDetails();
	abstract double getRimtPrice(String rimType);
	
	String getSelectedRimDetails(Rim r,String rimType) {

		return "Rim :"+rimType+" \t"
				+ "  Cost : "+r.getRimtPrice(rimType);
		
		
	}
}
