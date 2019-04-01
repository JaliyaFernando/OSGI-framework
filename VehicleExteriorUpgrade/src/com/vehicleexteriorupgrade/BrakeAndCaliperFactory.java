package com.vehicleexteriorupgrade;

public class BrakeAndCaliperFactory {
	public BrakeAndCaliper getBrakeAndCaliper(String type){
		  String a = type.substring(0,4);
		
	      if(a == null){
	         return null;
	      }		
	      if(a.equalsIgnoreCase("AVEN")){
	         return new AventadorBrakeAndCaliper();
	         
	      } else if(a.equalsIgnoreCase("HURA")){
	         return new HuracanBrakeAndCaliper();
	         
	      } else if(a.equalsIgnoreCase("URUS")){
	         return new UrusBrakeAndCaliper();
	      }
	      
	      return null;
	   }
}
