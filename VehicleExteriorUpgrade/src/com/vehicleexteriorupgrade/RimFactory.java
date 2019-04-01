package com.vehicleexteriorupgrade;

public class RimFactory {
	
	public Rim getRim(String type){
		  String a = type.substring(0,4);
		
	      if(a == null){
	         return null;
	      }		
	      if(a.equalsIgnoreCase("AVEN")){
	         return new AventadorRims();
	         
	      } else if(a.equalsIgnoreCase("HURA")){
	         return new HuracanRim();
	         
	      } else if(a.equalsIgnoreCase("URUS")){
	         return new UrusRim();
	      }
	      
	      return null;
	   }
}
