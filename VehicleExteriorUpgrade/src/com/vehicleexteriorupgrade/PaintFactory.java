package com.vehicleexteriorupgrade;

public class PaintFactory {
	
	public Paint getPaint(String paintType){
		  String a = paintType.substring(0,4);
		
	      if(a == null){
	         return null;
	      }		
	      if(a.equalsIgnoreCase("AVEN")){
	         return new AventadorPaintColor();
	         
	      } else if(a.equalsIgnoreCase("HURA")){
	         return new HuracanPaintColor();
	         
	      } else if(a.equalsIgnoreCase("URUS")){
	         return new UrusPaintColor();
	      }
	      
	      return null;
	   }
}
