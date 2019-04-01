package com.vehicleexteriorupgrade;

public abstract class BrakeAndCaliper {
	
	BrakeAndCaliperFactory bf = new BrakeAndCaliperFactory();
	
	
	abstract String getBrakeAndCaliperDetails();
	abstract double getBrakeAndCalipertPrice(String type);
	
	String getSelectedBrakeAndCaliperDetails(BrakeAndCaliper bk,String type) {

		return "Brake And Calliper :"+type+" \t"
				+ "  Cost : "+bk.getBrakeAndCalipertPrice(type);
		
		
	}
}
